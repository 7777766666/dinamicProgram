package dinamic.dinamicprogram.removeAnagrams;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAnagramsTest {

    @Test
    void removeAnagrams() {

        String[] words = {"abba","baba","bbaa","cd","cd"};
        List<String> expected = new ArrayList<>(List.of("abba","cd"));

        String[] words1 = {"a","b","c","d","e"};
        List<String> expected1 = new ArrayList<>(List.of("a","b","c","d","e"));

        RemoveAnagrams removeAnagrams = new RemoveAnagrams();
        List<String> actual = removeAnagrams.removeAnagrams(words);
        List<String> actual1 = removeAnagrams.removeAnagrams(words1);



        assertAll(
                () -> assertEquals(expected, actual),
                () -> assertEquals(expected1, actual1)


        );
    }

    @Test
    void check() {

        String x = "abba";
        String y = "baba";
        String z = "cd";

        RemoveAnagrams removeAnagrams = new RemoveAnagrams();
        boolean actual = removeAnagrams.check(x, y);

        boolean actual1 = removeAnagrams.check(y, z);

        assertAll(
                () -> assertTrue(actual),
                () -> assertFalse(actual1)

        );
    }
}