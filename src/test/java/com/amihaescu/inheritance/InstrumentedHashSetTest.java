package com.amihaescu.inheritance;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InstrumentedHashSetTest {

    @Test
    public void test() {
        InstrumentedHashSet<String> string = new InstrumentedHashSet<>();
        string.addAll(Arrays.asList("Snap","",""));
        assertEquals(3, string.getAddCount());
    }
}
