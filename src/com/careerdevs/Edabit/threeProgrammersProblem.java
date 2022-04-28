package com.careerdevs.Edabit;

public class threeProgrammersProblem {public class Challenge {
    public static int programmers(int one, int two, int three) {
        int max = one;
        int min = one;

        if(two > max){
            max = two;
        }
        if(three > max){
            max = three;
        }
        if(two < min){
            min = two;
        }
        if(three < min){
            min = three;
        }
        return max - min;
    }
}
}

//You hired three programmers and you (hopefully) pay them. Create a function that takes three numbers (the hourly wages of each programmer) and returns the difference between the highest-paid programmer and the lowest-paid.
//
//Examples
//programmers(147, 33, 526) ➞ 493
//
//programmers(33, 72, 74) ➞ 41
//
//programmers(1, 5, 9) ➞ 8