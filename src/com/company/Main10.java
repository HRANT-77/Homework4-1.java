package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        int index = 0;
        int secondmax = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of Array : ");
        int j = scanner.nextInt();
        int[] myArray = new int[j];
        for (int i = 0; i < j; i++) {
            Random random = new Random();
            int k = random.nextInt(99);
            myArray[i] = k;
        }
        int max = myArray[0];
        System.out.print("My first array : ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        for (int i = 1; i < j; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Max element of this array " + max);
        myArray[index] = 0;
        for (int i = 1; i < j; i++) {
            if (secondmax < myArray[i]) {
                secondmax = myArray[i];
            }
        }
        myArray[index] = max;
        System.out.println("Second max element of this array " + secondmax);
    }
}