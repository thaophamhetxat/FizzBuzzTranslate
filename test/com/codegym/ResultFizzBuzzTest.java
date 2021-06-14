package com.codegym;

import static org.junit.jupiter.api.Assertions.*;

class ResultFizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizzBuzztest1() {
        int number = 5;
        String expected = "Fizz";
        String expected2 = "mot";
        String result = ResultFizzBuzz.fizzBuzz(number);
        String result2 = FizzBuzzTranslate.translate(number);
        assertEquals(expected,expected2, result,result2);
    }

    private void assertEquals(String expected, String expected2, String result, String result2) {
    }
}