package org.example;
import java.util.Scanner;

public class DivisibleByThree {
    public void printMultiplesOfThree(int [] array) {
        System.out.println("Numbers divisible by 3:");
        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}
