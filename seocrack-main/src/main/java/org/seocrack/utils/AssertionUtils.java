package org.seocrack.utils;

import org.seocrack.business.exceptions.UntypedPlatformException;

/**
 * Created by meqqee on 30.01.2017.
 */
public class AssertionUtils {
    public static void assertTrue(boolean cond, String mes) {
        if (cond)
            throw new UntypedPlatformException(mes);
    }

    public static void assertNull(Object obj, String mes) {
        if (obj == null)
            throw new UntypedPlatformException(mes);
    }

    public static void assertEmpty(String source, String mes) {
        if (org.springframework.util.StringUtils.isEmpty(source))
            throw new UntypedPlatformException(mes);
    }


}
