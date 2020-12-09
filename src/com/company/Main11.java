package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = 0;
        int l = 0;
        System.out.print("Input the size of Array : ");
        int j = scanner.nextInt();
        int[] myArray = new int[j];
        for (int i = 0; i < j; i++) {
            Random random = new Random();
            int k = random.nextInt(99);
            myArray[i] = k;
        }
        System.out.print("My array : ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int k = 0; k < myArray.length - i - 1; k++) {
                if (myArray[k] > myArray[k + 1]) {
                    l = myArray[k];
                    myArray[k] = myArray[k + 1];
                    myArray[k + 1] = l;
                }
            }
        }
        System.out.print("My sorted array : ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
