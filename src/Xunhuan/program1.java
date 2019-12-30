//随机一个小写字母，进行猜字母游戏，并统计猜测次数

package Xunhuan;

import java.util.*;
public class program1 {
	public static void main(String[] args) {
		/*
		 * 生成 [min,max] 的数字
         * int i1 =(int) Math.random() *(max-min+1)+m;——————强制转换类型为int，其他也可
         * ran.next(26)+97;
         * (Math.random()*26+97)
         * 
         * char charInput = tmp.charAt(0);
		 */
		char a = (char) (Math.random()*(122-97+1)+97);
		//System.out.println(a);
		int i;
		Scanner scan= new Scanner(System.in);       //扫描器
		for(i=1;;i++){
		System.out.println("请输入一个小写字母：");
		String r=scan.next();                       //接收数据
		if(r.charAt(0)==a) {                        //char有运算功能：比大小，加减乘除（转换为ASCII码值进行运算）
			System.out.println("猜中了");
			break;
		}
		else if(r.charAt(0)<a) {
			System.out.print("猜小了，");
		}else{
			System.out.print("猜大了，");
		}
		}
		System.out.println(i);
		scan.close();
	}
}
