package org.example.userregister;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyzerTest {

    @Test
    void analyzeMood() throws MoodAnalyzerException {

        MoodAnalyzer moodAnalyzer1 = new MoodAnalyzer("I am in Sad mood".toLowerCase());
        String mood = moodAnalyzer1.analyzeMood();
        Assertions.assertEquals(mood,"SAD");
    }

    @Test
    void analyzeHappyMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer2 = new MoodAnalyzer("I am in Any mood".toLowerCase());
        String mood = moodAnalyzer2.analyzeMood();
        Assertions.assertEquals(mood,"HAPPY");
    }

    @Test
    void analyzeNullMood() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer3 = new MoodAnalyzer(null);

        try {
            moodAnalyzer3.analyzeMood(null);
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals("Enter a valid Input",e.getMessage());
        }
    }

}