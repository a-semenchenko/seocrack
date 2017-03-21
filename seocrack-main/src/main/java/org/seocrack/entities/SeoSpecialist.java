package org.seocrack.entities;

import lombok.Data;
import org.seocrack.entities.enums.Role;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by meqqee on 30.01.2017.
 */
@Data
@Entity
public class SeoSpecialist extends User {
    @ManyToMany(mappedBy = "seoSpecialist")
    private List<Project> projects;
}
