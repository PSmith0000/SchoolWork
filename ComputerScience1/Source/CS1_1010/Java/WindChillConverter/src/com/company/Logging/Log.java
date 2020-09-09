package com.company.Logging;

public class Log {

    public Log(Logger.Severity _severity, String _msg, Exception _exception) {
        severity = _severity;
        Message = _msg;
        exception = _exception;
    }

    public Logger.Severity severity;
    public String Message;
    public Exception exception;

    public void PrintLog() {
        System.out.println(String.format("Severity: %s, Message: %s, Exception: %s", severity, Message, exception));
    };
}
