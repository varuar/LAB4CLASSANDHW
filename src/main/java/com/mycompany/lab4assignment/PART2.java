package com.mycompany.lab4assignment;

public class PART2 {
// this is the function to calculate sum of multiples of 7 between two numbers using recursion
public static int sumMultiplesOfSeven(int n1, int n2) {
    
    // we have a base case here
    if (n2 < n1) {
        return 0;
    }
    
    // this is the recursive case
    if (n2 % 7 == 0) {
        return n2 + sumMultiplesOfSeven(n1, n2 - 7);
    } else {
        return sumMultiplesOfSeven(n1, n2 - 1);
    }
}

public static void main(String[] args) {
    int n1 = 14;
    int n2 = 49;
    int sum = sumMultiplesOfSeven(n1, n2);
    System.out.println("Sum of multiples of 7 between " + n1 + " and " + n2 + " is " + sum);
}
}