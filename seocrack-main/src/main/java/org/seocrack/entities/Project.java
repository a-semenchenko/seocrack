package org.seocrack.entities;

import com.sun.org.apache.xpath.internal.compiler.Keywords;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by meqqee on 30.01.2017.
 */
@Data
@Entity
public class Project {
    @Id
    private long id;
    private String region;
    private String url;
    private int budget;
    @ManyToMany
    @JoinTable(
      name = "jndProjectSeo",
      joinColumns = @JoinColumn(name = "projectId"),
      inverseJoinColumns = @JoinColumn(name = "seo")
    )
    private Set<SeoSpecialist> seoSpecialist;
    @ManyToMany
    @JoinTable(
      name = "jndProjectManager",
      joinColumns = @JoinColumn(name = "projectId"),
      inverseJoinColumns = @JoinColumn(name = "manager")
    )
    private Set<ProjectManager> projectManager;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Keyword> keywords = new ArrayList<Keyword>();

    public void setKeywords(ArrayList<Keywords> keywords) {
        //todo подумать над реализацией
    }
}
