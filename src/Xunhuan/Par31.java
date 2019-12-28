package Xunhuan;

public class Par31 {
	public static boolean isPrimeNormal(int num) {
		
		/*
		 for(int i=2; i<num; i++) {
		 
			if(num%i == 0) {
				return false;
			}
		}
		return true;

		int tmp = (int) Math.sqrt(num);//获取平方根
		//在6的倍数两侧的也可能不是素数
		for(int i=5; i<=tmp; i+=6) {
			if(num%i==0 || num%(i+2)==0) {
				return false;
			}
		}	
		return true;
		*/
	
		
		//两个较小数另外处理 
		if(num==2 || num==3) {
			return true;
		}
			
		//不在6的倍数两侧的一定不是素数
		if(num%6!=1 && num%6!=5) {
			return false;
		}
		return true;
	}
}		