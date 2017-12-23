package extending;

import extending.ExtendsPractice.Husband;
import extending.ExtendsPractice.Person;

public class ExtendsPractice {
	public static void main(String[] args) {
		Husband husband = new Husband();
		
		husband.display();// ← 子类调用父类的方法
//		Person.display();// ← Person Class没有被实例化，无法调用其非静态方法
		Person.display(husband);// ← 向上转型

	}

	static class Person {
		protected String name;
		protected int age;
		protected String sex;

		Person(String name) {
			System.out.println("Person Constrctor-----" + name);
		}

		public void display() {
			System.out.println("Play Person...");
		}

		static void display(Person person) {
			person.display();
		}
	}

	static class Husband extends Person {
		// private Wife wife;

		Husband() {
			super("chenssy");
			System.out.println("Husband Constructor...");
		}
	}
}
