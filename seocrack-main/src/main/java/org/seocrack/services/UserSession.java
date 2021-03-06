package org.seocrack.services;

import lombok.Getter;
import lombok.Setter;
import org.seocrack.entities.User;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by a.semenchenko on 21.03.2017.
 */
@Component
@Scope(value="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
@Getter
@Setter
public class UserSession<T extends User> implements Serializable {
  private T loggedUser;

  public void update(T loggedUser) {
    this.loggedUser = loggedUser;
  }
}
