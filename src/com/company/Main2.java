package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of Array ");
        int j = scanner.nextInt();
        int[] myArray = new int[j];


        for (int i = 0; i < j; i++) {
            Random random = new Random();
            int k = random.nextInt(99);
            myArray[i] = k;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        int average = sum / myArray.length;
        System.out.println();
        System.out.print("The sum of Array is ");
        System.out.println(sum);
        System.out.print("The average of Array is ");
        System.out.print(average);
    }
}
