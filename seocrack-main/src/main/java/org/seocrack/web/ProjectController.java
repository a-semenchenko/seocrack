package org.seocrack.web;

import org.seocrack.crawler.business.api.WebProjectManager;
import org.seocrack.crawler.entities.WebProject;
import org.seocrack.entities.User;
import org.seocrack.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by a.semenchenko on 12.05.2017.
 */
@Controller
@RequestMapping("/crawler")
public class ProjectController extends BaseController {

  @Autowired
  private org.seocrack.crawler.CrawlerController crawler;

  @Autowired
  private WebProjectManager webProjectManager;

  @RequestMapping
  public Object render(Model model) {
    if (!checkAuthorisation())
      return LOGIN_REDIRECT;
    User user = userSession.getLoggedUser();
    model.addAttribute("login", user.getFirstName() + " " + user.getLastName());
    List<WebProject> projects = webProjectManager.getAllProjects();
    model.addAttribute("projects", projects);
    return new ModelAndView("crawler");
  }

  @RequestMapping(value="crawl", method = RequestMethod.POST)
  public void crawl(WebRequest request) throws Exception {
    String url = request.getParameter("url");
    if (!StringUtils.isNullOrEmpty(url)) {
      WebProject project = webProjectManager.addProject(url, null);
      crawler.start(project);
    }
  }

  @RequestMapping(value="project/{id}", method = RequestMethod.GET)
  public ModelAndView getSingleProjectPage(@PathVariable("id") long id, Model model) {
    WebProject project = webProjectManager.getProjectById(id);
    model.addAttribute("project", project);
    return new ModelAndView("report");
  }
}
