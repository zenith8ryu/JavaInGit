package polymorPrct01;

public class MainPrg {
	public static void main(String[] args) {
		// ���常������
		Wine[] wines = new Wine[2];
		// ������������
		JNC jnc = new JNC();
		JGJ jgj = new JGJ();

		// ���������������
		wines[0] = jnc;
		wines[1] = jgj;

		for (int i = 0; i < 2; i++) {
			System.out.println(wines[i].toString() + "--" + wines[i].drink());
		}
		
		System.out.println("-------------------------------");

		// �̳�������
		Object o1 = new JNC();
		System.out.println(o1.toString());

		Object o2 = new JGJ();
		System.out.println(o2.toString());

		Object o3 = new Wine();
		System.out.println(o3.toString());
	}
}
