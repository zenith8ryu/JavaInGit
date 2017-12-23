package roundOfBanker;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainPrg implements Cloneable {
	public static void main(String[] args) {
		BigDecimal d = new BigDecimal(100000); // 存款
//		BigDecimal r = new BigDecimal(0.001875 * 3); // 利息写法1（据说会失真）
		BigDecimal r = BigDecimal.valueOf(0.001875 * 3); // 利息写法2
		BigDecimal i = d.multiply(r).setScale(2, RoundingMode.HALF_EVEN); // 使用银行家算法
//		BigDecimal i = d.multiply(r).setScale(2, BigDecimal.ROUND_UP);

		System.out.println("季利息是：" + i);
	}

}
