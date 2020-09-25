package io.github.brucezhang1993.lesson6;

class Programmer {
    String name;
    int age;
    String language;

    public Programmer(String name, int age, String language) {
        this.name = name;
        this.age = age;
        this.language = language;
    }

    @Override
    public String toString() {
        return String.format("{\"name\":\"%s\",\"age\":%d,\"language\":\"%s\"}", this.name, this.age, this.language);
    }
}

public class QuestionTwo {
    public static void main(String[] args) {
        System.out.println(new Programmer("Bruce", 26, "Java"));
    }
}
