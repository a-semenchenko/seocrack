package org.seocrack.crawler;

import org.jsoup.Connection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by a.semenchenko on 02.03.2017.
 */
public class ConnectionsHolder {

  private List<Connection> connections = new ArrayList<Connection>();
  private Map<String, Connection> conn = new HashMap<String, Connection>();

  public void add(Connection connection) {
    this.connections.add(connection);
  }
}
