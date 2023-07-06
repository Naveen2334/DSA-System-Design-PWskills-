package lecture30;

import java.util.Scanner;

public class SumofSeries {
	
	static int seriesSum(int n)
	{
		
		if(n==0)
		{
			return 0;
		}
		else {
			return seriesSum(n-1)+n;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(seriesSum(n));

	}

}
