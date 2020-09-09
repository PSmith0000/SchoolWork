/**
 * <b>Purpose: Useable Methods across the entire (CISP 1010 Class)
 *  -Public Method: GetConsoleInput() Gets the next user input and returns the value
 *  -Public Method: GetProjectWelcome(String ProjectName) Gets our project welcome message.
 * </b>
 * <hr>
 * Date Created: Sept, 2, 2020
 * <hr>
 * @author Preston Smith
 */

package com.company;

import com.company.Logging.Logger;

import java.lang.reflect.Type;
import java.util.Scanner;

public class HomeWorkUtils {
    //Scanner Object for our system.in parsing.
    private static Scanner input = new Scanner(System.in);

    /** Method description: Gets the next user input from Scanner
     * Date created 9/2/2020
     * @param t - Our desired return type (bc java is terrible and generics suck in it)
     * */
    public static <T> T GetConsoleInput(Type t) { //Generics in this language suck....
        try {
            while(true) {
                if(input.hasNext()) {
                    var TypeName = t.getTypeName();
                   if(TypeName == String.class.getTypeName()) {
                       return (T)input.next();
                   }
                   else if (TypeName == Integer.class.getTypeName()) {
                       return (T)new Integer(input.nextInt());
                   }
                   else if(TypeName == Double.class.getTypeName()) {
                       return (T)new Double(input.nextDouble());
                   }
                   else if(TypeName == Float.class.getTypeName()) {
                       return (T)new Float(input.nextFloat());
                   }
                    return (T)null;
                }
                Thread.sleep(25);
            }
        } catch (Exception e) {
            Logger.CreateLog(Logger.Severity.Error, e.getMessage(), e);
            return (T)null;
        }
    }

    /** Method description: Gets our project welcome message
     * Date created 9/2/2020
     * @param ProjectName - Current Project Name
     * */
    public static void GetProjectWelcome(String ProjectName) {
        System.out.println("Preston Smith\n" + "CISP 1010 20F\n" + "Project: " + ProjectName);
    }
}


