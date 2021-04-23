package com.company;

import com.company.mylib.StringFun;
import java.util.Scanner;

public class IsPalindromeTest {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nWprowadź tekst do sprawdzenia (napisz \"stop\" aby zakończyć): ");
            String sentence = scanner.nextLine();
            if (sentence.equals("stop")) break;
            System.out.print(StringFun.IsPalindrome(sentence));
        }
        while (true);
    }
}
