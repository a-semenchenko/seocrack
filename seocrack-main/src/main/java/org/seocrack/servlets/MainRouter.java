package org.seocrack.servlets;

import org.seocrack.services.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by a.semenchenko on 20.03.2017.
 */
public class MainRouter extends HttpServlet {

  @Autowired
  private UserSession userSession;

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
  }

  public MainRouter() {
    super();
    // TODO Auto-generated constructor stub
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    if (userSession.getLoggedUser() == null)
      response.sendRedirect("login");
    else
      response.sendRedirect("index.jsp");
  }

  protected void goPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  }
}
