package ru.netology.domain;

public class CashbackHack-gradle {
     private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
