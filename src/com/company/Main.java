package com.company;

import com.company.mylib.Account;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName ("sebastian Rubacha");
        System.out.println(acc.getName());
        System.out.printf("%s%n",Account.capitalize("stanisLaw maruSARz"));
    }

}
