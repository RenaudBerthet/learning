package be.rbe.learning.tdd.testdoubles.stubs;

import java.sql.SQLException;

public class ConnectionTimedOutStudentDAOStub implements StudentDAO {

    @Override
    public String create(String anme, String className) throws SQLException {
        throw new SQLException("Db Connection timed out");
    }
}
