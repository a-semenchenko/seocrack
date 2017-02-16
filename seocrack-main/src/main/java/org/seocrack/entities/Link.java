package org.seocrack.entities;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by meqqee on 30.01.2017.
 */
@Entity
@Data
public class Link {
    private long id;
    private String href;
    private String anchor;
    private boolean doFollow;
}
