package org.seocrack.business;

import org.seocrack.business.faces.UserBusinessService;
import org.seocrack.entities.User;
import org.seocrack.repository.UserRepository;
import org.seocrack.services.UserSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by a.semenchenko on 21.03.2017.
 */
public class UserBusinessServiceImpl implements UserBusinessService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private UserSession userSession;

  public User findByLogin(String login) {
    return userRepository.findByLogin(login);
  }

  public User createNewUser(User user) {
    return userRepository.save(user);
  }
}
