package org.seocrack.crawler.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Set;

/**
 * Created by meqqee on 16.02.2017.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WebPage {
    private long id;
    private WebPage parent;
    private String title;
    private String description;
    private String keywords;
    private String url;
    private Set<WebLink> outLinks;
    private Set<WebLink> inLinks;

    public void addOutLink(WebLink webLink) {
        this.outLinks.add(webLink);
    }
}
