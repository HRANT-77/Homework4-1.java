package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the size of Array ");
        int j = scanner.nextInt();
        int[] myArray = new int[j];
        int z = 0;
        int index = 0;
        for (int i = 0; i < j; i++) {
            Random random = new Random();
            int k = random.nextInt(99);
            myArray[i] = k;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("Input the number");
        int num = scanner.nextInt();
        for (int i = 0; i < myArray.length; i++) {
            if (num == myArray[i]) {
                System.out.print("The index of this number is ");
                System.out.println(i);
                z += 1;
                index = i;
            }
        }
        if (z == 0) {
            System.out.println("Wrong number, please try again");
        } else if (z != 0) {
            int[] myArray1 = new int[j - 1];
            for (int i = 0; i < index; i++) {
                myArray1[i] = myArray[i];
            }
            for (int i = index; i < j - 1; i++) {
                myArray1[i] = myArray[i + 1];
            }
            for (int i = 0; i < myArray1.length; i++) {
                System.out.print(myArray1[i] + " ");
            }
        }
    }
}
