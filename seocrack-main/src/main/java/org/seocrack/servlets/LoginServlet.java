package org.seocrack.servlets;

import org.seocrack.services.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by a.semenchenko on 21.03.2017.
 */
@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

  @Autowired
  private UserSession userSession;

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
  }

  public LoginServlet() {
    super();
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    if (userSession.getLoggedUser() == null)
      request.getRequestDispatcher("login.jsp").forward(request, response);
    else
      response.sendRedirect("index.jsp");
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String login = request.getParameter("login");
    String password = request.getParameter("password");


  }
}
