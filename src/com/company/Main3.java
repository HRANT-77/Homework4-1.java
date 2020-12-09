package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
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
        do {
            int z = 0;
            System.out.println();
            System.out.print("Input the number ");
            int num = scanner.nextInt();

            for (int i = 0; i < myArray.length; i++) {
                if (num == myArray[i]) {
                    System.out.print("The index of this number is ");
                    System.out.println(i);
                    z += 1;
                }
            }
            if (z == 0) {
                System.out.println("Wrong number, please try again");
            }
        } while (true);
    }
}
