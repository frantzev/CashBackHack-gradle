package ru.netology.service;

import org.junit.Assert;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

   @org.junit.Test
    public void shouldReturnZeroIfAmountIs1000() {
       CashbackHackService service = new CashbackHackService();
       int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

   @org.junit.Test
    public void shouldReturn500IfAmountIs1500() {
       CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn1000IfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

   @org.junit.Test
    public void shouldCalculateRemainIfAmountIsMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

       Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsLessZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001;

        Assert.assertEquals(expected, actual);
    }
}
