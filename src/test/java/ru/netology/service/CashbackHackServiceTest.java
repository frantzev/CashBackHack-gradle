package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemainIfLess1000() {
        int amount = 900;
        int expected = 100;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(expected, cashbackHackService.remain(amount));
    }

    @org.junit.Test
    public void testRemainIfEqual1000() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(expected, cashbackHackService.remain(amount));
    }

    @org.junit.Test
    public void testRemainIfMore1000() {
        int amount = 1200;
        int expected = 800;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(expected, cashbackHackService.remain(amount));
    }
}