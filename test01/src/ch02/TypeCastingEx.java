package ch02;

public class TypeCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//형 변환
		byte b=3;
		int num=b;
		
		b=(byte)num;
		System.out.println(b);
		
		int num1=(int)(num+3.5);      
		System.out.println(num1); 
		
		
	}
	
	

}
