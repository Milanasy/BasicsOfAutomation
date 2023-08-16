package ru.netology.service;

import org.junit.Assert;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void cashbackHackServiceTest1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void cashbackHackServiceTest2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }
}

