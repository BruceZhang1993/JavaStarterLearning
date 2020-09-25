package io.github.brucezhang1993.lesson7;

import java.util.ArrayList;
import java.util.List;

public class QuestionThree {
    private static List<Integer> indexesOf(String needle, String targetString) {
        String haystack = targetString;
        int idx = haystack.indexOf(needle);
        int baseIdx = 0;
        List<Integer> indexes = new ArrayList<>();
        while (idx != -1) {
            indexes.add(baseIdx + idx);
            haystack = haystack.substring(idx + needle.length());
            baseIdx += idx + needle.length();
            idx = haystack.indexOf(needle);
        }
        return indexes;
    }

    public static void main(String[] args) {
        List<Integer> indexes = indexesOf("bc", "abcd23abcd34bcd");
        System.out.println(indexes);
    }
}
