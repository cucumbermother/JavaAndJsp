package org.koreait.exam03;

import org.koreait.exam02.Calculator;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        if (num < 1L) {
            return 1L;
        }

        return num * factorial(num - 1L);
    }
}
