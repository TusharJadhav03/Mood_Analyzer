package org.example.userregister;

public class MoodAnalyzer {

    private String msg;

    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String msg){
        this.msg = msg;
    }

    public String analyzeMood(){
        if(msg.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
