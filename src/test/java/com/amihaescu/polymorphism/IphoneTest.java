package com.amihaescu.polymorphism;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IphoneTest {

    private Iphone iphone = new Iphone("Andrei's IPhone", "+40723123456",
            List.of(Map.of("name", "LP", "phoneNo", "+40721543678")));

    @Test
    void should_track_user() {
        assertTrue(iphone.trackUser());
    }
}
