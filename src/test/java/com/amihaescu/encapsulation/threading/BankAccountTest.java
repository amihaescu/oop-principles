/*
 * Copyright 2020 Dell Inc. or its subsidiaries. All Rights Reserved.
 */
package com.amihaescu.encapsulation.threading;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    public void testAccount() throws Exception {
        BankAccount account = new BankAccount(6_000);
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                account.expense(5_000);
            }).start();
        }
        Thread.sleep(1000);

        assertEquals(1_000, account.getValue());
    }
}
