package com.careerdevs.Edabit;

import java.util.HashSet;

public class totalNumberOfUniqueCharacters {

    public class Program {
        public static int countUnique(String s1, String s2) {
            String comb = s1 + s2;
            HashSet<Character> countUn = new HashSet<>();
            for (int i = 0; i < comb.length(); i++) {
                countUn.add(comb.charAt(i));
            }
            return countUn.size();
        }
    }
}


/**/



/*
*comboined String 1 and 2

*calculate the length using the a forloop
 * Given two strings,
 * HashSet doesn't allow duplicate elements.
 *
* create a function that returns the total number of unique characters from the combined string.

*Each word will contain at least one letter.
*All words will be lower cased.
*/