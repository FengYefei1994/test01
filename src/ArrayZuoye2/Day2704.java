package ArrayZuoye2;

import java.util.Scanner;

/*
 * �ġ�	���5�ʹ�����ܽ��

 */
public class Day2704 {

	public static void main(String[] args) {
		
		int[] a= new int[5];
		System.out.println("������5�����ѽ�");
		Scanner scan=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;++i) {
			System.out.print("�������"+(1+i)+"�����ѽ�");
			a[i]=scan.nextInt();
			sum+=a[i];
			
		}
		scan.close();
		System.out.println("���"+"\t��Ԫ��");
		int i=1;
		for(int b:a) {
			System.out.println(i+"\t"+b);
			++i;
		}
		System.out.println("�ܽ��"+"\t"+sum);
		
		

	}

}
