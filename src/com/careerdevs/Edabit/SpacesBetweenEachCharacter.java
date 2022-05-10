package com.careerdevs.Edabit;

public class SpacesBetweenEachCharacter {
    public static String spaceMeOut(String str) {
        return str.replaceAll(""," ").trim();
    }

}



/*
* yourString.replace("", " ").trim()
 * This replaces all "empty substrings"
* with a space, and then trims off the leading / trailing spaces.
*
*How do I add a space between characters in a string?
* You can use the regular expression ‘..’ to match each two characters
* and replace it with “$0 ” to add the space: s = s. replaceAll(“..”, “$0 “);
*
*How do you put spaces between letters in python?
Add Spaces in Python pandas – (Add Leading, Trailing Spaces to…

Add Space at the start of the string in Python – rjust() function in python.
Add space at the end of the string in Python – ljust() function in python.
Add white spaces at start and end of the string in python – center() function in python.
*
*
* How do you add spaces between spaceless strings in Python?
Following are the steps in the recursive method:

Make a sorted dictionary of the possible substrings.
Sort the dictionary descending by length (Implementing the 2.
If the sorted dictionary is empty then return the input string and mark it as nonsense.
Iterate through all the entries in the sorted dictionary. */