package org.seocrack.web;

import org.seocrack.entities.User;
import org.seocrack.services.ProjectManager;
import org.seocrack.services.UserSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by a.semenchenko on 23.03.2017.
 */
public class BaseController {

  @Autowired
  protected UserSession<User> userSession;
  @Autowired
  protected ProjectManager projectManager;

  public final String LOGIN_REDIRECT = "redirect:/auth/login";
  public final String MAIN_REDIRECT = "redirect:/main";

  public boolean checkAuthorisation() {
    return userSession.getLoggedUser() != null;
  }
}
