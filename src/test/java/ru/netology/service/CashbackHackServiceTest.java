package ru.netology.service;

import org.testng.Assert;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void remainTest() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void cashbackHackServiceTest() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
