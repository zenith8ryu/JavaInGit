package challenge_liu_v2.test;

public class InheritTester {
    SuperClass sc = new SuperClass("s");
}

class SuperClass {
    private SuperClass() {
        System.out.println("a");
    }

    SuperClass(String str) {
        System.out.println(str);
    }
}

class SubClass {

}
