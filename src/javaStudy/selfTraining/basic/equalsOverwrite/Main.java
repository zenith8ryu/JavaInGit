package equalsOverwrite;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("chenssy", 23);
		Employee e2 = new Employee("chenssy", 24);
		Person p1 = new Person("chenssy");

		System.out.println(p1.equals(e1));
		System.out.println(p1.equals(e2));
		System.out.println(e1.equals(e2));
	}

}

class Person {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		this.name = name;
//		System.out.println(name);
	}

	public boolean equals(Object object) {
//		if (object instanceof Person) {
		if (object.getClass() == this.getClass()) {
			Person p = (Person) object;
			if (p.getName() == null || name == null) {
				return false;
			} else {
				return name.equalsIgnoreCase(p.getName());
			}
		}
		return false;
	}
}

class Employee extends Person {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(String name, int id) {
		super(name);
		this.id = id;
	}

	/**
	 * Overwrite equals()
	 */
	public boolean equals(Object object) {
		if (object instanceof Employee) {
			Employee e = (Employee) object;
			return super.equals(object) && e.getId() == id;
		}
		return false;
	}
}
