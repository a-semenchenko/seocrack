package org.seocrack.web;

import org.seocrack.entities.User;
import org.seocrack.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by a.semenchenko on 12.05.2017.
 */
@Controller
@RequestMapping("/crawler")
public class CrawlerController extends BaseController {

  @Autowired
  private org.seocrack.crawler.CrawlerController crawler;

  @RequestMapping
  public Object render(Model model) {
    if (!checkAuthorisation())
      return LOGIN_REDIRECT;
    User user = userSession.getLoggedUser();
    model.addAttribute("login", user.getFirstName() + " " + user.getLastName());
    return new ModelAndView("crawler");
  }

  @RequestMapping(value="crawl", method = RequestMethod.POST)
  public void crawl(WebRequest request) throws Exception {
    String url = request.getParameter("url");
    if (!StringUtils.isNullOrEmpty(url))
      crawler.start(url);
  }
}
