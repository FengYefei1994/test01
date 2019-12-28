package swtich;

public class swtich {
	public static void main(String args[]){	
		char c = '0';		
		switch(c){
			default:
				c='2';
				break;
			case '1':
				System.out.println("c=1");
				
			case '0':
				System.out.println("c=0");
			case '3':
				System.out.println("c=3");
				break;
			case '4':
				System.out.println("c=4");
			case '2':
				System.out.println("c=2");
		}	
	}

}
