package com.ktech.java_challenges;

public class IncrementingString {

    public static void main(String[] args) {

        String s = "I-0621";
        int number = 0;
        String newString ="";
        boolean isStringOnlyNumbers = true;
        for(int i = s.length()-1; i>=0; i--)
        {
            try
            {
                number = Integer.parseInt(s.substring(i)); // 0621
            }
            catch (NumberFormatException e)
            {                                           //i=1
                isStringOnlyNumbers = false;
                number = number+1;   //0622
                System.out.println(number);
                newString = s.substring(0,i+1);  //I-
                if((newString+number).length()>s.length())
                {
                   newString  =  newString+  (""+number).substring(1);
                }
                else
                {
                    newString = newString+number; //I-621
                }
             break;

            }

        }
        if(isStringOnlyNumbers)
        {
            newString = ""+(number+1);
            if(newString.length()>s.length())
            {
                newString = newString.substring(1);
            }

            System.out.println(newString);
        }
        else
        {
            System.out.println(newString);
        }

    }
}
