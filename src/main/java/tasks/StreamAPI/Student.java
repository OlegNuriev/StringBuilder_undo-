package tasks.StreamAPI;

import java.util.Map;

class Student {
    private final Map<String, Integer> grades;

    public Student(String name, Map<String, Integer> grades) {
        this.grades = grades;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}
