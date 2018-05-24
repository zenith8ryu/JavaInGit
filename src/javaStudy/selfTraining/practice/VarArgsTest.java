package javaStudy.selfTraining.practice;

public class VarArgsTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // up-cast
        Base base = new Sub();
        base.print("hello");

        // no cast
        String[] t = {"a", "b"};

        Sub sub = new Sub();
        sub.print(t);
//        sub.print("hello");
    }

}

// super class
class Base {
    void print(String... args) {
        System.out.println("Base......test");
    }
}

// subclass, override
class Sub extends Base {
    @Override
    void print(String[] args) {
        System.out.println("Sub......test");
    }
}
