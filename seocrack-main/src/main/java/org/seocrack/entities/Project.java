package org.seocrack.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by meqqee on 30.01.2017.
 */
@Data
@Entity
public class Project {
    private long id;
    private String region;
    private String url;
    private int budget;
    private List<SeoSpecialist> seoSpecialistList;
    private List<ProjectManager> projectManager;
    private Customer customer;
    private List<Keyword> keywords;
}
