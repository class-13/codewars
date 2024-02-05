package com.github.class13.parseintreloaded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTest {

    @Test
    public void fixedTests() {
        assertEquals(1 , Parser.parseInt("one"));
        assertEquals(20 , Parser.parseInt("twenty"));
        assertEquals(246 , Parser.parseInt("two hundred forty-six"));
        assertEquals(783919 , Parser.parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
    }
}
