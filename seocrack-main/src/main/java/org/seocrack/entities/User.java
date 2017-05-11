package org.seocrack.entities;

import lombok.Getter;
import lombok.Setter;
import org.seocrack.entities.enums.Role;

import javax.persistence.*;

/**
 * Created by meqqee on 30.01.2017.
 */
@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "UTYPE")
public abstract class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String eMail;
    @Enumerated(EnumType.STRING)
    private Role role;
}
