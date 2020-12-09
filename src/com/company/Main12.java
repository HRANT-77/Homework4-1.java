package com.company;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input word : ");
        String a = scanner.nextLine();
        int q = 0;
        int z1 = a.length() + 1;
        for (int i = 0; i < a.length() / 2; i++) {
            z1--;
            if (a.substring(i, i + 1).equals(a.substring(z1 - 1, z1))) {
                q++;
            }
        }
        if (q == a.length() / 2) {
            System.out.println("This word is Polindrom");
        } else {
            System.out.println("This word is not Polindrom");
        }
    }
}
