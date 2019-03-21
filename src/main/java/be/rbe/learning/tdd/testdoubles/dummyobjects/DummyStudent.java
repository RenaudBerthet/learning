package be.rbe.learning.tdd.testdoubles.dummyobjects;

public class DummyStudent extends Student {

    public DummyStudent() {
        super(null, null);
    }

    @Override
    public String getRoleNumber() {
        throw new RuntimeException("Dummy Student");
    }

    @Override
    public String getName() {
        throw new RuntimeException("Dummy Student");
    }
}
