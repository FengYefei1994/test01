package Xunhuan;

import java.util.Scanner;

public class Par2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("������һ����������");
		int a=scan.nextInt();
		//System.out.println(a);
		/*
		int i=2;
		if(a==2||a==3) {
			System.out.println(a+"��������");
		}else{
			for(;i<=a-1;++i) {
				if((a%i)==0) {
					//System.out.println("����֮һ��"+i);
					//System.out.println(a+"��һ��������");
					break;
				}else {
					if(i==a-1) {
						System.out.println(a+"��һ��������");
					}
				}
			}
		}
		*/
		
		//Java���ú���������
		
		if(Par31.isPrimeNormal(a)) {
			System.out.println(a+"��һ��������");
		}else {
			System.out.println(a+"��һ��������");
		}
		
	scan.close();
	}
}
