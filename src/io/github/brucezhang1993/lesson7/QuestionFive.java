package io.github.brucezhang1993.lesson7;

public class QuestionFive {
    public static void main(String[] args) {
        String str = "hello" + "world";
        // 实例化一个字符串常量 "helloworld"

        String str1 = "hello"; String str2 = str1 + "world";
        // 实例化三个字符串常量 "hello" "world" "helloworld"

        String str11 = new String("hello"); String str22 = str11 + "world";
        // 堆实例化两个字符串对象值为 "hello" "helloworld" 实例化三个字符串常量 "hello" "world" "helloworld"
    }
}
