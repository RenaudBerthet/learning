package be.rbe.learning.tdd.testdoubles.stubs;

import be.rbe.learning.tdd.testdoubles.dummyobjects.Student;

public class CreateStudentResponse {
    private final String errorMessage;
    private final Student student;

    public CreateStudentResponse(String errorMessage, Student student) {
        this.errorMessage = errorMessage;
        this.student = student;
    }

    boolean isSuccess() {
        return null == errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Student getStudent() {
        return student;
    }
}
