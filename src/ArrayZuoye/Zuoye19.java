package ArrayZuoye;

import java.util.Arrays;

/*5.19	���������һ������Ϊ6��int�����飬Ҫ��ȡֵΪ1-30
 * Ҫ�������и���Ԫ��ֵ������ͬ
*/
public class Zuoye19 {

	public static void main(String[] args) {
		int[] a = new int[6];
		int tmp = 0;
		a[0] = (int) (Math.random() * 30);

		for1: for (int i = 1; i < a.length; ++i) {
			tmp = (int) (Math.random() * 30 + 1);
			a[i] = tmp;
			for (int j = 0; j < i; ++j) {
				if (a[i] == a[j]) {
					--i;
					continue for1;
				}
			}
		}

		// ��ӡ���鷽ʽ1
		System.out.print("������飺");
		for (int b : a) {
			System.out.print(b + "��");
		}

		System.out.println();

		// ��ӡ���鷽ʽ2
		System.out.print(Arrays.toString(a)); // ������ת��Ϊһ���ַ������д�ӡ
	}
}
