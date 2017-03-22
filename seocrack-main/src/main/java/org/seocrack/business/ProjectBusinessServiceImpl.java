package org.seocrack.business;

import org.seocrack.business.faces.ProjectBusinessService;
import org.seocrack.entities.Keyword;
import org.seocrack.entities.Project;
import org.seocrack.repository.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by meqqee on 22.03.2017.
 */
@Service
public class ProjectBusinessServiceImpl implements ProjectBusinessService {

   @Autowired
   private ProjectsRepository repository;

   public void addProject(Project project) {
      repository.save(project);
   }

   public void deleteProject(Project project) {
      repository.delete(project);
   }

   public Project findByUrl(String url) {
      return repository.findByUrl(url);
   }

   public List<Keyword> addKeywords(List<Keyword> keywords, long id) {
      Project project = repository.findById(id);

      repository.save(project);

      return project.getKeywords();
   }
}
