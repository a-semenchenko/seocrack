package org.seocrack.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.List;

/**
 * Created by meqqee on 30.01.2017.
 */
@Data
public class Page {
    @Id
    private long id;
    private List<Keyword> relevantKeywords;
    private String url;
    private String charSet;
    private String title;
    private String description;
    private String keywords;
    private boolean indexYandex;
    private boolean indexGoogle;
    private Calendar yandexCache;
    private Calendar googleCache;
    //private List<Link> inLinks;
    //private List<Link> inLinks;
}
