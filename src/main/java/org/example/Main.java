package org.example;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        // Checking number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        NumberCheck numberCheck = new NumberCheck();
        numberCheck.checkNumber(number);

        // Checking name
        System.out.print("Enter a name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        NameCheck nameCheck = new NameCheck();
        nameCheck.checkName(name);

        // Checking divisibility by 3
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        DivisibleByThree divisibleByThree = new DivisibleByThree();
        divisibleByThree.printMultiplesOfThree(array);

    }

}
