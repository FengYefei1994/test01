/*
 * 两种随机数生成方式：
 * 1、Random ran1=new Random(); 
 * 		int a =ran1.nextInt(30);————random.nextInt(N)，生成[0, N）的随机整数
 *		生成范围内随机数[min, max]， random.nextInt(max) % (max - min + 1) + min 
 * 
 * 2、Math.random()
 * 		生成 [max,min] 范围内的随机数字
 *		int i1 =(int) Math.random() * (max-min+1)+min;
 *3、生成三个随机数，进行三角形构成判断
 */

package RandomTri;

import java.util.*;
public class program {

	public static void main(String[] args) {
		Random ran1=new Random();                        //括号中为生成随机数据的种子——相当于中心值
		int[] Arr1= {0,0,0};
		for(int i=0;i<3;i++) {
			Arr1[i]=ran1.nextInt(122)%(122-97+1)+97;      //生成97-122的随机整数
		}
		//数组中排序：冒泡
		for(int i=1;i<Arr1.length;i++){
			for(int j=0;j<Arr1.length-1;j++){
				if(Arr1[j]>Arr1[j+1]){
					int tmp=Arr1[j];
					Arr1[j]=Arr1[j+1];
					Arr1[j+1]=tmp;
				}				
			}	
		}
		System.out.println(Arr1[0]+","+Arr1[1]+","+Arr1[2]);
		int a=Arr1[0];
		int b=Arr1[1];
		int c=Arr1[2];
		if((a+b<c)) {                                 //较短两边之和大于第三边即构成三角形
			System.out.println("不能构成三角形");
		}else if(a==b&&b==c){
			System.out.println("构成等边三角形");
		}else if((a==b)&&(a*a+b*b==c*c)) {
			System.out.println("构成等腰直角三角形");
		}else if((a==b)||(b==c)) {
			System.out.println("构成等腰三角形");
		}else {
			System.out.println("构成普通三角形");
		}
		
	}

}
