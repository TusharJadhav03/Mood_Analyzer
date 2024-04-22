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


}