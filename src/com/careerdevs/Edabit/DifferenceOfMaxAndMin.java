package com.careerdevs.Edabit;
import java.util.*;


public class DifferenceOfMaxAndMin {
    public static void main(String[] args) {


        class Challenge {
            public static int differenceMaxMin(int[] arr) {
                int min = Arrays.stream(arr).min().getAsInt();
                int max = Arrays.stream(arr).max().getAsInt();
                return max - min;
            }
        }
//stream(T[] array) method of Arrays class in Java
//arrays.stream() to convert string array to stream
//These specific elements are taken from a range of index passed as the parameter to this method. It Returns a sequential
//Stream with the specified range of the specified array as its source.
//Steam meaning sequence of elements from a source.
    }
}



//Python
// min() is an inbuilt function that returns the smallest of all the input values.
// Python max() is an inbuilt function that returns the largest of the input
//def difference_max_min(lst):
//		return max(lst) - min(lst)




//  Create a function that takes an array and returns the difference between the biggest and smallest numbers.

//        Examples
//differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
// Smallest number is -50, biggest is 32.
//        ➞ 67
//        differenceMaxMin([44, 32, 86, 19])
// Smallest number is 19, biggest is 86.