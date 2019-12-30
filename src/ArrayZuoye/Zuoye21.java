package ArrayZuoye;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5.21	定义一个4行4列的二维数组，逐个从键盘输入值，然后将第1行和第4行的数据进行交换，
 * 将第2行和第3行的数据进行交换
 */
public class Zuoye21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[][] a = new int[4][4];

		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j < 4; ++j) {
				// a[i][j]=(int) (Math.random()*30);
				a[i][j] = scan.nextInt();
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

		// 取巧的方法——输出时反过来输出行
		for (int i = 3; i >= 0; --i) {
			System.out.println();
			for (int j = 0; j < 4; ++j) {
				System.out.print(a[i][j] + "\t");
			}
		}

		// 最直接的方法，对应行数值交换
		/*
		 * //进行1/4行，2/3行交换 int[] c=new int[4]; int[] d=Arrays.copyOf(c, 4); for(int
		 * i=0;i<4;++i) { c[i]=a[0][i]; a[0][i]=a[3][i]; a[3][i]=c[i];
		 * 
		 * d[i]=a[1][i]; a[1][i]=a[2][i]; a[2][i]=d[i]; }
		 * 
		 * //交换后数组输出 for(int i=0;i<4;++i) { System.out.println(); for(int j=0;j<4;++j) {
		 * System.out.print(a[i][j]+"\t"); } }
		 */
	}
}
