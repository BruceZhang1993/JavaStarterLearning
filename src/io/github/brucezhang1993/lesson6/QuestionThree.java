package io.github.brucezhang1993.lesson6;

import java.util.HashSet;
import java.util.Objects;

class Lesson {
    int id;
    String title;

    public Lesson(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lesson)) return false;
        Lesson lesson = (Lesson) o;
        return id == lesson.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("Lesson(id=%d,title=%s)", this.id, this.title);
    }
}

public class QuestionThree {
    public static void main(String[] args) {
        HashSet<Lesson> lessons = new HashSet<>();
        lessons.add(new Lesson(1, "Object"));
        lessons.add(new Lesson(2, "String"));
        lessons.add(new Lesson(3, "Exception"));
        lessons.add(new Lesson(2, "WillNotAdd"));
        lessons.add(new Lesson(1, "WillNotDuplicate"));
        System.out.println(lessons);
    }
}
