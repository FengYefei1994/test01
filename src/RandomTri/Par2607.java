package RandomTri;

import java.util.Scanner;

public class Par2607 {

	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		//int[] b=new int[10];
		int i=0;
		int sum=0;
		while(i<=100){
			++i;
			if(i%2==0) {
			sum+=i;
			}
		}
		//scan.close();
		System.out.println("100内偶数的和是："+sum);
	}
}
