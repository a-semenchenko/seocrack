package org.seocrack.entities;

import lombok.Data;

/**
 * Created by meqqee on 30.01.2017.
 */
@Data
public abstract class User {
    private long id;
    private String login;
    private String password;
}
