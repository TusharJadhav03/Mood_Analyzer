package org.example.userregister;

public class MoodAnalyzer {

    public String analyzeMood(String msg){
        if(msg.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
