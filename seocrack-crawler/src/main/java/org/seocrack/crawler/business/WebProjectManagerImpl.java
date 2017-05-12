package org.seocrack.crawler.business;

import org.seocrack.crawler.entities.WebProject;
import org.seocrack.crawler.business.api.WebProjectManager;
import org.seocrack.crawler.repository.WebProjectRepository;
import org.seocrack.crawler.utils.AssertionUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by a.semenchenko on 12.05.2017.
 */
public class WebProjectManagerImpl implements WebProjectManager {

  @Autowired
  private WebProjectRepository repository;

  @Override
  public void addProject(String name, String commentary) {
    AssertionUtils.assertEmpty(name, "Не указано название проекта");
  }

  @Override
  public void deleteProject(String name) {

  }

  @Override
  public void updateProject(WebProject webProject) {

  }

  @Override
  public WebProject getProjectByName(String name) {
    return null;
  }

  @Override
  public List<WebProject> getAllProjects() {
    return null;
  }
}