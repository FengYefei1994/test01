package Xunhuan;

import java.util.Scanner;

public class Par3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("输入一个求质数及质数个数范围：");
		int c=scan.nextInt();
		int count=0;
		System.out.print(c+"以内的质数是：");
		for(int i=2;i<=c;++i) {
		if(Par31.isPrimeNormal(i)) {
			System.out.print(i+"；");
			++count;
		}
		}
		System.out.println();
		System.out.print(c+"内质数个数："+count);
		scan.close();
	}
}
