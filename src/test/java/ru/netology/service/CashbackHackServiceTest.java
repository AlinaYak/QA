package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldIfAmountLess() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

      Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountEqualBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountOver() {
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountLessBoundary() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

       Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountOverBoundary() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

       Assert.assertEquals(actual, expected);
    }

}