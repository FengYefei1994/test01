package ArrayZuoye;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 5.21	����һ��4��4�еĶ�ά���飬����Ӽ�������ֵ��Ȼ�󽫵�1�к͵�4�е����ݽ��н�����
 * ����2�к͵�3�е����ݽ��н���
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
		// ��������齻��ǰ
		for (int i = 0; i < 4; ++i) {
			System.out.println();
			for (int j = 0; j < 4; ++j) {
				System.out.print(a[i][j] + "\t");
			}
		}
		int[][] b = Arrays.copyOf(a, 4);
		System.out.println();

		// ���ʱ�жϣ���" \ "�Խ���������0
		// ��ʱ�����Ѿ�����������н�" \ "�Խ���ֵ��Ϊ0��ע��˵�
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

		// ���ʱ�жϣ���" / "�Խ���������0
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
