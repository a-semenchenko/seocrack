package org.seocrack.entities;

import lombok.Data;
import org.seocrack.entities.enums.Role;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by meqqee on 30.01.2017.
 */
@Data
@Entity
public class ProjectManager {
    Role role;
    private List<Project> projects;
}
