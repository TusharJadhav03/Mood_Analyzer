package org.example.userregister;

public class MoodAnalyzer extends  Exception{

    private String msg;

    public MoodAnalyzer(){

    }
    public MoodAnalyzer(String msg){
        this.msg = msg;
    }

    public String analyzeMood(){
        try {
            if (msg.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }
        catch (NullPointerException e){
            return "HAPPY";
        }

    }
}
