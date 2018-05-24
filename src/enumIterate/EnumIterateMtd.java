package enumIterate;

enum Spiciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

public class EnumIterateMtd {
    public static void main(String[] args) {
        for (Spiciness sp : Spiciness.values()) {
            System.out.println("get by static method" + sp);
        }

        Class clazz = Spiciness.class;
        for (Object obj : clazz.getEnumConstants()) {
            System.out.println("get by reflection" + obj);
        }
    }
}


