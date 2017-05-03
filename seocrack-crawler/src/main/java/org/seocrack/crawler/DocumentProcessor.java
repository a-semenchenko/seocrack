package org.seocrack.crawler;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.seocrack.crawler.entities.WebLink;
import org.seocrack.crawler.entities.WebPage;

import java.util.ArrayList;
import java.util.List;

/**
 * Обработчик документов
 * Created by meqqee on 16.02.2017.
 */
public class DocumentProcessor {
    private Document document = null;

    public DocumentProcessor(Document document) {
        this.document = document;
    }

    /**
     * Обработчик документа
     * Собирает основные данные о документе
     * @return {@link WebPage}
     */
    public WebPage processPage() {
        WebPage webPage = new WebPage();

        webPage.setTitle(document.title());

        return webPage;
    }

    /**
     * Обработчик ссылок
     * @return коллекция объектов {@link WebLink}
     */
    public List<WebLink> processLinks() {
        Elements elements = document.getElementsByTag("a");
        List<WebLink> result = new ArrayList<WebLink>();

        for (Element element : elements) {
            WebLink webLink = new WebLink();
            webLink.setAnchor(element.text());
            webLink.setHref(element.attr("href"));
            webLink.setDoFollow(isDoFollow(element));

            result.add(webLink);
        }

        return result;
    }

    private boolean isDoFollow(Element link) {
        return !(link.attr("rel").equalsIgnoreCase("nofollow"));
    }
}
