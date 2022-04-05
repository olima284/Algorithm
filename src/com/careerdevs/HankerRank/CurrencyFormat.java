package com.careerdevs.HankerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormat {
        public static void main(String[] args) {
                /* Save input */
                Scanner scan = new Scanner(System.in);
                double payment = scan.nextDouble();
                scan.close();

                /* Create custom Locale for India - I used the "IANA Language Subtag Registry" to find India's country code */
                Locale indiaLocale = new Locale("en", "IN");

                /* Create NumberFormats using Locales */
                NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
                NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
                NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
                NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

                /* Print output */
                System.out.println("US: "     + us.format(payment));
                System.out.println("India: "  + india.format(payment));
                System.out.println("China: "  + china.format(payment));
                System.out.println("France: " + france.format(payment));
        }
}


//format integer into currency
//NumberFormat currency = NumberFormat.getCurrencyInstance();
//String result = currency.format( 123456.891);
//System.out.println(result);
//Runs:$123,456.89