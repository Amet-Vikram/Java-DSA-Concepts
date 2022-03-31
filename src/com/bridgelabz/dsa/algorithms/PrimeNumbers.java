package com.bridgelabz.dsa.algorithms;

public class PrimeNumbers {

    PrimeNumbers(){}

    public boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers pm = new PrimeNumbers();
        System.out.println("Prime Number between 0-1000 are: ");
        for (int i = 0; i < 1000; i++) {
            if(pm.isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
