package org.seocrack.crawler.repository;

import org.seocrack.crawler.entities.WebProject;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by a.semenchenko on 12.05.2017.
 */
public interface WebProjectRepository extends CrudRepository<WebProject, String> {
  WebProject findByName(String name);
}
