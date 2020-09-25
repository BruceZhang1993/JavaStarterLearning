package io.github.brucezhang1993.lesson7;

public class QuestionOne {
    private static int countInString(String needle, String targetString) {
        String haystack = targetString;
        int counter = 0;
        int idx = haystack.indexOf(needle);
        while (idx != -1) {
            counter++;
            haystack = haystack.substring(idx + needle.length());
            idx = haystack.indexOf(needle);
        }
        return counter;
    }

    public static void main(String[] args) {
        String targetString = "I am monkey1024.monkey like banana.little monkey is smart.";
        String needle = "monkey";
        int counter = countInString(needle, targetString);
        System.out.printf("%s 在 %s 中出现了 %d 次\n", needle, targetString, counter);
    }
}
