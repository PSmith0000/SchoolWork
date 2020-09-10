/**
 * ----------------------------------------------------
 * File Name: WindChillMain.Java
 * Project name: Wind Chill Converter
 * ----------------------------------------------------
 * Creator's name: Preston Smith
 * Email prestonsmith0000@gmail.com
 * Course and Section CISP 1010, 20F
 * Creation Date: Sept 8, 2020
 * ----------------------------------------------------
 */

package com.company;

/**
 * <b>Purpose: Our application entry point, Uses (HomeWorkUtils.java & WindChill.java)
 *  -Public Method: main (Entry Point)
 *
 * </b>
 * <hr>
 * Date Created: Sept, 2, 2020
 * <hr>
 * @author Preston Smith
 */
public class WindChillMain {

    public static void main(String[] args) {
        HomeWorkUtils.GetProjectWelcome("Project1");
        Double Temp, WindSpeed; //Ik "D" variant is a class-object however Generics requires this for some reason.
        System.out.println("Enter Temp Value (F)");
        Temp = HomeWorkUtils.GetConsoleInput(Double.class);
        System.out.println("Enter WindSpeed Value (MPH)");
        WindSpeed = HomeWorkUtils.GetConsoleInput(Double.class);
        System.out.println(WindChill.CalculateWindSpeed(WindSpeed, Temp));
    }

}
