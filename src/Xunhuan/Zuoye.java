/*
 * 12-23上午作业
 * 1、1.01的365次结果
 * 2、1.01的多少次幂大于30
 * 3、1-100中3倍数和
 * 4、判断字符串中是否有数字
 * 5、1900-2020中闰年
 */

package Xunhuan;

import java.util.Scanner;

public class Zuoye {

	public static void main(String[] args) {
		//求结果
		/*double a=1.01;
		double b=1;
		for(int i=1;i<=365;i++) {
			b=a*b;
		}
		System.out.println(b);
		*/
		
		
		//求超过30时次方数
		double a=1.01;
		double b=1;
		for(int i=1;i<=365;i++) {
			b=a*b;
			if(b>=30) {
				System.out.println("在第"+i+"次时，结果大于30！");
				break;
			}
		}
		
		double r=Math.pow(1.01,365);              //JDK数学计算公式
		
		
		//1-100中3倍数的和
		/*
		int sum=0;
		for(int i=1;i<=100;i++) {
			if((i%3)==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		*/
				
		//1900-2020之间的闰年
		/*
		for(int i=1900;i<=2020;i++) {
				 
			if((i%4==0) && (i%100!=0) || (i%400==0)) {
				System.out.println(i+";");
			}
		}
		*/
				
		//任意字符串中是否包含数字
		/*Scanner scan= new Scanner(System.in);       //扫描器
		System.out.println("请输入任意字符串：");
		String r=scan.next();                         //接收数据    input.next()是字符串输入
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
			System.out.println("包含数字："+b+"个！");
		}else{
			System.out.println("不包含数字！");
		}
		*/
				
	}
}


