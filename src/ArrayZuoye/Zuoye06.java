package ArrayZuoye;

import java.util.Arrays;

public class Zuoye06 {

	public static void main(String[] args) {
		/*
		 * 5��6 ����a��{1��7��9��11��13��15} ����b��{2��4��6��8��10} ��������ϲ�Ϊ����c������������
		 */

		/*
		 * ע�⿽��������÷� copy����ʱ�հ��������������͵Ŀ�ֵ��� eg��19 ��c[]={1��7��9��11��13��15��0��0��0��0��0};
		 */
		int[] a = { 1, 7, 9, 11, 13, 15 };
		int[] b = { 2, 4, 6, 8, 10 };
		int[] c = Arrays.copyOf(a, a.length + b.length);
		for (int i = 0; i < b.length; ++i) {
			c[a.length + i] = b[i];
		}
		Arrays.sort(c);
		/*
		 * for(int m:c) { System.out.print(m+"��"); }
		 */
		System.out.print("���飺" + Arrays.toString(c));
	}
}
