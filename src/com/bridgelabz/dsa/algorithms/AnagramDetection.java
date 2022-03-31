package com.bridgelabz.dsa.algorithms;

import java.util.HashMap;
import java.util.Set;

public class AnagramDetection {

    AnagramDetection(){}

    boolean isAnagram(String a, String b){

        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            }
            else {
                map.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i),
                        map.get(b.charAt(i)) - 1);
            }
        }

        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        AnagramDetection ad = new AnagramDetection();
        String a = "Amet".toLowerCase();
        String b = "Meta".toLowerCase();

        System.out.println(ad.isAnagram(a,b));
    }
}
