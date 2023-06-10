package dinamic.dinamicprogram.iisAnagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IisAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        String s1 = "rat";
        String t1 = "car";

        String s2 = "a";
        String t2 = "b";

        IisAnagram iisAnagram = new IisAnagram();
        System.out.println(iisAnagram.isAnagram(s2, t2));
        System.out.println(iisAnagram.isAnagram(s1, t1));

    }

    public boolean isAnagram(String s, String t) {


        if (s.length() != t.length()) return false;

        int[] x = new int[26];

        for (int i = 0; i < s.length(); i++) {
            x[(int) s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < s.length(); i++) {
            x[(int) t.charAt(i) - 'a'] -= 1;
            if (x[(int) t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        String[] lol = new String[22];
        int eee = lol.length;
        List<String> list = new ArrayList<>();
        list.size();
//        list.get()

//        List<String> list = new ArrayList<>();
//        list.add()

        return true;
    }
}



