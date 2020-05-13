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
    A private static variable of type int would have to be created. private static int numTimesInvalid.
    Accessor method that returns numTimesInvalid. public int getNumTimesInvalid()
    When isValid returns false, count increases by one. 
    Create a static method returning an int that returns the value of numTimesInvalid
     */
}
