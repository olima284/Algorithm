package com.careerdevs.Edabit;

public class xOBoolean {
    public static boolean getXO(String str) {

        int xo = 0;
        int os = 0;
//start x/o To get the index of first character
//Count Char String Occurrences
//(|| or  )
//charAt() method returns the character at the specified index
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'x') {
                xo++;
            }
            if (str.charAt(i) == 'o' || str.charAt(i) == 'Y') {
                os++;
            }
        }
        if (xo == os) {
            return true;
        }
        return false;
    }
}


/*
Return:
boolean
The string can contain any character = 3 char == A, X ,O

True:
if the amount of x's and o's are the same
When "x" and "o" are not in the string.

False:
if they aren't the same amount.

Count Char String Occurrences
charAt() Method
The charAt() method returns the character at the specified index in a string.

The index of the first character is 0, the second character is 1, and so on.



*/
