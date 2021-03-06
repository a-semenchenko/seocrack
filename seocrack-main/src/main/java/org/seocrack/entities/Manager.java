package org.seocrack.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by meqqee on 30.01.2017.
 */
@Entity
@Getter
@Setter
public class Manager extends User {
    @ManyToMany(mappedBy = "manager")
    private List<Project> projects;
}
