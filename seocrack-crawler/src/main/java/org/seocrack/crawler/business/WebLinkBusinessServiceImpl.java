package org.seocrack.crawler.business;

import org.seocrack.crawler.business.api.WebLinkBusinessService;
import org.seocrack.crawler.entities.WebLink;
import org.seocrack.crawler.repository.WebLinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by meqqee on 11.05.2017.
 */
@Service
public class WebLinkBusinessServiceImpl implements WebLinkBusinessService {

  @Autowired
  private WebLinkRepository repository;

  @Override
  public void save(WebLink webLink) {
    repository.save(webLink);
  }
}
