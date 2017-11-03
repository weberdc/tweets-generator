/*
 * Copyright 2017 Derek Weber
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dcw.twitter.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Random;

/**
 * Utility methods.
 */
public class Utils {
    /** The length of a Twitter ID (tweet and user profiles). */
    private static final int ID_LENGTH = 16;

    /**
     * Create a {@link ZonedDateTime} instance from a {@link LocalDateTime} instance,
     * assuming it refers to the local time zone.
     *
     * @param ldt A {@link LocalDateTime} instance to convert.
     * @return A [@link ZonedDateTime} version of <code>ldt</code> based in the local time zone.
     */
    public static ZonedDateTime toZDT(final LocalDateTime ldt) {
        return ZonedDateTime.ofLocal(ldt, ZoneId.systemDefault(), null);
    }

    /**
     * Returns the first half the string provided, unless it's <code>null</code> or only one
     * or zero characters long, in which case it is returned in its entirety.
     *
     * @param s A String
     * @return Half of <code>s</code>, or all of <code>s</code> if it's one or zero characters long or null.
     */
    public static String getHalfString(final String s) {
        if (s == null) return "";
        return (s.length() > 1) ? s.substring(0, s.length() / 2) : s;

    }

    /**
     * Converts an array of bytes into into a string of hexidecimal characters, zero padding
     * bytes where necessary.
     *
     * @param bytes The array of bytes to represent as a hex string.
     * @return A String of hexidecimal characters.
     * @see <a href="https://stackoverflow.com/questions/332079/in-java-how-do-i-convert-a-byte-array-to-a-string-of-hex-digits-while-keeping-l">java - In Java, how do I convert a byte array to a string of hex digits? - Stack Overflow</a>
     */
    public static String toHexString(final byte[] bytes) {
        // from https://stackoverflow.com/questions/332079/in-java-how-do-i-convert-a-byte-array-to-a-string-of-hex-digits-while-keeping-l
        StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString().toUpperCase();
    }

    /**
     * Randomly pick one member of <code>list</code>.
     *
     * @param list The list from which to pick an element.
     * @param <T> The type of the list.
     * @return An element of the list.
     */
    public static <T> T pickOne(final List<T> list) {
        return pickOne(list, new Random());
    }

    /**
     * Randomly pick one member of <code>list</code>, using the provided random
     * number generator.
     *
     * @param list The list from which to pick an element.
     * @param r A random number generator to use.
     * @param <T> The type of the list.
     * @return An element of the list.
     */
    public static <T> T pickOne(final List<T> list, final Random r) {
        return list.get(r.nextInt(list.size()));
    }

    /**
     * Creates a plausible ID to be used in tweets or Twitter user profiles.
     *
     * @param r A random number generator to use.
     * @return A plausible ID.
     */
    public static Long generateID(final Random r) {
        StringBuilder idStr = new StringBuilder(Long.toString(System.currentTimeMillis()));
        while (idStr.length() < ID_LENGTH) {
            idStr.append(r.nextInt(10)); // 0-9
        }
        return Long.valueOf(idStr.toString());
    }

    /**
     * Creates a colour string from three randomly generated bytes.
     *
     * @param r A random number generator to use.
     * @return An RGB colour string.
     */
    public static String randomColour(final Random r) {
        byte[] rgb = new byte[3];
        r.nextBytes(rgb);
        return toHexString(rgb);
    }
}
