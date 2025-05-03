package week1day1.day2;

public class IsPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;//initialise the number
		//check if the number i positive or negative
		if(num>0)
		{
			System.out.println( "positive number");
		}
		else if(num<0) {
			
			System.out.println("negative number");//handling the case when the number is zero
		}
		else {
			System.out.println("zero");      
			
		}
		

	}

}
