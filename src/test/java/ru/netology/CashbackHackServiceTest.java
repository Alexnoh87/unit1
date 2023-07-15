package ru.netology;

import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;
import org.junit.jupiter.api.Assertions;


public class CashbackHackServiceTest {

    @Test
    public void shouldHowMuchBuyIfPurchaseLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHowMuchBuyIfPurchase0() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1_000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHowMuchBuyIfPurchase1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1_000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldHowMuchBuyIfPurchaseMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1_300;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldHowMuchBuyIfPurchaseLess1000API() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldHowMuchBuyIfPurchase1000API() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1_000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldHowMuchBuyIfPurchaseMore1000API() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 1_300;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldHowMuchBuyIfPurchase0API() {
        CashbackHackService cashbackHackService = new CashbackHackService();

        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1_000;

        Assertions.assertEquals(expected, actual);
    }
}