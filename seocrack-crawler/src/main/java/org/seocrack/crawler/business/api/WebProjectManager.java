package org.seocrack.crawler.business.api;

import org.seocrack.crawler.entities.WebProject;

/**
 * Created by a.semenchenko on 12.05.2017.
 */
public interface WebProjectManager {
  void add(WebProject webProject);
  void delete(WebProject webProject);
  void update(WebProject webProject);
  WebProject getProjectByName(String name);
}