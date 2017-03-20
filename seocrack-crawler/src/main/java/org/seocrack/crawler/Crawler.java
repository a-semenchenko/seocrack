package org.seocrack.crawler;

import lombok.Getter;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.seocrack.crawler.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * Created by meqqee on 12.02.2017.
 */
public class Crawler implements Runnable {

    @Autowired
    private Configuration configuration;

    @Autowired
    private ConnectionsHolder connectionsHolder;

    @Autowired
    private DocumentProcessor documentProcessor;

    /**
     * Идентификатор краулера для разделения потоков
     */
    @Getter
    private int id;

    public void init(int id) {
        this.id = id;
    }

    public Document connect(String url) {
        Connection connection = Jsoup.connect(url);
        try {
            return connection.get();
        } catch (IOException e) {
            connectionsHolder.add(connection);
        }

        return null;
    }

    public void run() {

    }
}
