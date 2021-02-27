package com.amihaescu.polymorphism;

import com.amihaescu.polymorphism.interfaces.Ipod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class IpodTest {

    private Ipod testIpod;

    @BeforeEach
    void setUp() {
        testIpod = new Iphone("Andrei's IPhone", "+40723123456",
                List.of(Map.of("name", "LP", "phoneNo", "+40721543678")));
    }

    @Test
    public void should_retrieve_playList() {
        var list = testIpod.getSongList();
        assertNotNull(list);
        assertEquals(3, list.size());
        var song = list.get(1);
        assertNotNull(song);
        assertEquals("Maluma Baby", song);
    }

    @Test
    public void should_play_next_song() {
        var nextSong = testIpod.getNextSong();
        assertEquals("Nickelback", nextSong);
    }

    @Test
    public void should_play_prev_song() {
        var nextSong = testIpod.getPrevSong();
        assertEquals("Despacito", nextSong);
    }
}
