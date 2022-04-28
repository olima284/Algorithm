package com.careerdevs.Edabit;

public class ReverseString {

        public static String reverse(final String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                result = str.charAt(i) + result;
            }

            return result;
        }
    }
//str.charAt(i); //extracts each character
// result = str.charAt(i) + result adds each character in front of the existing string
// return result
