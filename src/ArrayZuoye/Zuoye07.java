package ArrayZuoye;

import java.util.Arrays;
import java.util.Scanner;

public class Zuoye07 {

	public static void main(String[] args) {
		int[] a = new int[0];
		Scanner input = new Scanner(System.in);

		int[] b = Arrays.copyOf(a, 10);
		System.out.print("请输入10个成绩：");
		for (int i = 0; i < 10; ++i) {
			b[i] = input.nextInt();
		}
		Arrays.sort(b);
		int i = 1;
		int sum = 0;
		for (; i < b.length - 1; ++i) {
			sum = sum + b[i];
		}
		System.out.println("该选手最后得分：" + ((float) sum / i));
	}
}
