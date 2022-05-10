package com.careerdevs.Edabit;

public class getTheFileName {
    public static String getFilename(String path) {
        return path.substring(path.lastIndexOf("/")+1);
    }
}




/*
*lastIndexOf() method to get the file extension.
* contains() method is used to check whether the specified char is present in the string or not and the lastIndexOf()
* method returns an index value of the specified char which is passed into substring() method to get file extension
*Get the File Name
*Tests will include both absolute and relative paths.
For simplicity, all paths will only include forward slashes.
*Create a function that returns the selected filename from a path including the file extension.
*/