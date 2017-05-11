package org.seocrack.crawler.business.api;

import org.seocrack.crawler.entities.WebLink;
import org.springframework.stereotype.Service;

/**
 * Created by meqqee on 11.05.2017.
 */
@Service
public interface WebLinkBusinessService {
  void save(WebLink webLink);
}
