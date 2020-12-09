package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main6 {
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
        int min = myArray[0];
        System.out.print("My  array : ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        for (int i = 1; i < j; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }
        System.out.println();
        System.out.println("Min element of this array " + min);
    }
}
