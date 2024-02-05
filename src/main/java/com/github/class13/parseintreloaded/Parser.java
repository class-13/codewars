package com.github.class13.parseintreloaded;

import java.util.Map;

import static java.util.Map.entry;

public class Parser {

    private static final Map<String, Integer> dictionary = Map.ofEntries(
            entry("zero", 0),
            entry("one", 1),
            entry("two", 2),
            entry("three", 3),
            entry("four", 4),
            entry("five", 5),
            entry("six", 6),
            entry("seven", 7),
            entry("eight", 8),
            entry("nine", 9),
            entry("ten", 10),
            entry("eleven", 11),
            entry("twelve", 12),
            entry("thirteen", 13),
            entry("fourteen", 14),
            entry("fifteen", 15),
            entry("sixteen", 16),
            entry("seventeen", 17),
            entry("eighteen", 18),
            entry("nineteen", 19),
            entry("twenty", 20),
            entry("thirty", 30),
            entry("forty", 40),
            entry("fifty", 50),
            entry("sixty", 60),
            entry("seventy", 70),
            entry("eighty", 80),
            entry("ninety", 90),

            entry("one hundred", 100),
            entry("two hundred", 200),
            entry("three hundred", 300),
            entry("four hundred", 400),
            entry("five hundred", 500),
            entry("six hundred", 600),
            entry("seven hundred", 700),
            entry("eight hundred", 800),
            entry("nine hundred", 900)
    );

    private static final Map<String, Integer> multipliersDictionary = Map.ofEntries(
            entry("thousand", 1000),
            entry("million", 1000000)
    );

    public static int parseInt(String numStr) {
        String[] numbers = numStr.split("\\s|-");
        var result = 0;

        for (var i = 0; i < numbers.length; i++) {
            if (dictionary.containsKey(numbers[i])) {
                if (i + 1 < numbers.length && "hundred".equals(numbers[i + 1]))
                    result += dictionary.get(numbers[i] + " " + numbers[i + 1]);
                else
                    result += dictionary.get(numbers[i]);
            } else if (multipliersDictionary.containsKey(numbers[i])) {
                result *= multipliersDictionary.get(numbers[i]);
            }
        }

        return result;
    }
}
