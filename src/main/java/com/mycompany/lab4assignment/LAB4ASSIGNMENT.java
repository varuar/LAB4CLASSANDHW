package com.mycompany.lab4assignment;

public class LAB4ASSIGNMENT {

public static void main(String[] args) {
    int n = 5; // the number of times to print "Hello World"
    printHelloWorld(n);
}

public static void printHelloWorld(int n) {
        if (n <= 0) {
        return;
}
        System.out.println("Hello World");
        printHelloWorld(n-1); // recursively call the function with n-1
}
}

