package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int f1,f2,count,sum;
		f1 = 0;
		f2 = 1;

		System.out.println(f1);
		System.out.println(f2);
		for (count = 1;count<=6;count++)
		{
			System.out.println(sum = f1+f2);
			f1=f2;
			f2=sum;
		
		}
	}

}
