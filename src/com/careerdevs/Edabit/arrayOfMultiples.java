package com.careerdevs.Edabit;
import java.util.*;

public class arrayOfMultiples {
    public static void main(String[] args) {

    }

        public static int[] arrayOfMultiples ( int num, int length){
// defined the array and value

            int[] solution = new int[length];

            for (int i = 0; i < length; i++) {
                solution[i] = num * (i + 1);
            }

            return solution;

    }
    }


