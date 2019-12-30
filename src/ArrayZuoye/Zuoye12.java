package ArrayZuoye;

import java.util.Scanner;

//5.12	从键盘接受10个整数保存在数组中，将10个数中最大的数与第一个元素交换，最小的数与最后一个元素交换，其余元素位置不变，输出交换前后数组元素的值

public class Zuoye12 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入数组元素：");
		int max = 0;
		int max1 = 0;
		int min = 10000;
		int min1 = 0;
		int i = 0;
		for (; i < arr.length; ++i) {
			arr[i] = scan.nextInt();
			if (arr[i] > max) {
				max = arr[i];
				max1 = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				min1 = i;
			}
		}
		scan.close();
		System.out.print("修改前数组：");
		for (int a : arr) {
			System.out.print(a + "；");
		}
		System.out.println();

		// 交换最大值、最小值
		int tmp = arr[0];
		arr[0] = arr[max1];
		arr[max1] = tmp;

		tmp = arr[9];
		arr[9] = arr[min1];
		arr[min1] = tmp;

		// 输出交换后数组
		System.out.print("修改后数组：");
		for (int a : arr) {
			System.out.print(a + "；");
		}
	}
}
