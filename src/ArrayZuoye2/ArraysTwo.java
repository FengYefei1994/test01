package ArrayZuoye2;

import java.util.Scanner;

public class ArraysTwo {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("有几个班：");
		int classcount =input.nextInt();                          //用来保存各个班的所有学生名单
		String[][] names=new String[classcount][];                //names的长度其实是最高维的长度，也就是班级数，也就是classCount
		for(int i=0;i<names.length;++i) {
			System.out.println("第"+(i+1)+"个班有多少个人？");
			int studentcount =input.nextInt();
			names[i]=new String[studentcount];
		}
		
		for(int i=0;i<names.length;++i) {
			for(int j=0;j<names[i].length;++j) {                 //具体到第几列数组就用    数组名[列数].length    表示
				names[i][j]=(i+1)+"班"+(j+1)+"学员";
			}
		}
		
		int lostTotal=0;//所有班的总缺勤人数
		int countTotal = 0;//所有班的总人数
		for (int i = 0; i < names.length; i++) {
			int lost = 0;//第i班缺勤人数
			System.out.println((i+1)+"班开始点名------------------------------------");
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j]+"是否到y/n？");
				String answer = input.next();
				if (answer.equals("n")) {
					lost++;
				}
			}
			System.out.println((i+1)+"班点名结束------------------------------------\n");
			System.out.println((i+1)+"班考勤结果：");
			System.out.println("应到人数："+names[i].length);
			System.out.println("实到人数："+(names[i].length-lost));
			double rate = (double)(names[i].length-lost)/names[i].length;
			System.out.println("出勤率："+rate*100+"%");
			lostTotal += lost;
			countTotal+= names[i].length;
		}
		System.out.println("\n\n*****************总的考勤结果*****************");
		System.out.println("应到人数："+countTotal);
		System.out.println("实到人数："+(countTotal-lostTotal));
		double rate = (double)(countTotal-lostTotal)/countTotal;
		System.out.println("出勤率："+rate*100+"%");

		input.close();
	}

}
