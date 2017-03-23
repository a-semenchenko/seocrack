//package org.seocrack.rest;
//
//import org.seocrack.business.faces.UserBusinessService;
//import org.seocrack.entities.User;
//import org.seocrack.services.UserSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.ws.rs.Consumes;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.core.MediaType;
//
///**
// * Created by meqqee on 22.03.2017.
// */
//@Component
//@Path("/users")
//public class UserManager {
//
//   @Autowired
//   private UserSession userSession;
//
//   @Autowired
//   private UserBusinessService userBusinessService;
//
//   @POST
//   @Consumes({MediaType.TEXT_HTML})
//   @Path("/findUserByLogin")
//   public boolean findUserByLogin(String username) {
//      User user = userBusinessService.findByLogin(username);
//
//      return user != null;
//   }
//}
