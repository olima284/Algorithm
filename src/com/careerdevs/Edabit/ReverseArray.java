package com.careerdevs.Edabit;

public class ReverseArray {
    public static int[] reverse(int[] arr) {
;
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }


        return arr;
    }
}




/*
*Take input the size of the array and the elements of the array.
*To reverse an int array,  swap items up until it reach the midpoint
*swap each element twice, so the result is the same as the initial list
 *new array is iterated from its last element.
 * function swaps the array's first element with last
    // element, second element with last second element and
    // so on
    *
    *  In this method, we swap the elements of the array. The first element is swapped with the last element. The second element is swapped with the last but one element and so on.
For instance, consider array [1, 2, 3, …., n-2, n-1, n]. We swap 1 with n, 2 with n-1, 3 with n-2 and further
*/

//python
/*
//1st The Slice notation in python has the syntax -
//list[<start>:<stop>:<step>]
//so 1st[::-1], it starts from the end towards the first taking each element.
//So it reverses 1st
def reverse(lst):
return lst[::-1]

 */
/*
* to slice the whole list,
* that is return the list as is, you can leave out both the start and the stop indexes
* 1st[::]
*To reverse a list in Python, you can use negative slicing
*, [::-1] means reversing a string, list, or any iterable with an ordering.
*  For example: hello = "Hello world" nums = [1, 2, 3, 4] print(hello[::-1])

 * */


//Slicing in python
//slicing makes it possible to access parts of sequences,
// such as strings or list,
//multiple values are accessed
//Slicing uses indexing to access the range of elements.
// These indexes are also zero-based