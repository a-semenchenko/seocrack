package org.seocrack.repository;

import org.seocrack.entities.Project;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by meqqee on 22.03.2017.
 */
public interface ProjectsRepository extends CrudRepository<Project, String> {
   Project findByUrl(String url);
   Project findById(long id);
}
