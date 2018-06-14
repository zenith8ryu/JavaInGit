package challenge_liu_v2;

public class TestLauncher {
    public static void main(String[] args) {
        Tester test = new Tester();
        test.exec();


        Thread td = new Thread();
        try {
            td.sleep(5000 * 3600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
