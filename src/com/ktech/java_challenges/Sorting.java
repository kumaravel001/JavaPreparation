package com.ktech.java_challenges;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] integerArray = {4,5,1,2,3};
        for(int i =0; i <integerArray.length && i!=(integerArray.length-1); i++)
        {
            int temp = 0;
            for(int j= i+1; j<integerArray.length; j++)
            {
                if(integerArray[i]>integerArray[j])
                {
                    temp = integerArray[j];
                    integerArray[j] = integerArray[i];
                    integerArray[i] = temp;

                }
            }


        }

        System.out.println(Arrays.toString(integerArray));
    }
}
