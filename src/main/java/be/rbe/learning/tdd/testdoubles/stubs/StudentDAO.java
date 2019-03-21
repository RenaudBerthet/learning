package be.rbe.learning.tdd.testdoubles.stubs;

import java.sql.SQLException;

public interface StudentDAO {
    public String create(String anme, String className) throws SQLException;

}
