package dinamic.dinamicprogram.wordPattern;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog cat cat dog";
        String s2 = "dog cat cat fish";
        String s3 = "dog dog dog dog";
        String pattern2 = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String s4 = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";

        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern(pattern2, s4));


        System.out.println(wordPattern.wordPattern(pattern, s3));
        System.out.println(wordPattern.wordPattern(pattern, s2));
    }

    public boolean wordPattern(String pattern, String s) {

        int l1 = pattern.length();
        String[] split = s.split(" ");
        if (l1 != split.length) return false;
        String[] x = new String[26];
        int[] y = new int[26];

        for (int i = 0; i < l1; i++) {
            if (x[pattern.charAt(i) - 'a'] == null) {
                if (y[pattern.charAt(i) - 'a'] == 1) {
                    return false;
                }
                for (int j = 0; j < pattern.charAt(i) - 'a'; j++) {
                    if (split[i].equals(x[j])) {
                        return false;
                    }
                }
                x[pattern.charAt(i) - 'a'] = split[i];
                y[pattern.charAt(i) - 'a'] = 1;

            } else {
                if (!x[pattern.charAt(i) - 'a'].equals(split[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
