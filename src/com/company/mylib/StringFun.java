package com.company.mylib;
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
}
