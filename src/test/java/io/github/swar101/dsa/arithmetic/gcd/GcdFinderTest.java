package io.github.swar101.dsa.arithmetic.gcd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GcdFinderTest {


    @Test
    void testIfValidValuePass() {
        int actual = GcdFinder.findGcd(12, 14);
        assertEquals(2, actual);
    }

    @Test
    void testIfNegativesPass() {
        int actual = GcdFinder.findGcd(-4, 2);
        System.out.println("actual " + actual);
    }
}