package com.careerdevs.Edabit;

public  class existsANumberHigher {
    public static void main(String[] args) {
        
    }
            public static boolean existsHigher ( int[] arr, int n){
                boolean isHigher = false;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] >= n) {
                        isHigher = true;
                        break;
                    }
                }
                return isHigher;
            }
        }


//Write a function that returns true if there exists at least one number that is larger than or equal to n.
//
//Examples
//existsHigher([5, 3, 15, 22, 4], 10) ➞ true
//
//existsHigher([1, 2, 3, 4, 5], 8) ➞ false
//
//existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true
//
//existsHigher([], 5) ➞ false