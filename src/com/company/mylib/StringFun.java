package com.company.mylib;

import javax.swing.*;
import org.apache.commons.lang3.StringUtils;

public class StringFun
{
    public static String Anarchize(String sentence)
    {
        int dlugosc = sentence.length();
        char ch[]=sentence.toCharArray();

        if(Character.isLowerCase(sentence.charAt(0)))
        {
            for (int i = 1; i < dlugosc; i +=2)
            {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        else
        {
            for (int i = 0; i < dlugosc; i +=2)
            {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }

        return new String(ch);
    }

    public static String Camelize(String sentence)
    {
        String normalizedSentence = StringUtils.normalizeSpace(sentence);
        String[] parts = normalizedSentence.split(" ");
        String camelCaseString = "";
        for (String part : parts){
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
}
