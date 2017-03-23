package org.seocrack.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;

/**
 * Created by a.semenchenko on 23.03.2017.
 */
@Controller
@RequestMapping("/main")
public class MainController extends BaseController {

  @RequestMapping
  public Object index() {
    if (!checkAuthorisation())
      return LOGIN_REDIRECT;

    return new ModelAndView("index");
  }
}
