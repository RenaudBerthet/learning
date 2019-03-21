package be.rbe.learning.tdd.testdoubles.spy;

import be.rbe.learning.tdd.testdoubles.dummyobjects.Student;

import java.util.*;

public class StudentService {

    private Map<String, List<Student>> studentCourseMap = new HashMap<>();

    public void enrollToCourse(String courseName, Student student) {
        List<Student> students = studentCourseMap.get(courseName);

        if (students == null) {
            students = new ArrayList<>();
        }
        if (!students.contains(student)) {
            students.add(student);
        }
        studentCourseMap.put(courseName, students);
    }
}
