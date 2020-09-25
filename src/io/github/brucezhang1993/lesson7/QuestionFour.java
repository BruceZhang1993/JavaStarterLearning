package io.github.brucezhang1993.lesson7;

import java.util.Arrays;

public class QuestionFour {
    private static String[] cutString(String string) {
        return string.split("[ @]+");
    }

    public static void main(String[] args) {
        String s = "113@ ere qqq yyui";
        String[] o = cutString(s);
        System.out.println(Arrays.toString(o));
    }
}
