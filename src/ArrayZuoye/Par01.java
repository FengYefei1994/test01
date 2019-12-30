package ArrayZuoye;

import java.util.Arrays;
import java.util.Scanner;

public class Par01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numb1 = 0;
		double sum = 0f;
		double aver = 0.0;
		System.out.print("请输入学生人数：");
		numb1 = input.nextInt();
		double[] score = new double[numb1];
		System.out.print("请输入学生成绩：");
		for (int i = 0; i < score.length; ++i) {
			score[i] = input.nextDouble();
			sum += score[i];
		}
		input.close();
		aver = sum / score.length;
		// System.out.println(numb1+"人平均成绩为："+aver);

		// 判断成绩是否需要处理
		if (aver < 60) {
			sum = 0.0;
			for (int i = 0; i < score.length; ++i) {
				score[i] = Math.sqrt(score[i]) * 10;
				sum += score[i];
			}
			aver = sum / score.length;
			System.out.println("处理后" + numb1 + "人平均成绩为：" + aver);
			Arrays.sort(score);
			System.out.println("处理后最高成绩为：" + score[score.length - 1]);
		}

		// 每5个一行输出
		int i = 0;
		for (double a : score) {
			System.out.print(a + "\t");
			++i;
			if (i % 5 == 0) {
				System.out.println();
			}
		}
	}
}
