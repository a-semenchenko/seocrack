package org.seocrack.crawler;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import lombok.Getter;
import org.apache.http.Header;
import org.seocrack.crawler.business.api.WebLinkBusinessService;
import org.seocrack.crawler.business.api.WebPageBusinessService;
import org.seocrack.crawler.entities.WebLink;
import org.seocrack.crawler.entities.WebPage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by meqqee on 12.02.2017.
 */
public class Crawler extends WebCrawler {

    @Autowired
    private WebPageBusinessService webPageBusinessService;

    @Autowired
    private WebLinkBusinessService webLinkBusinessService;

    private List<WebPage> pages = new ArrayList<>();

    /**
     * Идентификатор краулера для разделения потоков
     */
    @Getter
    private int id;

    private static final Pattern IMAGE_EXTENSIONS = Pattern.compile(".*\\.(bmp|gif|jpg|png)$");

    @Override
    public boolean shouldVisit(Page referringPage, WebURL url) {
        String href = url.getURL().toLowerCase();
        // Ignore the url if it has an extension that matches our defined set of image extensions.
        if (IMAGE_EXTENSIONS.matcher(href).matches()) {
            return false;
        }

        // Only accept the url if it is in the "www.ics.uci.edu" domain and protocol is "http".
        return href.startsWith("http://st-lt.ru/");
    }

    /**
     * This function is called when a page is fetched and ready to be processed
     * by your program.
     */
    @Override
    public void visit(Page pageLib) {
        int docid = pageLib.getWebURL().getDocid();
        //String url = pageLib.getWebURL().getURL();
        String domain = pageLib.getWebURL().getDomain();
        String path = pageLib.getWebURL().getPath();
        String subDomain = pageLib.getWebURL().getSubDomain();
        String parentUrl = pageLib.getWebURL().getParentUrl();
        String anchor = pageLib.getWebURL().getAnchor();

        logger.debug("Docid: {}", docid);
        //logger.info("URL: {}", url);
        logger.debug("Domain: '{}'", domain);
        logger.debug("Sub-domain: '{}'", subDomain);
        logger.debug("Path: '{}'", path);
        logger.debug("Parent page: {}", parentUrl);
        logger.debug("Anchor text: {}", anchor);

        if (pageLib.getParseData() instanceof HtmlParseData) {
            WebPage webPage = new WebPage();

            HtmlParseData htmlParseData = (HtmlParseData) pageLib.getParseData();
            String text = htmlParseData.getText();
            String html = htmlParseData.getHtml();
            Set<WebURL> links = htmlParseData.getOutgoingUrls();
            webPage.setTitle(htmlParseData.getTitle());
            webPage.setDescription(htmlParseData.getMetaTagValue("description"));
            webPage.setKeywords(htmlParseData.getMetaTagValue("keywords"));
            webPage.setUrl(pageLib.getWebURL().getURL());
            for (WebURL url : htmlParseData.getOutgoingUrls()) {
                WebLink link = new WebLink();
                link.setAnchor(url.getAnchor());
                link.setHref(url.getURL());
                if (url.getAttribute("rel").equals("nofollow"))
                    link.setDoFollow(false);
                else
                    link.setDoFollow(true);
                webPage.addOutLink(link);
                link.setWebPage(webPage);
            }
            pages.add(webPage);
            webPageBusinessService.addPage(webPage);

            logger.debug("Text length: {}", text.length());
            logger.debug("Html length: {}", html.length());
            logger.debug("Number of outgoing links: {}", links.size());
        }

        Header[] responseHeaders = pageLib.getFetchResponseHeaders();
        if (responseHeaders != null) {
            logger.debug("Response headers:");
            for (Header header : responseHeaders) {
                logger.debug("\t{}: {}", header.getName(), header.getValue());
            }
        }

        logger.debug("=============");
    }
}
