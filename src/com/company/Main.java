package com.company;

import com.company.mylib.Account;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //AnarchizeTest.main();
        //CamelizeTest.main();
        //DecamelizeTestA.main();
        //DecamelizeTestB.main();
        //IsPalindromeTest.main();
        //ShuffleTest.main();

        StrongPasswordGenerator strongPasswordGenerator = new StrongPasswordGenerator();

        for (int i = 0; i < 5; i++)
        {
            strongPasswordGenerator.Generate(20, true,true,true,true,"!@#$%^&*()");
            System.out.print("\n");
        }






    }
}
