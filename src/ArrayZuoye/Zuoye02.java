package ArrayZuoye;

import java.util.Scanner;

public class Zuoye02 {

	public static void main(String[] args) {

		// 5.2 �Զ������鲢�����ֵ����
		Scanner scan = new Scanner(System.in);
		System.out.println("���������鳤�ȣ�");
		int len = scan.nextInt(); // �������鳤�ȱ���
		int[] a = new int[len]; // �½����飬���鳤��ͨ��ĳ��;����ȡ
		int sum = 0;
		for (int i = 0; i < len;) {
			System.out.print("�������" + (i + 1) + "��Ԫ�أ�");
			a[i] = (int) scan.nextInt();
			sum = sum + a[i];
			// ����������
			for (int j = 0; j < i; ++j) {
				if (a[i] < a[j]) {
					int tmp = a[j];
					a[j] = a[i];
					a[i] = tmp;
				}
			}
			++i;
		}
		System.out.print("����Ԫ��Ϊ��");
		for (int i1 = 0; i1 < a.length; ++i1) {
			System.out.print(a[i1] + "��");
		}
		System.out.println();
		System.out.println("���ֵ��" + a[len - 1] + "����Сֵ��" + a[0]);
		System.out.println("����Ԫ�غ�Ϊ��" + sum);
		scan.close();
	}
}
