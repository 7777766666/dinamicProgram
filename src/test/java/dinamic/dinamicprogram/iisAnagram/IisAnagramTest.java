package dinamic.dinamicprogram.iisAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IisAnagramTest {

    @Test
    void isAnagram() {

        String s = "anagram";
        String t = "nagaram";

        String s1 = "rat";
        String t1 = "car";

        String s2 = "a";
        String t2 = "b";

        IisAnagram iisAnagram = new IisAnagram();
        boolean actual = iisAnagram.isAnagram(s, t);
        boolean actual1 = iisAnagram.isAnagram(s1, t1);
        boolean actual2 = iisAnagram.isAnagram(s2, t2);

        assertAll(
                () -> assertTrue( actual),
                () -> assertFalse(actual1),
                () -> assertFalse(actual2)



        );
    }
}