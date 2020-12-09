package com.company;

public class Main8 {
    public static void main(String[] args) {
        String[] cars1 = {"Mercedes", "Opel", "Shkoda", "Porsche", "Chevrolet", "Audi"};

        String[] cars2 = {"Audi", "Bmw", "Bentley", "Pontiac", "Dodge", "Mercedes", "Jaguar"};
        System.out.print("Array1 : ");
        for (int i = 0; i < cars1.length; i++)
            System.out.print(cars1[i] + " ");
        System.out.println();
        System.out.print("Array2 : ");
        for (int i = 0; i < cars2.length; i++)
            System.out.print(cars2[i] + " ");
        System.out.println();

        for (int i = 0; i < cars1.length; i++) {
            for (int j = 0; j < cars2.length; j++) {
                if (cars1[i] == (cars2[j])) {
                    System.out.println(cars1[i]);
                }
            }
        }
    }
}
