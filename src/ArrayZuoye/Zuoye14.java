package ArrayZuoye;

import java.util.Arrays;

/*5.14 ֱ�ӳ�ʼ�������ַ������飬�����ж����������������Ԫ���Ƿ���ȫ��ͬ
 * ��Ҫ���������������Ԫ�ش�С��˳����ȫһ�£���
*/
public class Zuoye14 {

	public static void main(String[] args) {
		String[] a = new String[] { "����", "������", "���", "����", "��ӥ", "������", "���", "����", "��ӥ" };
		String[] b = Arrays.copyOf(a, 9);
		b[5] = "������";

		for (int i = 0; i < b.length; ++i) {
			if (!a[i].equals(b[i])) {
				System.out.print("�ַ�������");
				break;
			} else {
				if (i == (a.length - 1)) {
					System.out.print("�ַ������");
				}
			}
		}

	}
}
