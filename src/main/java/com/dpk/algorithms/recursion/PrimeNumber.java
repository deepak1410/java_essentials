package com.dpk.algorithms.recursion;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        if(number <=1) {
            return false;
        }

        return isPrime(number, 2);
    }

    private static boolean isPrime(int number, int divisor) {
        if(number == divisor) {
            return true;
        } else if(number % divisor == 0) {
            return false;
        }

        return isPrime(number, divisor+1);
    }

    public static void main(String[] args) {
        int num = 2;
        System.out.println("Is " + num + " a prime number :" + isPrime(num));

        num = 10;
        System.out.println("Is " + num + " a prime number :" + isPrime(num));

        num = 9;
        System.out.println("Is " + num + " a prime number :" + isPrime(num));

        num = 1;
        System.out.println("Is " + num + " a prime number :" + isPrime(num));

        num = 19;
        System.out.println("Is " + num + " a prime number :" + isPrime(num));
    }
}
