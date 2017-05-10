package org.seocrack.business.api;

import org.seocrack.entities.Keyword;
import org.seocrack.entities.Project;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by meqqee on 22.03.2017.
 */
@Service
public interface ProjectBusinessService {
   void addProject(Project project);
   void deleteProject(Project project);
   Project findByUrl(String url);
   List<Keyword> addKeywords(List<Keyword> keywords, long id);
}
