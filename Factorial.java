package week1.day1;

public class Factorial {
	public static void main(String[] args) {
		int mid = 1;
		for(int i=1;i<=3;i++)
		{
			int factorial = mid*i;
			mid = factorial;
		}
		System.out.println(mid);
	}

}
