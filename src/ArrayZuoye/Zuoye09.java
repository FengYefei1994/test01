package ArrayZuoye;

import java.util.Arrays;

//5.9 输出斐波那契数列的前10个数

public class Zuoye09 {

	public static void main(String[] args) {
		int[] arr = new int[0];
		int[] a = Arrays.copyOf(arr, 10);

		a[0] = 1;
		a[1] = 1;
		for (int i = 0; i < 8; ++i) {
			a[i + 2] = a[i] + a[i + 1];
		}
		for (int b : a) {
			System.out.print(b + "；");
		}
	}
}
