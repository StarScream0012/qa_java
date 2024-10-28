package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        List expected = List.of("Животные", "Птицы", "Рыба");
        Lion lion = new Lion("Самец", new Feline());
        List actual = lion.getFood();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        int expected = 1;
        Lion lion = new Lion("Самец", new Feline());
        int actual = lion.getKittens();
        Assert.assertEquals(expected,actual);
    }
    @Test(expected = Exception.class)
    public void testException() throws Exception {
        Lion lion = new Lion("Другое", feline);
    }

}
