package ArrayZuoye;

import java.util.Arrays;

public class Zuoye03 {

	public static void main(String[] args) {
		// 5.3 �������飬���д��������45,6,23,8,26,98,6,15���뽫���������򲢵��������
		int[] array = new int[] { 45, 6, 23, 8, 26, 98, 6, 15 };
		Arrays.sort(array); // ͨ��Arrays������ʡ��ѭ����������
		for (int j = array.length - 1; j >= 0; --j) {
			System.out.print(array[j] + "��");
		}

		// ���򲿷֣�����
		/*
		 * for(int i=1;i<array.length;i++){ for(int j=0;j<array.length-1;j++){
		 * if(array[j]>array[j+1]){ int tmp=array[j]; array[j]=array[j+1];
		 * array[j+1]=tmp; } } }
		 */
		// ��ǿforѭ��
		for (int j : array) {
			System.out.print(j + "��");
		}

	}

}
