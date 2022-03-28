package com.careerdevs.HankerRank;

import java.util.Scanner;

public class Day01HelloWorld {
    public static void main(String[] args) {

    // Create a Scanner object to read input from stdin.
    Scanner scan = new Scanner(System.in);

    // Read a full line of input from stdin and save it to our variable, inputString.
    String inputString = scan.nextLine();

    // Close the scanner object, because we've finished reading
    // all of the input from stdin needed for this challenge.
        scan.close();

    // Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");

    // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
  }

    public static void Day7Arrays() {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int[] arr = new int[n];
                for(int i=0; i < n; i++){
                    arr[i] = in.nextInt();
                }
                in.close();
                for(int i = n - 1; i > -1; i--){
                    System.out.print(arr[i] + " ");
                }
            }
        }

