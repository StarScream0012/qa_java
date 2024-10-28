package com.example;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class FelineTest {

    @Test
    public void eatMeatTest(){
        Feline feline = new Feline();
        List expected = List.of("Животные", "Птицы", "Рыба");
        try {
            List actual = feline.eatMeat();
            Assert.assertEquals(expected, actual);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expected, actual);
    }
}
