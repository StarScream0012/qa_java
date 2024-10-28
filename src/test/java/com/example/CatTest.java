package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Test
    public void getSoundTest(){
        Cat cat = new Cat(new Feline());
        String expected = "Мяу";
        String actual = cat.getSound();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getFoodTest() throws Exception {
        List expected = List.of("Животные", "Птицы", "Рыба");
        Cat cat = new Cat(new Feline());
        List actual = cat.getFood();
        Assert.assertEquals(expected,actual);
    }
}
