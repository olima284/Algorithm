package com.careerdevs.Edabit;

public class scoringSystem {
    public static int[] calculateScores(String str) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                a++;
            }
            if (str.charAt(i) == 'B') {
                b++;
            }
            if (str.charAt(i) == 'C') {
                c++;
            }
        }
        return new int[]{a, b, c};
    }
}

