package org.example.userregister;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

    @Test
    void analyzeMood() throws Exception{
        String mood = moodAnalyzer.analyzeMood("I am in Sad Mood".toLowerCase());
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    void analyzeHappyMood() throws  Exception{
        String mood = moodAnalyzer.analyzeMood("I am in Any mood".toLowerCase());
        Assertions.assertEquals(mood,"HAPPY");
    }


}