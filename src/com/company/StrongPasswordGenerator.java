package com.company;

import com.company.mylib.StringFun;

import java.util.Random;

public class StrongPasswordGenerator {
    public void Generate(int dlugosc, boolean maleLitery, boolean wielkieLitery, boolean cyfry, boolean znakiSpecjalne, String dozwoloneZnakiSpecjalne) {
        Random random = new Random();
        String haslo = "";
        for (int i = 0; i < dlugosc; i++)
        {
            if (maleLitery)
            {
                haslo += LosowaMalaLitera();
            }
            if (wielkieLitery)
            {
                haslo += LosowaWielkaLitera();
            }
            if (cyfry)
            {
                haslo += LosowaCyfra();
            }
            if(znakiSpecjalne)
            {
                int lenght = dozwoloneZnakiSpecjalne.length();
                int ran = random.nextInt(lenght);

                char znakiSpecjalneChar[] = dozwoloneZnakiSpecjalne.toCharArray();

                haslo += znakiSpecjalneChar[ran];

            }
        }
        haslo = StringFun.Shuffle(haslo);
        haslo = haslo.substring(0, dlugosc);
        haslo = StringFun.Shuffle(haslo);
        System.out.print(haslo);
    }

    char LosowaMalaLitera() {
        Random random = new Random();

        String maleLitery = "qwertyuiopasdfghjklzxcvbnm";
        char maleLiteryChar[] = maleLitery.toCharArray();
        int maleLiteryLenght = maleLitery.length();

        int ran = random.nextInt(maleLiteryLenght);
        return maleLiteryChar[ran];
    }

    char LosowaWielkaLitera() {
        char lWL = LosowaMalaLitera();
        return Character.toUpperCase(lWL);
    }

    char LosowaCyfra() {
        Random random = new Random();

        String cyfry = "1234567890";
        char cyfryChar[] = cyfry.toCharArray();
        int cyfryLenght = cyfry.length();

        int ran = random.nextInt(cyfryLenght);
        return cyfryChar[ran];
    }

}

