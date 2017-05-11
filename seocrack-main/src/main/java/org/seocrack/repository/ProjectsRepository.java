package org.seocrack.repository;

import org.seocrack.entities.Project;
import org.seocrack.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by meqqee on 22.03.2017.
 */
public interface ProjectsRepository extends CrudRepository<Project, String> {
   Project findByUrl(String url);
   Project findById(long id);
}
