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

		int tmp = (int) Math.sqrt(num);//��ȡƽ����
		//��6�ı��������Ҳ���ܲ�������
		for(int i=5; i<=tmp; i+=6) {
			if(num%i==0 || num%(i+2)==0) {
				return false;
			}
		}	
		return true;
		*/
	
		
		//������С�����⴦�� 
		if(num==2 || num==3) {
			return true;
		}
			
		//����6�ı��������һ����������
		if(num%6!=1 && num%6!=5) {
			return false;
		}
		return true;
	}
}		