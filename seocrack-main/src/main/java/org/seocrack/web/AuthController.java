package org.seocrack.web;

import org.seocrack.business.faces.UserBusinessService;
import org.seocrack.entities.Customer;
import org.seocrack.entities.ProjectManager;
import org.seocrack.entities.SeoSpecialist;
import org.seocrack.entities.User;
import org.seocrack.services.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by a.semenchenko on 23.03.2017.
 */
@Controller
@RequestMapping("/auth")
public class AuthController extends BaseController {

  @Autowired
  private UserBusinessService userBusinessService;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public ModelAndView loginForm() {
    return new ModelAndView("login");
  }

  @RequestMapping(value="/login", method = RequestMethod.POST)
  public Object authentication(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
    ModelAndView mav = new ModelAndView();

    User user = userBusinessService.findByLogin(username);

    if (user == null || !user.getPassword().equals(password)) {
      model.addAttribute("error", "Не верный логин или пароль");
      mav.setViewName("login");
      return mav;
    }

    userSession.update(user);

    return "redirect:/main";
  }

  @RequestMapping(value = "/register", method = RequestMethod.POST)
  public String registration(WebRequest webRequest) {
    User user;

    String username = webRequest.getParameter("username");
    String password = webRequest.getParameter("password");
    String firstName = webRequest.getParameter("firstName");
    String lastName = webRequest.getParameter("lastName");
    String role = webRequest.getParameter("role");

    if (role.equals("seo"))
      user = new SeoSpecialist();
    else
      user = new ProjectManager();

    user.setLogin(username);
    user.setPassword(password);
    user.setFirstName(firstName);
    user.setLastName(lastName);

    userBusinessService.createNewUser(user);

    return "redirect:/main";
  }

  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public Object renderRegistation() {
    if (userSession.getLoggedUser() == null) {
      return new ModelAndView("registration");
    } else {
      return "redirect:/main";
    }
  }
}
