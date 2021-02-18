package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int i = 111111;
        System.out.printf("All divisors of number %d: %s", i, Exercise.Calculate(i));
        
    }
}