package dinamic.dinamicprogram.removeAnagrams;

import java.util.ArrayList;
import java.util.List;

public class RemoveAnagrams {

    public static void main(String[] args) {
        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};

        RemoveAnagrams removeAnagrams = new RemoveAnagrams();
        System.out.println(removeAnagrams.removeAnagrams(words));

    }


    public List<String> removeAnagrams(String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        if (words.length == 1) return list;
        int l = 0;
        int r = 1;

        while (r != words.length) {
            if (!check(list.get(list.size() - 1), words[r])) {
                list.add(words[r]);
            }
            l = list.size() - 1;
            r++;
        }
        return list;
    }

    public boolean check(String x, String y) {

        if (x.length() != y.length()) return false;
        int[] z = new int[26];
        for (int i = 0; i < x.length(); i++) {
            z[x.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < x.length(); i++) {
            z[y.charAt(i) - 'a'] -= 1;
            if (z[y.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}