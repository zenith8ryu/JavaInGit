package javaStudy.selfTraining.practice;

public class VarArgsTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 向上转型
        Base base = new Sub();
        base.print("hello");

        // 不转型
        String[] t = {"a", "b"};

        Sub sub = new Sub();
        sub.print(t);
//        sub.print("hello");
    }

}

// 基类
class Base {
    void print(String... args) {
        System.out.println("Base......test");
    }
}

// 子类，覆写父类方法
class Sub extends Base {
    @Override
    void print(String[] args) {
        System.out.println("Sub......test");
    }
}
