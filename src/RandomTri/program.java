/*
 * ������������ɷ�ʽ��
 * 1��Random ran1=new Random(); 
 * 		int a =ran1.nextInt(30);��������random.nextInt(N)������[0, N�����������
 *		���ɷ�Χ�������[min, max]�� random.nextInt(max) % (max - min + 1) + min 
 * 
 * 2��Math.random()
 * 		���� [max,min] ��Χ�ڵ��������
 *		int i1 =(int) Math.random() * (max-min+1)+min;
 *3��������������������������ι����ж�
 */

package RandomTri;

import java.util.*;
public class program {

	public static void main(String[] args) {
		Random ran1=new Random();                        //������Ϊ����������ݵ����ӡ����൱������ֵ
		int[] Arr1= {0,0,0};
		for(int i=0;i<3;i++) {
			Arr1[i]=ran1.nextInt(122)%(122-97+1)+97;      //����97-122���������
		}
		//����������ð��
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
		if((a+b<c)) {                                 //�϶�����֮�ʹ��ڵ����߼�����������
			System.out.println("���ܹ���������");
		}else if(a==b&&b==c){
			System.out.println("���ɵȱ�������");
		}else if((a==b)&&(a*a+b*b==c*c)) {
			System.out.println("���ɵ���ֱ��������");
		}else if((a==b)||(b==c)) {
			System.out.println("���ɵ���������");
		}else {
			System.out.println("������ͨ������");
		}
		
	}

}
