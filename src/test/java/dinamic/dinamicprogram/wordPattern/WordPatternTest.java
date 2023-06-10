package dinamic.dinamicprogram.wordPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    @Test
    void wordPattern() {

        String pattern = "abba";
        String pattern1 = "aaa";
        String pattern2 = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String s = "dog cat cat dog";
        String s1 = "dog cat cat fish";
        String s2 = "dog cat cat dog";
        String s3 = "dog dog dog dog";
        String s4 = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";

        WordPattern wordPattern = new WordPattern();
        boolean b = wordPattern.wordPattern(pattern, s);
        boolean b1 = wordPattern.wordPattern(pattern, s1);
        boolean b2 = wordPattern.wordPattern(pattern1, s2);
        boolean b3 = wordPattern.wordPattern(pattern, s3);
        boolean b4 = wordPattern.wordPattern(pattern2, s4);

        assertAll(
                () -> assertTrue(b),
                () -> assertFalse(b1),
                () -> assertFalse(b2),
                () -> assertFalse(b3),
                () -> assertTrue(b4)



        );

    }
}