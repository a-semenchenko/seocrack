package org.seocrack.utils;

import java.util.HashMap;

/**
 * Created by a.semenchenko on 03.05.2017.
 */
public class MapUtils {
  public static <K, V> HashMap<K, V> newHashMap(Object... values) {
    HashMap<K, V> map = new HashMap<>();
    for (int i = 0; i < values.length / 2; i++) {
      map.put((K) values[i * 2], (V) values[i * 2 + 1]);
    }
    return map;
  }
}
