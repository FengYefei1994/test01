package ArrayZuoye;

public class Zuoye16 {

	/*
	 * 5.16 将任意一个正整数转成二进制（提示：十进制转成二进制的方法是除2取余， 可以将余数放在一个32长的int数组中，倒序输出）
	 */
	public static void main(String[] args) {
		int a = (int) (Math.random() * 100);
		int[] b = new int[32];
		System.out.println(a);
		for (int i = 0; i < 32; ++i) {
			b[i] = a % 2;
			a = a / 2;
		}
		for (int i = 31; i > 0; --i) {
			if (b[i] == 1) {
				for (; i >= 0; --i) {
					System.out.print(b[i]);
				}
				break;
			}
		}
	}
}
