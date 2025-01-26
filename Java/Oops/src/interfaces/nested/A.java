package interfaces.nested;

public class A {
    // Nested Interfaces
    // Nested interface can be : public, private & protected
    // But outer interface must be : public or default
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}
class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}