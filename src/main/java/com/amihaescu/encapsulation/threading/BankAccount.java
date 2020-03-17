/*
 * Copyright 2020 Dell Inc. or its subsidiaries. All Rights Reserved.
 */
package com.amihaescu.encapsulation.threading;/*
 * Copyright 2020 Dell Inc. or its subsidiaries. All Rights Reserved.
 */

public class BankAccount {

    private Integer value;

    public BankAccount(Integer value) {
        this.value = value;
    }

    public synchronized void expense(Integer expense) {
        if (expense < value) {
            try {
                Thread.currentThread().sleep(100);
            } catch (InterruptedException e) {

            }
            value -= expense;
        }
    }

    public Integer getValue() {
        return value;
    }
}
