package org.seocrack.web;

import org.seocrack.entities.User;
import org.seocrack.services.UserSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by a.semenchenko on 23.03.2017.
 */
public class BaseController {

  @Autowired
  protected UserSession<User> userSession;

  protected final String LOGIN_REDIRECT = "redirect:/auth/login";

  public boolean checkAuthorisation() {
    return userSession.getLoggedUser() != null;
  }
}
