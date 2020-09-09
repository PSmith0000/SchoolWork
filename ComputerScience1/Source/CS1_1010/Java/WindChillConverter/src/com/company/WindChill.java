/**
 * ----------------------------------------------------
 * File Name: Windchill.Java
 * Project name: Wind Chill Converter
 * ----------------------------------------------------
 * Creator's name: Preston Smith
 * Email prestonsmith0000@gmail.com
 * Course and Section CISP 1010, 20F
 * Creation Date: Sept 8, 2020
 * ----------------------------------------------------
 */

package com.company;

import com.company.Logging.Logger;

public class WindChill {

    private static boolean ValidData(double Temp, double WindSpeed) {
        if(Temp <= 50 && WindSpeed > 3){
            return true;
        }
        return false;
    }

    public static double CalculateWindSpeed(double WindSpeed, double T) {
        if(ValidData(T, WindSpeed)) {
            double WindSpeedPow = Math.pow((WindSpeed), 0.16);
            return 35.74 + (0.6215 * T) - (35.75 * WindSpeedPow) + (0.4275 * T * WindSpeedPow);
        }
        Logger.CreateLog(Logger.Severity.Error, "Invalid Data Supplied To CalculateWindSpeed. Temp needs to be less than or equal to 50 and WindSpeed must be Greater then 3mph", null);
        return -0.0;
    }

    private static double WindSpeedToMPH(double Knots) {
        return (1.1507794 * Knots);
    }

    private static double ConvertTemp(double degrees, boolean Fahrenheit) {
        return Fahrenheit == true ? (degrees * 9/5) + 32 : (degrees - 32) * 5/9;
    }
}
