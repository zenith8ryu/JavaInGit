package useStatic;

public class Test {
	public static void main(String[] args) {
				
		User user1 = new User();
		User user2 = new User();

		System.out.println("user1 userNumber£º" + User.userNumber);
		System.out.println("user2 userNumber£º" + User.userNumber);
	}

	static class User {
		private static int userNumber = 0;

		public User() {
			userNumber++;
		}
	}
	
}
