package org.seocrack.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.seocrack.entities.enums.Role;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by meqqee on 30.01.2017.
 */
@Entity
@Getter
@Setter
public class Customer extends User {
    private String companyName;
    @OneToMany(mappedBy = "customer")
    private Set<Project> projects;
}
