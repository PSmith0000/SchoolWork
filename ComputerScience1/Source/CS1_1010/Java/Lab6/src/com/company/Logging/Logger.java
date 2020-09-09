/**
 * <b>Purpose: Error Logging and storing
 *  -Public Method: CreateLog(Severity severity, String Message, Exception exception) Create a new Log() object and add its to the list
 * </b>
 * <hr>
 * Date Created: Sept, 2, 2020
 * <hr>
 * @author Preston Smith
 */

package com.company.Logging;

import java.util.ArrayList;

public class Logger {
    //ArrayList of Logs that we store
    public static ArrayList<Log> Logs = new ArrayList<Log>();

    //Severity Type of our log
    public enum Severity {
        Error,
        Debug,
        Info
    };

    /** Method description: Gets our project welcome message
     * Date created 9/2/2020
     * @param severity - Severity Level
     * @param Message - Log Message
     * @param exception - Resulted Exception
     * */
    public static void CreateLog(Severity severity, String Message, Exception exception)
    {
        var log = new Log(severity, Message,   exception);
        Logs.add(log);
        log.PrintLog();
    }
}
