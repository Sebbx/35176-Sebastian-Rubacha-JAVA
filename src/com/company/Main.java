package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("Podaj liczbę do przekonwertowania na typ szesnastkowy ");
        num1 = input.nextInt();
        System.out.println("liczba " + num1 + " w:\nPostaci szesnastkowej to " + Integer.toHexString(num1) + "\nPostaci binarnej to " + Integer.toBinaryString(num1) );
    }
}
