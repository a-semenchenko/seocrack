package org.seocrack.web;

import org.seocrack.entities.SeoSpecialist;
import org.seocrack.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;

/**
 * Created by a.semenchenko on 23.03.2017.
 */
@Controller
@RequestMapping("/main")
public class MainController extends BaseController {

  @RequestMapping
  public Object index(Model model) {
    if (!checkAuthorisation())
      return LOGIN_REDIRECT;
    User user = userSession.getLoggedUser();
    model.addAttribute("login", user.getFirstName() + " " + user.getLastName());
    return new ModelAndView("main");
  }

  public void addProject(WebRequest request) {
    int budget;
    try {
      budget = Integer.parseInt(request.getParameter("budget"));
    } catch (NumberFormatException e) {
      budget = 0;
    }
    projectManager.addProject(request.getParameter("region"), request.getParameter("url"), budget);
  }

  private void renderPage(ModelAndView mav) {

  }
}
