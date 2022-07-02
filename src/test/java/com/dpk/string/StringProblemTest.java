package com.dpk.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProblemTest {

    StringProblem sp = new StringProblem();

    @Test
    void testCountDuplicate() {
        String testText = "this is a sample test string";
        sp.countDuplicate(testText);
    }

}