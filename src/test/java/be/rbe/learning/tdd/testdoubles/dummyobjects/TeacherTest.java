package be.rbe.learning.tdd.testdoubles.dummyobjects;

import be.rbe.learning.tdd.testdoubles.dummyobjects.DummyStudent;
import be.rbe.learning.tdd.testdoubles.dummyobjects.Grades;
import be.rbe.learning.tdd.testdoubles.dummyobjects.Marks;
import be.rbe.learning.tdd.testdoubles.dummyobjects.Teacher;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class TeacherTest {

    @Test
    void when_a_stuudent_gets_more_than_75_percent_but_less_than_90_as_verygood(){

        DummyStudent dummyStudent = new DummyStudent();
        Marks inEnglish = new Marks(dummyStudent, "CS101", new BigDecimal("81.00"));
        Marks inMath = new Marks(dummyStudent, "Math101", new BigDecimal("81.00"));
        Marks inArt = new Marks(dummyStudent, "Art101", new BigDecimal("81.00"));

        List<Marks> marks = asList(inEnglish, inMath, inArt);

        Grades grades = new Teacher().generateGrade(marks);
        assertEquals(Grades.VeryGood, grades);

    }



}