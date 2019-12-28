package ArrayZuoye;

import java.util.Arrays;

/*5.19	随机数创建一个长度为6的int型数组，要求取值为1-30
 * 要求数组中各个元素值各不相同
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

		// 打印数组方式1
		System.out.print("随机数组：");
		for (int b : a) {
			System.out.print(b + "；");
		}

		System.out.println();

		// 打印数组方式2
		System.out.print(Arrays.toString(a)); // 把数组转换为一个字符串进行打印
	}
}
