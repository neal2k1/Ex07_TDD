package com.qa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account act;

    @BeforeEach
    void setUp() {
        act = new Account(new String[]{"Link","Visa"},
                "12-34-56", "0001","password");
    }
    @Test
    @DisplayName("Matching Accounts!")
    void compareTo() {
        Account testAccount = new Account(new String[]{"Link"},
                "12-34-56","0001","password");
        assertEquals(0, act.compareTo(testAccount),"Login Failed!");

    }
}