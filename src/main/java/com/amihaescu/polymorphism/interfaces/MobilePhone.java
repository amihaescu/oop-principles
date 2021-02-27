package com.amihaescu.polymorphism.interfaces;

import java.util.List;
import java.util.Map;

public abstract class MobilePhone {

    private String name;
    private String phoneNumber;
    protected List<Map<String, String>> contacts;

    public MobilePhone(String name, String phoneNumber, List<Map<String, String>> contacts) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.contacts = contacts;
    }

    public abstract List<Map<String, String>> getContactList();
    public abstract void sendText(String contactName);
    public abstract Map<String, String> getContactDetails(String contactName);
}
