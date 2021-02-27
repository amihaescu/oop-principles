package com.amihaescu.polymorphism;

import com.amihaescu.polymorphism.interfaces.MobilePhone;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MobilePhoneTest {

    MobilePhone mobilePhone = new Iphone("Andrei's IPhone", "+40723123456",
            List.of(Map.of("name", "LP", "phoneNo", "+40721543678")));

    @Test
    void should_retrieve_contact_list() {
        var contactList = mobilePhone.getContactList();
        assertEquals(1, contactList.size());
    }

    @Test
    void should_retrieve_contact_if_contact_exists() {
        var contactDetails = mobilePhone.getContactDetails("LP");
        assertNotNull(contactDetails);
        assertEquals("LP", contactDetails.get("name"));
        assertEquals("+40721543678", contactDetails.get("phoneNo"));
    }
}
