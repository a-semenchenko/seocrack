package org.seocrack.repository;

import org.seocrack.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by a.semenchenko on 21.03.2017.
 */
public interface UserRepository extends CrudRepository<User, String> {
  User findByLogin(String login);
}
