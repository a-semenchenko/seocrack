package org.seocrack.crawler.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by meqqee on 16.02.2017.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WebPage {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cust")
    @SequenceGenerator(name = "seq_cust", sequenceName = "webPage_seq", allocationSize = 1)
    private long id;
    //private WebPage parent;
    private String title;
    private String description;
    private String keywords;
    private String url;
    private String text;
    private int textLength;
    @ManyToOne
    private WebProject webProject;
    @OneToMany(mappedBy = "webPage", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<WebLink> outLinks = new ArrayList<>();
//    @OneToMany(mappedBy = "webPage", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<WebLink> inLinks;

    public void addOutLink(WebLink webLink) {
        this.outLinks.add(webLink);
    }

//    public void addInLink(WebLink webLink) {
//        this.inLinks.add(webLink);
//    }
}
