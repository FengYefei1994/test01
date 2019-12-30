package Xunhuan;

import java.util.Scanner;

public class Par1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float aver=0.0f;
		int sum=0;
		int max=0;
		int min = 45;
		int i=0;
		System.out.print("请输入一个数字：");
		int a=scan.nextInt();
		do {
			if(a==0) {
				break;
			}else {
				sum=sum+a;
				++i;
				aver=(float)sum/i;
				if(a>max) {
					max=a;
				}
				if(a<min) {
					min=a;
				}
			}
			System.out.print("请输入一个数字：");
			a=scan.nextInt();
		}while(a!=0);
		System.out.println("和："+sum);
		System.out.println("aver："+aver);
		System.out.println("i："+i);
		System.out.println("max："+max);
		System.out.println("min："+min);
		scan.close();
	}
}