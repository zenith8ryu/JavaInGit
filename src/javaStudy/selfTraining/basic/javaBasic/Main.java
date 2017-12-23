package javaBasic;

public class Main {
	public static void main(String[] args) {
        ThreadTestThread tt = new ThreadTestThread();
        tt.start();
        for (int i = 0; i < 100; i++) {
            System.out.print('.');
        }
	}

	static class ThreadTestThread extends Thread {
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.print('o');
			}
		}
	}
}
