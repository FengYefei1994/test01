package ArrayZuoye;

import java.util.Scanner;

//5.12	�Ӽ��̽���10�����������������У���10���������������һ��Ԫ�ؽ�������С���������һ��Ԫ�ؽ���������Ԫ��λ�ò��䣬�������ǰ������Ԫ�ص�ֵ

public class Zuoye12 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.print("����������Ԫ�أ�");
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
		System.out.print("�޸�ǰ���飺");
		for (int a : arr) {
			System.out.print(a + "��");
		}
		System.out.println();

		// �������ֵ����Сֵ
		int tmp = arr[0];
		arr[0] = arr[max1];
		arr[max1] = tmp;

		tmp = arr[9];
		arr[9] = arr[min1];
		arr[min1] = tmp;

		// �������������
		System.out.print("�޸ĺ����飺");
		for (int a : arr) {
			System.out.print(a + "��");
		}
	}
}
