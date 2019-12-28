package Xunhuan;

import java.util.Scanner;

public class Par2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入一个正整数：");
		int a=scan.nextInt();
		//System.out.println(a);
		/*
		int i=2;
		if(a==2||a==3) {
			System.out.println(a+"是质数！");
		}else{
			for(;i<=a-1;++i) {
				if((a%i)==0) {
					//System.out.println("因子之一："+i);
					//System.out.println(a+"是一个合数！");
					break;
				}else {
					if(i==a-1) {
						System.out.println(a+"是一个质数！");
					}
				}
			}
		}
		*/
		
		//Java内置函数求质数
		
		if(Par31.isPrimeNormal(a)) {
			System.out.println(a+"是一个质数！");
		}else {
			System.out.println(a+"是一个合数！");
		}
		
	scan.close();
	}
}
