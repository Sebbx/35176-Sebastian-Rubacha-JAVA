package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static String leftPad(String aText, char aChar, int aWidth)
    {
        String res = aText;
        for (int i = 0; i < aWidth * aText.length(); i++)
            res = aChar + res;
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.print("Podaj liczbę do przekonwertowania na typ szesnastkowy ");
        num1 = input.nextInt();
        String hexNum = leftPad(Integer.toHexString(num1), '0', 3);
        String binNum = leftPad(Integer.toBinaryString(num1), '0', 1);
        System.out.println("liczba " + num1 + " w:\nPostaci szesnastkowej to " + hexNum.toUpperCase() + "\nPostaci binarnej to " + binNum.toUpperCase() );
    }
}
