package com.amihaescu.polymorphism.interfaces;

import java.net.URL;
import java.util.Map;

public interface InetCommunicator {

    Map<String, Object> sendEmail(String message, String destination);
    Map<String, Object> fetchPage(URL url);
}
