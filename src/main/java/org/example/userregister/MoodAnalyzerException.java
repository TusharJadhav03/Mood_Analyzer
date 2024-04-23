package org.example.userregister;

public class MoodAnalyzerException extends Exception{

    public enum ExceptionType{
        NULL,EMPTY;
    }
    ExceptionType type;
    public MoodAnalyzerException(ExceptionType type,String msg){
        super(msg);
        this.type = type;
    }
}
