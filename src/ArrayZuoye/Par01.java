package ArrayZuoye;

import java.util.Arrays;
import java.util.Scanner;

public class Par01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numb1 = 0;
		double sum = 0f;
		double aver = 0.0;
		System.out.print("������ѧ��������");
		numb1 = input.nextInt();
		double[] score = new double[numb1];
		System.out.print("������ѧ���ɼ���");
		for (int i = 0; i < score.length; ++i) {
			score[i] = input.nextDouble();
			sum += score[i];
		}
		input.close();
		aver = sum / score.length;
		// System.out.println(numb1+"��ƽ���ɼ�Ϊ��"+aver);

		// �жϳɼ��Ƿ���Ҫ����
		if (aver < 60) {
			sum = 0.0;
			for (int i = 0; i < score.length; ++i) {
				score[i] = Math.sqrt(score[i]) * 10;
				sum += score[i];
			}
			aver = sum / score.length;
			System.out.println("�����" + numb1 + "��ƽ���ɼ�Ϊ��" + aver);
			Arrays.sort(score);
			System.out.println("�������߳ɼ�Ϊ��" + score[score.length - 1]);
		}

		// ÿ5��һ�����
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
