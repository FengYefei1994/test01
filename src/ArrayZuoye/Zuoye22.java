package ArrayZuoye;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5.21	定义一个4行4列的二维数组，逐个从键盘输入值，然后将第1行和第4行的数据进行交换，
 * 将第2行和第3行的数据进行交换
 */
public class Zuoye22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] a = new int[4][4];

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 4; ++j) {
				a[i][j] = (int) (Math.random() * 30);
				// a[i][j]=scan.nextInt();
			}
		}
		scan.close();
		// 输入的数组交换前
		for (int i = 0; i < 4; ++i) {
			System.out.println();
			for (int j = 0; j < 4; ++j) {
				System.out.print(a[i][j] + "\t");
			}
		}
		int[][] b = Arrays.copyOf(a, 4);
		System.out.println();

		// 输出时判断，将" \ "对角线数据置0
		// 此时数组已经在上面程序中将" \ "对角线值变为0，注意此点
		for (int i = 0; i < 4; ++i) {
			System.out.println();
			for (int j = 0; j < 4; ++j) {
				if (i == j) {
					a[i][j] = 0;
				}
				System.out.print(a[i][j] + "\t");
			}
		}

		System.out.println();

		// 输出时判断，将" / "对角线数据置0
		for (int i = 0; i < 4; ++i) {
			System.out.println();
			for (int j = 0; j < 4; ++j) {
				if (3 == (j + i)) {
					a[i][j] = 0;
				}
				System.out.print(a[i][j] + "\t");
			}
		}

	}
}
