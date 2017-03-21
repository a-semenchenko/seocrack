package org.seocrack.business.faces;

import org.seocrack.entities.User;
import org.springframework.stereotype.Service;

/**
 * Created by a.semenchenko on 21.03.2017.
 */
@Service
public interface UserBusinessService {
  User findByLogin(String login);
  User createNewUser(User user);
}
