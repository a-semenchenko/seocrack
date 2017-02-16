package org.seocrack.crawler.entities;

import lombok.Data;
import org.seocrack.entities.Link;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by meqqee on 16.02.2017.
 */
@Entity
@Data
public class Page {
    private long id;
    private String title;
    private String description;
    private String keywords;
    private String url;
    private List<Link> outLinks;
    private List<Link> inLinks;
}
