package cloneOfObj;

public class Client {
	public static void main(String[] args) {
		// д���ʼ�
		Email email = new Email("��μӻ���", "�������12:30���������Ҳμӻ���...");

		Person person1 = new Person("����", email);

		Person person2 = person1.clone();
		person2.setName("����");
		Person person3 = person1.clone();
		person3.setName("����");

		System.out.println(person1.getName() + "���ʼ������ǣ�" + person1.getEmail().getContent());
		System.out.println(person2.getName() + "���ʼ������ǣ�" + person2.getEmail().getContent());
		System.out.println(person3.getName() + "���ʼ������ǣ�" + person3.getEmail().getContent());
	}
}
