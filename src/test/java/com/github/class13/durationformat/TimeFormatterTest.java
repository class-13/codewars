package com.github.class13.durationformat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeFormatterTest {

    @Test
    public void exampleTests() {
/*        assertEquals("1 second", TimeFormatter.formatDuration(1));
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62));
        assertEquals("2 minutes", TimeFormatter.formatDuration(120));
        assertEquals("1 hour", TimeFormatter.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662));
        assertEquals("68 days, 4 hours and 20 minutes", TimeFormatter.formatDuration(5890800));*/
        assertEquals("81 days and 3 seconds", TimeFormatter.formatDuration(6998403));
    }
}
