package ArrayZuoye2;

import java.util.Scanner;

/*
 * 四、	输出5笔购物金额及总金额

 */
public class Day2704 {

	public static void main(String[] args) {
		
		int[] a= new int[5];
		System.out.println("请输入5笔消费金额：");
		Scanner scan=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<5;++i) {
			System.out.print("请输入第"+(1+i)+"笔消费金额：");
			a[i]=scan.nextInt();
			sum+=a[i];
			
		}
		scan.close();
		System.out.println("序号"+"\t金额（元）");
		int i=1;
		for(int b:a) {
			System.out.println(i+"\t"+b);
			++i;
		}
		System.out.println("总金额"+"\t"+sum);
		
		

	}

}
