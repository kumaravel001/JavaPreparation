package com.ktech.java_challenges;

public class InterfaceClass implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {

        int sumOfDivisors =0;

        for(int i=1; i<=n; i++)
        {
            sumOfDivisors = (n%i == 0)? sumOfDivisors+i: sumOfDivisors;
        }
        return  sumOfDivisors;
    }

}

 class InterfaceMain extends InterfaceClass
{
    public static void main(String[] args) {
        InterfaceClass arithmeticCalculation = new InterfaceClass();
        System.out.println(arithmeticCalculation.divisor_sum(6));
    }

}
