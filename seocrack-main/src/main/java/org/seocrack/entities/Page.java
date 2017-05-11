package org.seocrack.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.List;

/**
 * Created by meqqee on 30.01.2017.
 */
@Getter
@Setter
public class Page {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
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
