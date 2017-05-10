package org.seocrack.crawler.business;

import org.seocrack.crawler.business.api.WebPageBusinessService;
import org.seocrack.crawler.entities.WebPage;
import org.seocrack.crawler.repository.WebPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by a.semenchenko on 05.05.2017.
 */
@Service
public class WebPageBusinessServiceImpl implements WebPageBusinessService {
  @Autowired
  private WebPageRepository repository;

  @Override
  public void addPage(WebPage webPage) {
    repository.save(webPage);
  }
}
