package org.seocrack.crawler.business;

import org.seocrack.crawler.entities.WebProject;
import org.seocrack.crawler.business.api.WebProjectManager;
import org.seocrack.crawler.repository.WebProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by a.semenchenko on 12.05.2017.
 */
public class WebProjectManagerImpl implements WebProjectManager {

  @Autowired
  private WebProjectRepository repository;

  @Override
  public void add(WebProject webProject) {
    repository.save(webProject);
  }

  @Override
  public void delete(WebProject webProject) {

  }

  @Override
  public void update(WebProject webProject) {

  }

  @Override
  public WebProject getProjectByName(String name) {
    return repository.findByName(name);
  }
}