package test;

import java.time.Period;
import java.util.Random;
import java.util.function.*;

public class TestMain {
    public static void main(String[] args) {
        IntFunction bigger = (x) -> x + 2;
        System.out.println(bigger.apply(50));
    }
}