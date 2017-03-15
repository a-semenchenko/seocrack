package org.seocrack.crawler;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.seocrack.crawler.entities.Page;
import org.seocrack.entities.Link;

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
     * @return {@link org.seocrack.crawler.entities.Page}
     */
    public Page processPage() {
        Page page = new Page();

        page.setTitle(document.title());

        return page;
    }

    /**
     * Обработчик ссылок
     * @return коллекция объектов {@link org.seocrack.entities.Link}
     */
    public List<Link> processLinks() {
        Elements elements = document.getElementsByTag("a");
        List<Link> result = new ArrayList<Link>();

        for (Element element : elements) {
            Link link = new Link();
            link.setAnchor(element.text());
            link.setHref(element.attr("href"));
            link.setDoFollow(isDoFollow(element));

            result.add(link);
        }

        return result;
    }

    private boolean isDoFollow(Element link) {
        return !(link.attr("rel").equalsIgnoreCase("nofollow"));
    }
}
