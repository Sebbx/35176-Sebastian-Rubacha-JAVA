package com.company.mylib;

import javax.swing.*;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class StringFun {
    public static String Anarchize(String sentence) {
        int dlugosc = sentence.length();
        char ch[] = sentence.toCharArray();

        if (Character.isLowerCase(sentence.charAt(0))) {
            for (int i = 1; i < dlugosc; i += 2) {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        else {
            for (int i = 0; i < dlugosc; i += 2) {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }

        return new String(ch);
    }

    public static String Camelize(String sentence) {
        String normalizedSentence = StringUtils.normalizeSpace(sentence);
        String[] parts = normalizedSentence.split(" ");
        String camelCaseString = "";
        for (String part : parts) {
            camelCaseString = camelCaseString + toProperCase(part);
        }
        char ch[] = camelCaseString.toCharArray();
        ch[0] = Character.toLowerCase(ch[0]);

        return new String(ch);
    }

    static String toProperCase(String s) {
        return s.substring(0, 1).toUpperCase() +
                s.substring(1).toLowerCase();
    }

    public static String DecamelizeA(String sentence){

        sentence = sentence.substring(0, 1).toLowerCase() + sentence.substring(1);

        int dlugosc = sentence.length();
        char charSentence[] = sentence.toCharArray();

        String decamelizeSentence = "";

        for(int i = 0; i < dlugosc; i++ )
        {
            if (Character.isUpperCase(charSentence[i]))
            {
                decamelizeSentence += " ";
            }
            decamelizeSentence += charSentence[i];

        }
        decamelizeSentence = decamelizeSentence.substring(0, 1).toUpperCase() + decamelizeSentence.substring(1);
        return decamelizeSentence;

    }

    public static String DecamelizeB(String sentence) {
        int a = 0,b;

        sentence = sentence.substring(0, 1).toLowerCase() + sentence.substring(1);

        String decamelizeSentence = "";

        int length = sentence.length();
        char charSentence[] = sentence.toCharArray();


        for (int i = 0; i<length; i++)
        {
            if (Character.isUpperCase(charSentence[i]))
            {
                b = i;
                decamelizeSentence += sentence.substring(a, b).toLowerCase() + " ";
                a = b;

            }
            if(i == length - 1)
            {
                decamelizeSentence += sentence.substring(a, length).toLowerCase();
            }
        }
        decamelizeSentence = decamelizeSentence.substring(0, 1).toUpperCase() + decamelizeSentence.substring(1);

        return decamelizeSentence;
    }

    public static boolean IsPalindrome(String sentence)
    {
        String reversedSentence = "";

        sentence = sentence.replaceAll("\\s","");

        sentence = sentence.toLowerCase();

        int lenght = sentence.length();

        for (int i = 0; i < lenght; i++)
        {
            reversedSentence += sentence.substring(lenght - i - 1,lenght - i);
        }

        if (sentence.equals(reversedSentence))
        {
            return true;
        }
        else return false;
    }
}
