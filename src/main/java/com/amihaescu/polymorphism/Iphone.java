package com.amihaescu.polymorphism;

import com.amihaescu.polymorphism.interfaces.InetCommunicator;
import com.amihaescu.polymorphism.interfaces.Ipod;
import com.amihaescu.polymorphism.interfaces.MobilePhone;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Iphone extends MobilePhone implements Ipod,InetCommunicator {

    private List<String> songList;
    private int currentSong = 1;
    public Iphone(String name, String phoneNumber, List<Map<String, String>> contacts) {
        super(name, phoneNumber, contacts);
        songList = new ArrayList<>();
        songList.add("Despacito");
        songList.add("Maluma Baby");
        songList.add("Nickelback");
    }

    @Override
    public Map<String, Object> sendEmail(String message, String destination) {
        return null;
    }

    @Override
    public Map<String, Object> fetchPage(URL url) {
        return null;
    }

    @Override
    public List<String> getSongList() {
        return this.songList;
    }

    @Override
    public String getNextSong() {
        currentSong++;
        return this.songList.get(currentSong);
    }

    @Override
    public String getPrevSong() {
        currentSong--;
        return this.songList.get(currentSong);
    }

    @Override
    public List<Map<String, String>> getContactList() {
        return this.contacts;
    }

    @Override
    public void sendText(String contactName) {

    }

    @Override
    public Map<String, String> getContactDetails(String contactName) {
        return this.contacts.stream().filter(stringStringMap -> stringStringMap.get("name").equals(contactName)).findAny().get();
    }

    public boolean trackUser() {
        System.out.println("Evil Tim Cook is watching...");
        return true;
    }
}
