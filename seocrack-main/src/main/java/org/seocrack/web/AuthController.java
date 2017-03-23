package org.seocrack.web;

import org.seocrack.business.faces.UserBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
  public ModelAndView authentication(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
    ModelAndView mav = new ModelAndView();

    if (userBusinessService.findByLogin(username) == null) {
      model.addAttribute("error", "Не верный логин или пароль");
      mav.setViewName("login");
      return mav;
    }

    mav.setViewName("main");

    return mav;
  }
}
