package org.seocrack.crawler;

import edu.uci.ics.crawler4j.crawler.CrawlController;
import lombok.Setter;
import org.seocrack.crawler.entities.WebProject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by meqqee on 11.05.2017.
 */
public class CrawlerFactory implements CrawlController.WebCrawlerFactory<Crawler> {

  @Autowired
  private Crawler crawler;

  @Setter
  private WebProject project;

  @Override
  public Crawler newInstance() throws Exception {
    crawler.setProject(this.project);
    return crawler;
  }
}
