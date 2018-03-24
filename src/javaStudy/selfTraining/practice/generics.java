package javaStudy.selfTraining.practice;

public class generics {
    public static void main(String[] args) {
//        ObjectPoint int_p = new ObjectPoint();
//        int_p.setX(new Integer(100));
//        Integer int_x = (Integer) int_p.getX();
//        System.out.println(int_x);

//        ObjectPoint flt_p = new ObjectPoint();
//        flt_p.setX(new Float(2.12f));
//        Float flt_x = (Float) flt_p.getX();
//        System.out.println(flt_x);

        // Force cast cause runtime exception
//        ObjectPoint str_p = new ObjectPoint();
//        str_p.setX(new Float(2.12f));
//        String str_x = (String) str_p.getX();
//        System.out.println(str_x);

        //----------------------------------------------------//
        Point<Integer> a = new Point<Integer>();
        a.setX(new Integer(100));
        System.out.println(a.getX());

        Point<Float> b = new Point<Float>();
        b.setX(new Float(100.01f));
        System.out.println(b.getX());
    }
}

class ObjectPoint {
    private Object x;
    private Object y;

    public void setX(Object x) {
        this.x = x;
    }

    public void setY(Object y) {
        this.y = y;
    }

    public Object getX() {
        return this.x;
    }

    public Object getY() {
        return this.y;
    }
}

class Point<T> {
    private T x;
    private T y;

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }
}
