package be.rbe.learning.tdd.testdoubles.mock;

import be.rbe.learning.tdd.testdoubles.dummyobjects.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentService {
    private Map<String, List<Student>> studentCouseMap = new HashMap<>();

    public void enrollToCourse(String courseName, Student student) {
        List<Student> list = studentCouseMap.get(courseName);
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!list.contains(student)) {
            list.add(student);
        }
        studentCouseMap.put(courseName, list);
    }
}
