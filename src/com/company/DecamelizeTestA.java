package com.company;

import com.company.mylib.StringFun;
import java.util.Scanner;

public class DecamelizeTestA {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nWprowadź tekst do przekształcenia (napisz \"stop\" aby zakończyć): ");
            String sentence = scanner.nextLine();
            if (sentence.equals("stop")) break;
            System.out.print(StringFun.DecamelizeA(sentence));
        }
        while (true);
    }
}
