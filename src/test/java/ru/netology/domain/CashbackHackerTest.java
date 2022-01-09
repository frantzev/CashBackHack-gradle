package ru.netology.domain;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashbackHackerTest {
     @Test
    public void enterIntegerValue() {
        final CashbackHacker cashback = new CashbackHacker();
        int amount = 5700;
        int actual = cashback.remain(amount);
        int expected = 300;
        assertEquals(actual,expected);
    }

    @Test
    public void enterNullValue() {
        final CashbackHacker cashback = new CashbackHacker();
        int amount = 0;
        int actual = cashback.remain(amount);
        int expected = 1000;
        assertEquals(actual,expected);
    }

    @Test
    public void enterRoundValue() {
        final CashbackHacker cashback = new CashbackHacker();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void enterNegativeValue() {
        final CashbackHacker cashback = new CashbackHacker();
        int amount = -50000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(actual,expected);
    }
}
