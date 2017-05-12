package org.seocrack.crawler.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by meqqee on 30.01.2017.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WebLink {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_gen")
    @SequenceGenerator(name = "seq_gen", sequenceName = "webLink_seq", allocationSize = 1)
    private long id;
    private String href;
    private String anchor;
    private boolean doFollow;
    @ManyToOne
    private WebPage webPage;
}
