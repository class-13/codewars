package com.github.class13.durationformat;

public class TimeFormatter {

    public static final int YEAR_TO_SECONDS = 31536000;
    public static final int DAY_TO_SECONDS = 86400;
    public static final int HOUR_TO_SECONDS = 3600;
    public static final int MINUTE_TO_SECONDS = 60;

    //read more: https://www.codewars.com/kata/52742f58faf5485cae000b9a
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        int y = 0;
        int remains = seconds;
        int diff = remains - YEAR_TO_SECONDS;
        if (diff == 0) {
            return "1 year";
        } else if (diff > 0) {
            y = remains / YEAR_TO_SECONDS;
            remains -= y * YEAR_TO_SECONDS;
        }
        int d = 0;
        diff = remains - DAY_TO_SECONDS;
        if (diff == 0) {
            return format(y, "year", false, false)
                    + format(remains / DAY_TO_SECONDS, "day", false, true);
        } else if (diff > 0) {
            d = remains / DAY_TO_SECONDS;
            remains -= d * DAY_TO_SECONDS;
        }
        int h = 0;
        diff = remains - HOUR_TO_SECONDS;
        if (diff == 0) {
            return format(y, "year", d > 0, false)
                    + format(d, "day", false, false)
                    + format(remains / HOUR_TO_SECONDS, "hour", false, true);
        } else if (diff > 0) {
            h = remains / HOUR_TO_SECONDS;
            remains -= h * HOUR_TO_SECONDS;
        }
        int m;
        diff = remains - MINUTE_TO_SECONDS;
        if (diff == 0) {
            return format(y, "year", (d > 0 || h > 0), false)
                    + format(d, "day", h > 0, false)
                    + format(h, " hour", false, false)
                    + format(remains / MINUTE_TO_SECONDS, "minute", false, true);
        } else if (diff > 0) {
            m = remains / MINUTE_TO_SECONDS;
            remains -= m * MINUTE_TO_SECONDS;
        } else {
            return format(y, "year", ((d > 0 && h > 0) || (h > 0 && remains > 0) || (d > 0 && remains > 0)), false)
                    + format(d, "day", (h > 0 && remains > 0), false)
                    + format(h, "hour", false, false)
                    + format(remains, "second", false, true);
        }
        return format(y, "year", ((d > 0 && h > 0) || (d > 0 && m > 0) || (h > 0 && m > 0)), false)
                + format(d, "day", ((h > 0 && m > 0) || (h > 0 && remains > 0) || (m > 0 && remains > 0)), false)
                + format(h, "hour", (m > 0 && remains > 0), false)
                + (remains > 0 ? format(m, "minute", false, false) + format(remains, "second", false, true) : format(m, "minute", false, true));
    }

    private static String format(int value, String component, boolean withComma, boolean isEndOf) {
        if (value == 0) {
            return "";
        }
        String ending = "";
        if (!isEndOf) {
            ending = withComma ? ", " : " and ";
        }
        return value == 1 ? "1 " + component + ending : value + " " + component + "s" + ending;
    }
}
