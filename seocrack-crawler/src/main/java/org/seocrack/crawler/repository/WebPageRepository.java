package org.seocrack.crawler.repository;

import org.seocrack.crawler.entities.WebPage;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by a.semenchenko on 05.05.2017.
 */
public interface WebPageRepository extends CrudRepository<WebPage, String> {
}
