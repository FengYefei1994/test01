/*
 * 12-23������ҵ
 * 1��1.01��365�ν��
 * 2��1.01�Ķ��ٴ��ݴ���30
 * 3��1-100��3������
 * 4���ж��ַ������Ƿ�������
 * 5��1900-2020������
 */

package Xunhuan;

import java.util.Scanner;

public class Zuoye {

	public static void main(String[] args) {
		//����
		/*double a=1.01;
		double b=1;
		for(int i=1;i<=365;i++) {
			b=a*b;
		}
		System.out.println(b);
		*/
		
		
		//�󳬹�30ʱ�η���
		double a=1.01;
		double b=1;
		for(int i=1;i<=365;i++) {
			b=a*b;
			if(b>=30) {
				System.out.println("�ڵ�"+i+"��ʱ���������30��");
				break;
			}
		}
		
		double r=Math.pow(1.01,365);              //JDK��ѧ���㹫ʽ
		
		
		//1-100��3�����ĺ�
		/*
		int sum=0;
		for(int i=1;i<=100;i++) {
			if((i%3)==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		*/
				
		//1900-2020֮�������
		/*
		for(int i=1900;i<=2020;i++) {
				 
			if((i%4==0) && (i%100!=0) || (i%400==0)) {
				System.out.println(i+";");
			}
		}
		*/
				
		//�����ַ������Ƿ��������
		/*Scanner scan= new Scanner(System.in);       //ɨ����
		System.out.println("�����������ַ�����");
		String r=scan.next();                         //��������    input.next()���ַ�������
		int a=r.length();
		int b=0;
		System.out.println(a);
		for(int i=0;i<a;i++) {
			char c=r.charAt(i);
			if(c<'9' && c>'0') {
				b=b+1;
				}
		}
		if(b>0) {
			System.out.println("�������֣�"+b+"����");
		}else{
			System.out.println("���������֣�");
		}
		*/
				
	}
}


