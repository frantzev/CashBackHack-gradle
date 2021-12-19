package ru.netology.domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {
    public CashbackHacker cashbackHacker = new CashbackHacker();

    @Test
    public void shouldCashBackSum900() {
        int actual = cashbackHacker.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCashBackSum100() {
        int actual = cashbackHacker.remain(100);
        int expected = 900;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCashBackSum5000() {
        int actual = cashbackHacker.remain(4000);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCashBackSum1000() {
        int actual = cashbackHacker.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldCashBackSum1100() {
        int actual = cashbackHacker.remain(1100);
        int expected = 900;
        assertEquals(expected,actual);
    }


}