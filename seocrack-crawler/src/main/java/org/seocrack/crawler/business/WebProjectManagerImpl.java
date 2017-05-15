package org.seocrack.crawler.business;

import org.seocrack.crawler.entities.WebProject;
import org.seocrack.crawler.business.api.WebProjectManager;
import org.seocrack.crawler.repository.WebProjectRepository;
import org.seocrack.crawler.utils.AssertionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by a.semenchenko on 12.05.2017.
 */
public class WebProjectManagerImpl implements WebProjectManager {

  @Autowired
  private WebProjectRepository repository;

  @Override
  public WebProject addProject(String name, String commentary) {
    AssertionUtils.assertEmpty(name, "Не указано название проекта");
    WebProject project = new WebProject(null, name, new ArrayList<>(), Calendar.getInstance(), null);
    repository.save(project);
    return project;
  }

  @Override
  public void deleteProject(String name) {
    WebProject project = repository.findByName(name);
    if (project != null)
      repository.delete(project);
  }

  @Override
  public void updateProject(WebProject webProject) {
    if (webProject != null)
      repository.save(webProject);
  }

  @Override
  public WebProject getProjectByName(String name) {
    return repository.findByName(name);
  }

  @Override
  public List<WebProject> getAllProjects() {
    return (List<WebProject>) repository.findAll();
  }
}