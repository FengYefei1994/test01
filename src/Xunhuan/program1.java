//���һ��Сд��ĸ�����в���ĸ��Ϸ����ͳ�Ʋ²����

package Xunhuan;

import java.util.*;
public class program1 {
	public static void main(String[] args) {
		/*
		 * ���� [min,max] ������
         * int i1 =(int) Math.random() *(max-min+1)+m;������������ǿ��ת������Ϊint������Ҳ��
         * ran.next(26)+97;
         * (Math.random()*26+97)
         * 
         * char charInput = tmp.charAt(0);
		 */
		char a = (char) (Math.random()*(122-97+1)+97);
		//System.out.println(a);
		int i;
		Scanner scan= new Scanner(System.in);       //ɨ����
		for(i=1;;i++){
		System.out.println("������һ��Сд��ĸ��");
		String r=scan.next();                       //��������
		if(r.charAt(0)==a) {                        //char�����㹦�ܣ��ȴ�С���Ӽ��˳���ת��ΪASCII��ֵ�������㣩
			System.out.println("������");
			break;
		}
		else if(r.charAt(0)<a) {
			System.out.print("��С�ˣ�");
		}else{
			System.out.print("�´��ˣ�");
		}
		}
		System.out.println(i);
		scan.close();
	}
}
