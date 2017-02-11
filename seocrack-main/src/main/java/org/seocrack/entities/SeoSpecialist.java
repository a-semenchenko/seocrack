package org.seocrack.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by meqqee on 30.01.2017.
 */
@Data
@Entity
public class SeoSpecialist {
    private List<Project> projects;
}
