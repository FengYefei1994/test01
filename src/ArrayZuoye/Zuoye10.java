package ArrayZuoye;

import java.util.Scanner;

/*一个按照由大到小排列的长度为6的数组（85,63,49,22,10），
它的最后一个元素没有赋值，现在要插入一个数值到该数组中，
仍保持数组中的数据按照由大到小排列。输出插入前后的数组元素
*/
public class Zuoye10 {

	public static void main(String[] args) {
		int[] arr = { 85, 63, 49, 22, 10, 0 };
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入要插入的元素：");
		int num = scan.nextInt();
		arr[5] = num;
		scan.close();
		for (int i = 5; i > 0; --i) {
			int tmp = 0;
			if (arr[i] > arr[i - 1]) {
				tmp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = tmp;
			}
		}
		for (int i = 0; i < arr.length; ++i) {
			if (num == arr[i]) {
				System.out.println("插入前一个元素是：" + arr[i - 1]);
				System.out.println("插入后一个元素是：" + arr[i + 1]);
			}
		}
	}
}
