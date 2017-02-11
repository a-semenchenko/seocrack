package org.seocrack.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

/**
 * Created by meqqee on 01.02.2017.
 */
public class SiteParser implements Parser {
    public Document parseSinglePage(String url) {
        try {
           return Jsoup.connect(url).get();
        } catch (IOException e) {
            return null;
        }
    }

    public Map<String, Document> parseWholeSite(String url) {
        return null;
    }
}
