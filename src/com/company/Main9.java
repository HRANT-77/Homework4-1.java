package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main9 {
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
            for (int z = i + 1; z < myArray.length; z++) {
                if (myArray[i] == myArray[z]) {
                    System.out.println(myArray[i] + " is dublicated");
                    quantity += 1;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int z = i + 1; z < myArray.length; z++) {
                if (myArray[i] == myArray[z]) {
                    myArray[i] = 404;
                    myArray[z] = 404;
                }
            }
        }
        int[] myArray1 = new int[j - quantity];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != 404) {
                myArray1[l] = myArray[i];
                l++;
            }
        }
        System.out.print("My array without dublicate : ");
        for (int i = 0; i < myArray1.length; i++) {
            System.out.print(myArray1[i] + " ");
        }
        System.out.println();
        System.out.println("Quantity deleted numbers " + quantity);
    }
}
