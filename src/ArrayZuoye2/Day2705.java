package ArrayZuoye2;

import java.util.Arrays;
import java.util.Scanner;

/*
 *�塢ѭ��¼��5λѧԱ�ɼ��������������к���������
 *ʹ��java.util.Arrays���sort()����
 */
public class Day2705 {

	public static void main(String[] args) {
		
		int[] a= new int[5];
		System.out.println("������5��ѧ���ɼ���");
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<5;++i) {
			System.out.print("�������"+(1+i)+"��ѧ���ɼ���");
			a[i]=scan.nextInt();
		}
		scan.close();
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		

	}

}
