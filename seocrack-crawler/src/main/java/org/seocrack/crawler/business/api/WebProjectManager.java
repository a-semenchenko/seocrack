package org.seocrack.crawler.business.api;

import org.seocrack.crawler.entities.WebProject;

import java.util.List;

/**
 * Created by a.semenchenko on 12.05.2017.
 */
public interface WebProjectManager {
  WebProject addProject(String name, String commentary);
  void deleteProject(String name);
  void updateProject(WebProject webProject);
  WebProject getProjectByName(String name);
  List<WebProject> getAllProjects();
}