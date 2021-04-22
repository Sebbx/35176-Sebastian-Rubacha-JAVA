package com.company;

public class Main {
    public static void main(String[] args)
    {

        System.out.print("Ptaki\n");
        System.out.print("lataja\n");
        System.out.print("kluczem\n");

        int a = 5;
        double b = 2.32;
        String s = "Tekst";

        System.out.printf("a = %d, b = %.2f, s = %20s %n",a,b,s);

        System.out.print("Nazywaliśmy to „witaminą B3\"\n");

        System.out.printf("alfa\tsin(alfa)\n");
        for (int i = 0; i <370; i+=10)
            System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));

    }
}
