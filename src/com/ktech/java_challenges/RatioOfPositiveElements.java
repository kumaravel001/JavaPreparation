package com.ktech.java_challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class RatioOfPositiveElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n =  sc.nextDouble();
        double numberOfPositive = 0;
        double numberOfNegative = 0;
        double numberOfZeros = 0;
        sc.nextLine();
        int[] integerArray = new int[(int)n];
        for(int i =0; i < n; i++)
        {
            integerArray[i] = sc.nextInt();
        }

        for(int a: integerArray)
        {
            if(a>0)
            {
                numberOfPositive += 1;
            }
            else if(a<0)
            {
                numberOfNegative += 1;
            }
            else
            {
                numberOfZeros += 1;
            }
        }
        System.out.printf("%.5f%n",numberOfPositive/n);
        System.out.printf("%.5f%n",numberOfNegative/n);
        System.out.printf("%.5f%n",numberOfZeros/n);

    }


}
