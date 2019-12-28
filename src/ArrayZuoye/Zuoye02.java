package ArrayZuoye;

import java.util.Scanner;

public class Zuoye02 {

	public static void main(String[] args) {

		// 5.2 自定义数组并输出极值及和
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入数组长度：");
		int len = scan.nextInt(); // 定义数组长度变量
		int[] a = new int[len]; // 新建数组，数组长度通过某种途径获取
		int sum = 0;
		for (int i = 0; i < len;) {
			System.out.print("请输入第" + (i + 1) + "个元素：");
			a[i] = (int) scan.nextInt();
			sum = sum + a[i];
			// 数组中排序
			for (int j = 0; j < i; ++j) {
				if (a[i] < a[j]) {
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
			++i;
		}
		System.out.print("数组元素为：");
		for (int i1 = 0; i1 < a.length; ++i1) {
			System.out.print(a[i1] + "，");
		}
		System.out.println();
		System.out.println("最大值：" + a[len - 1] + "；最小值：" + a[0]);
		System.out.println("数组元素和为：" + sum);
		scan.close();
	}
}
