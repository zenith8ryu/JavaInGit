package roundOfBanker;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainPrg implements Cloneable {
	public static void main(String[] args) {
		BigDecimal d = new BigDecimal(100000); // ���
//		BigDecimal r = new BigDecimal(0.001875 * 3); // ��Ϣд��1����˵��ʧ�棩
		BigDecimal r = BigDecimal.valueOf(0.001875 * 3); // ��Ϣд��2
		BigDecimal i = d.multiply(r).setScale(2, RoundingMode.HALF_EVEN); // ʹ�����м��㷨
//		BigDecimal i = d.multiply(r).setScale(2, BigDecimal.ROUND_UP);

		System.out.println("����Ϣ�ǣ�" + i);
	}

}
