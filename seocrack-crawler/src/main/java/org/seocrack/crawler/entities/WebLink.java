package org.seocrack.crawler.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by meqqee on 30.01.2017.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WebLink {
    private long id;
    private String href;
    private String anchor;
    private boolean doFollow;
}
