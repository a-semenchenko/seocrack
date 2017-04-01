package org.seocrack.entities;

import lombok.Data;
import org.seocrack.entities.enums.Role;

import javax.persistence.*;

/**
 * Created by meqqee on 30.01.2017.
 */
@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "UTYPE")
public abstract class User {
    @Id
    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;
}
