package ru.netology.service;

import org.junit.Test;

import org.junit.Assert.*;

public class CashbackHackServiceTest {

   CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn100IfAmountIs900() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

   @org.junit.Test
    public void shouldReturnZeroIfAmountIs1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

   @org.junit.Test
    public void shouldReturn500IfAmountIs1500() {
        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn1000IfAmountIsZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsLessBoundary() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

   @org.junit.Test
    public void shouldCalculateRemainIfAmountIsMoreBoundary() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsLessZero() {
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001;

        assertEquals(expected, actual);
    }
}
