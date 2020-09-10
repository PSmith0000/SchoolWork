/**
 * ----------------------------------------------------
 * File Name: Main.Java
 * Project name: Temp Converter
 * ----------------------------------------------------
 * Creator's name: Preston Smith
 * Email prestonsmith0000@gmail.com
 * Course and Section CISP 1010, 20F
 * Creation Date: Sept 2, 2020
 * ----------------------------------------------------
 */


package com.company;

import java.util.Scanner;

/**
 * <b>Purpose: Class to convert one Temp Degree to another
 *  -Public Method: TempConverter
 * </b>
 * <hr>
 * Date Created: Sept, 2, 2020
 * <hr>
 * @author Preston Smith
 */

public class Lab3Main {
    final static String csDesp = "Preston Smith\n" +
            "CISP 1010 20F\n" +
            "Project: Lab3";

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(csDesp + "\n\n");
        while(true)
        {
           System.out.println("Enter Degrees..\n");
           Double temp = Double.parseDouble(input.next());

           System.out.println("Temp In Celsius: " + TempConverter(temp, true));
        }
    }

    /** Method description: Converts One Degree to Another
     * Date created 9/2/2020
     * @param Degrees - Degrees in temp
     * @return Double: Converted Temp
     * */

    public static Double TempConverter(Double Degrees, Boolean t)
    {
        return t == true ? ((Degrees * 9/5) + 32) : ((Degrees - 32) * 5/9);
    }
}
