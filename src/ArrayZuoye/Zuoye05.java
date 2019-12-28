package ArrayZuoye;

import java.util.Arrays;

//import java.util.Arrays;

public class Zuoye05 {

	public static void main(String[] args) {
		// 5.1将不为0的值存入一个新的数组
		int[] a = { 1, 0, 0, 6, 0, 6, 5, 4, 7, 0, 5 };
		/*
		 * Arrays.sort(a); System.out.println(Arrays.toString(a));
		 * System.out.println(Arrays.binarySearch(a, 1));
		 */

		// 每有新元素，更新数组
		// 效率低
		int[] b = new int[0];
		for (int i = 0; i < a.length; ++i) {
			if (a[i] != 0) {
				b = Arrays.copyOf(b, b.length + 1); // 每次复制更新数组效率低，内存替换浪费
				b[b.length - 1] = a[i];
				System.out.print(b[b.length - 1] + "，");
			}
		}

		// 根据长度，再判断0，赋值
		/*
		 * int len=0; for(int c:a) { if(c!=0) { ++len; } } int[] b=new int[len]; int
		 * j=0; for(int i=0;i<a.length;++i) { if(a[i]!=0) { b[j]=a[i];
		 * System.out.print(b[j]+"，"); ++j; //新数组元素下标，同为新数组有效元素个数 } }
		 */

		// copyOf使用，不考虑输出数组元素顺序的话
		/*
		 * Arrays.sort(a); int len=0; for(int c:a) { if(c==0) { ++len; } } int[]
		 * b=Arrays.copyOfRange(a, len, a.length);
		 * System.out.println(Arrays.toString(b));
		 */
	}
}
