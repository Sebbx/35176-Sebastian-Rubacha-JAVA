package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0, num2=0;
        do {
            System.out.print("Podaj liczby, ktore mam dodac: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            if ((num1 == 0) && (num2 == 0)) break;
            System.out.printf("Wynik dodawania %d + %d = %d%n", num1, num2, num1 + num2);
        } while (true);


    }
}
