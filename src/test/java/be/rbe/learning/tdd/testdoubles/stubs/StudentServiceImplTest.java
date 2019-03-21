package be.rbe.learning.tdd.testdoubles.stubs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class StudentServiceImplTest {

    private StudentService studentService;

    @Test
    void when_connection_times_out_then_the_client_is_not_saved() {

        studentService = new StudentServiceImpl(new ConnectionTimedOutStudentDAOStub());
        String classname = "IX";
        String johnSmith = "John Smith";
        CreateStudentResponse response = studentService.create(johnSmith, classname);
        assertFalse(response.isSuccess());
    }


}