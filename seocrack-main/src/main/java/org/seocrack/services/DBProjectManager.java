package org.seocrack.services;

import org.seocrack.entities.Keyword;
import org.seocrack.entities.Project;

import java.util.List;

/**
 * Менеджер проектов для работы с базой данных
 * Created by meqqee on 30.01.2017.
 */
public class DBProjectManager implements ProjectManager {
    public Project addProject(String region, String url, int budget) {
        return null;
    }

    public Project deleteProject(long id) {
        return null;
    }

    public Project getProject(long id) {
        return null;
    }

    public List<Keyword> getProjectKeywords(long id) {
        return null;
    }

    public void setProjectKeywords(long id, List<Keyword> keywords) {

    }

    public void activateProject(long id) {

    }

    public void setComment(long id, String comment) {

    }
}
