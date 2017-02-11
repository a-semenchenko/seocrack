package org.seocrack.parser;

import lombok.Getter;

/**
 * Created by meqqee on 04.02.2017.
 */
@Getter
public class YandexXMLPositionsParser {

    private static final String YA_PATH = "https://yandex.ru/search/xml?user=";
    private static final String ENCODING = "";

    private String user;
    private String xmlKey;
    private String region;
    private String resultsOnPage;

    public YandexXMLPositionsParser(String user, String xmlKey, String region, String resultsOnPage) {
        this.user = user;
        this.xmlKey = xmlKey;
        this.region = region;
        this.resultsOnPage = resultsOnPage;
    }

    private String buildUrl() {
        //String.isN
        return null;
    }
}
