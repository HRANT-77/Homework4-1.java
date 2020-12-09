package com.company;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of Array");
        int j = scanner.nextInt();
        int[] myArray = new int[j];
        for (int i = 0; i < j; i++) {
            System.out.println("Input Array number");
            int k = scanner.nextInt();
            myArray[i] = k;
        }
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];

        }
        System.out.println(sum);
    }
}
