package ru.netology.service;

import org.junit.Assert;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void cashbackHackServiceTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected =1000;

        Assert.assertEquals(actual, expected);
    }
}