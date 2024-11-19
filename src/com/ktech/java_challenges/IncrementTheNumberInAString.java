package com.ktech.java_challenges;

public class IncrementTheNumberInAString {

    public static void main(String[] args) {

        String s = "DRI000EDERS0RE99999";
        int number =0;
        int stringEndIndex =0;

        for(int i = (s.length()-1); i >0; i--)
        {
            try
            {
                 number = Integer.parseInt(s.substring(i));
                 stringEndIndex = i;
            }
            catch (NumberFormatException e)
            {

                break;
            }

        }

        s= s.substring(0,stringEndIndex)+(number+1);
        System.out.println(s);
    }
}
