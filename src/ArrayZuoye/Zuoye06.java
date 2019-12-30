package ArrayZuoye;

import java.util.Arrays;

public class Zuoye06 {

	public static void main(String[] args) {
		/*
		 * 5、6 数组a：{1，7，9，11，13，15} 数组b：{2，4，6，8，10} 两个数组合并为数组c，按升序排列
		 */

		/*
		 * 注意拷贝数组的用法 copy数组时空白区域以数据类型的空值填充 eg：19 行c[]={1，7，9，11，13，15，0，0，0，0，0};
		 */
		int[] a = { 1, 7, 9, 11, 13, 15 };
		int[] b = { 2, 4, 6, 8, 10 };
		int[] c = Arrays.copyOf(a, a.length + b.length);
		for (int i = 0; i < b.length; ++i) {
			c[a.length + i] = b[i];
		}
		Arrays.sort(c);
		/*
		 * for(int m:c) { System.out.print(m+"，"); }
		 */
		System.out.print("数组：" + Arrays.toString(c));
	}
}
