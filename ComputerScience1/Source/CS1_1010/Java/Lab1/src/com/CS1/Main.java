package com.CS1;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) {
        Scanner inputStream = new Scanner(System.in); //Create input stream to read from.

        while(true)
        {
            try //java enforces the use of TryCatch
            {
                System.out.println("Enter Expression...");
                ParseExpression(inputStream.next());
                Thread.sleep(25); //take load off the cpu
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    //This is Extremely Lazy, However saves time...
    //use JS to parse our expression
    public static void ParseExpression(String exp)
    {
        ScriptEngineManager SEM = new ScriptEngineManager();
        ScriptEngine JSE = SEM.getEngineByName("JavaScript");
        try
        {
            System.out.println(JSE.eval(exp));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
