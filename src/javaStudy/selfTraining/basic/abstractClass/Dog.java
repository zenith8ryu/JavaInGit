package abstractClass;

public class Dog extends Animal implements Fight {

    private void fuck() {
        System.out.println("Ouh Yeah~");
    }

    @Override
    public void cry() {
        System.out.println("Ouh!");
    }

    public void cry(String voice) {
        System.out.println("Gaou~" + voice + ".");
    }

    @Override
    public String craw() {
        return null;
    }

    @Override
    public String bite() {
        return null;
    }

    @Override
    public String collide() {
        return null;
    }

    ;

}
