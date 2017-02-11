package org.seocrack.utils;

import org.seocrack.utils.exceptions.UntypedPlatformException;

/**
 * Created by meqqee on 30.01.2017.
 */
public class AssertionUtils {
    public static void assertTrue(boolean cond, String mes) throws UntypedPlatformException {
        if (!cond)
            throw new UntypedPlatformException(mes);
    }

    public static void assertNull(Object obj, String mes) throws UntypedPlatformException {
        if (obj == null)
            throw new UntypedPlatformException(mes);
    }
}
