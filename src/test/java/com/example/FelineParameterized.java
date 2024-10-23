package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParameterized {
    private int kittens;

    public FelineParameterized(int kittens) {
        this.kittens = kittens;

    }

    @Test
    public void getKittensCountTest() {
        Feline feline = new Feline();
        int expected = kittens;
        int actual = feline.getKittens(kittens);
        Assert.assertEquals(expected,actual);
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getData() {
        return new Object[][]{
                {1}, {2}, {23}

        };
    }
}
