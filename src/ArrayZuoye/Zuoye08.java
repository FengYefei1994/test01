package ArrayZuoye;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//5.8 һ������Ϊ5�����飬��������Ԫ�أ��ж�����������Ƿ������ͬ��Ԫ�أ�
//���������ͬ��Ԫ������������ظ�Ԫ�ء������������û���ظ�Ԫ�ء���

public class Zuoye08 {

	public static void main(String[] args) throws IOException {

		/*
		 * FileReader reader=new FileReader("src/ArrayZuoye/Zuoye08Secret.txt");
		 * //��ȡ�ļ������������ļ�·������"/"���� char[] arr=new char[6]; //����һ����������� reader.read(arr);
		 * //��ȡ�ļ������� String pwd=new String(); reader.close(); //�ر��ļ�
		 */

		// ʵ��һ��������Ԫ���ظ�����ж�
		// ��ʵ���ж��Ƿ�����ͬԪ��
		// δʵ�������ͬԪ��
		int[] a = new int[0];
		Scanner input = new Scanner(System.in);

		int[] b = Arrays.copyOf(a, 5);
		System.out.print("������5��������");
		for (int i = 0; i < 5; ++i) {
			b[i] = input.nextInt();
		}
		int k = 0;
		for1: for (int i = 0; i < b.length - 1; ++i) {
			for (int j = i + 1; j < b.length; ++j) {
				if ((b[i] == b[j])) {
					++k;
					System.out.println("������ͬԪ�أ�" + b[i]);
					continue for1; // ����ǩ��break��continue�÷�
				}
			}
		}
		if (k == 0) {
			System.out.println("��������ͬԪ��");
		}
	}
}
