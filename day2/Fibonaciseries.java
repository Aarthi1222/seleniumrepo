package week1day1.day2;

public class Fibonaciseries {
	public static void main(String[] args) {
int a,b,sum,n;
a=0;//first fibonacci number
b=1;//second fibonacci number
for(n=1;n<=13;n++)
{
	System.out.println(a);//print  current fibonacci number
sum=a+b;//sum of fibanacci number
a=b;//update a to next fibonacci series
b=sum;//update b to next value of sum
}
	}
}