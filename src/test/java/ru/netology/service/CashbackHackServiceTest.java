package ru.netology.service;

import org.testng.annotations.Test;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainIfLess1000() {
        int amount = 900;
        int expected = 100;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(amount), expected);
    }

    @org.testng.annotations.Test
    public void testRemainIfEqual1000() {
        int amount = 1000;
        int expected = 0;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(amount), expected);
    }

    @org.testng.annotations.Test
    public void testRemainIfMore1000() {
        int amount = 1200;
        int expected = 800;
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(amount), expected);
    }
}
