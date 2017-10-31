package org.dcw.twitter.util;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Random;

public class Utils {
    private static final int ID_LENGTH = 16;

    public static ZonedDateTime toZDT(final LocalDateTime ldt) {
        return ZonedDateTime.ofLocal(ldt, ZoneId.systemDefault(), null);
    }

    public static String getHalfString(final String s) {
        if (s == null) return "";
        return (s.length() > 1) ? s.substring(0, s.length() / 2) : s;

    }

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

    public static <T> T pickOne(final List<T> list) {
        return pickOne(list, new Random());
    }

    public static <T> T pickOne(final List<T> list, final Random r) {
        return list.get(r.nextInt(list.size()));
    }

    public static Long generateID(final Random r) {
        StringBuilder idStr = new StringBuilder(Long.toString(System.currentTimeMillis()));
        while (idStr.length() < ID_LENGTH) {
            idStr.append(r.nextInt(10)); // 0-9
        }
        return Long.valueOf(idStr.toString());
    }

    public static String randomColour(final Random r) {
        byte[] rgb = new byte[3];
        r.nextBytes(rgb);
        return toHexString(rgb);
    }
}
