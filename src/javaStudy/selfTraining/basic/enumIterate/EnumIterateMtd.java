package enumIterate;

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

public class EnumIterateMtd {
    public static void main(String[] args) {
        for (Spiciness sp : Spiciness.values()) {
            System.out.println("静态方法获取" + sp);
        }

        Class clazz = Spiciness.class;
        for (Object obj : clazz.getEnumConstants()) {
            System.out.println("反射获取" + obj);
        }
    }
}


