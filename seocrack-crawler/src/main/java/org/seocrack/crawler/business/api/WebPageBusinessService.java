package org.seocrack.crawler.business.api;

import org.seocrack.crawler.entities.WebPage;
import org.springframework.stereotype.Service;

/**
 * Created by a.semenchenko on 05.05.2017.
 */
@Service
public interface WebPageBusinessService {
  void addPage(WebPage webPage);
}
