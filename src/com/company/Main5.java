package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of Array : ");
        int j = scanner.nextInt();
        int[] myArray = new int[j];

        for (int i = 0; i < j; i++) {
            Random random = new Random();
            int k = random.nextInt(99);
            myArray[i] = k;
        }
        System.out.print("My  array : ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        int[] myArray1 = new int[j];
        for (int i = 0; i < j; i++) {
            myArray1[i] = myArray[i];
        }
        System.out.println();
        System.out.print("My copied array : ");
        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i] + " ");
        }
    }
}
