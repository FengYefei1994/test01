package ArrayZuoye;

import java.util.Arrays;

//import java.util.Arrays;

public class Zuoye05 {

	public static void main(String[] args) {
		// 5.1����Ϊ0��ֵ����һ���µ�����
		int[] a = { 1, 0, 0, 6, 0, 6, 5, 4, 7, 0, 5 };
		/*
		 * Arrays.sort(a); System.out.println(Arrays.toString(a));
		 * System.out.println(Arrays.binarySearch(a, 1));
		 */

		// ÿ����Ԫ�أ���������
		// Ч�ʵ�
		int[] b = new int[0];
		for (int i = 0; i < a.length; ++i) {
			if (a[i] != 0) {
				b = Arrays.copyOf(b, b.length + 1); // ÿ�θ��Ƹ�������Ч�ʵͣ��ڴ��滻�˷�
				b[b.length - 1] = a[i];
				System.out.print(b[b.length - 1] + "��");
			}
		}

		// ���ݳ��ȣ����ж�0����ֵ
		/*
		 * int len=0; for(int c:a) { if(c!=0) { ++len; } } int[] b=new int[len]; int
		 * j=0; for(int i=0;i<a.length;++i) { if(a[i]!=0) { b[j]=a[i];
		 * System.out.print(b[j]+"��"); ++j; //������Ԫ���±꣬ͬΪ��������ЧԪ�ظ��� } }
		 */

		// copyOfʹ�ã��������������Ԫ��˳��Ļ�
		/*
		 * Arrays.sort(a); int len=0; for(int c:a) { if(c==0) { ++len; } } int[]
		 * b=Arrays.copyOfRange(a, len, a.length);
		 * System.out.println(Arrays.toString(b));
		 */
	}
}
