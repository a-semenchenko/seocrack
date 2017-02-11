package org.seocrack.parser;

import org.jsoup.nodes.Document;

import java.util.Map;

/**
 * Created by meqqee on 01.02.2017.
 */
public interface Parser {
    Document parseSinglePage(String url);
    Map<String, Document> parseWholeSite(String url);
}
