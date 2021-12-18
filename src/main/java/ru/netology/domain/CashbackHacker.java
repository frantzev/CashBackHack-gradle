package ru.netology.domain;

public class CashbackHacker {
    private final int boundary = 1000;

    public int remain(int amount) {
        int remainder = amount % boundary;
        return remainder !=0 ? boundary - remainder : 0;
    }
}
