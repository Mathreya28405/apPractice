package com.company;

public class CheckDigit {
    public static int getCheck(int num) { /* implementation not shown */ }
    public static boolean isValid(int numWithCheckDigit) {
        int x = numWithCheckDigit % 10;
        if (getCheck(numWithCheckDigit/10) == x) {
            return true;
        }
        return false;
    }

    /*
    A private static int variable would have to be created to keep track of the total number of times isValid returns false.
    A method can be written with an if statement where if the return of isValid is false, count increases by one.
     */
}
