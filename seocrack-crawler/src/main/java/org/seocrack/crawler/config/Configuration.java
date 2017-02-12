package org.seocrack.crawler.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by meqqee on 12.02.2017.
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Configuration {
    long crawlDelay;
    int pagesLimit;
    boolean ignoreNoFollow = false;
    String userAgent;
    String encoding;
}
