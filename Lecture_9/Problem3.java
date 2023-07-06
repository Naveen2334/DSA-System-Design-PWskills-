package Lecture_9;
//pattern

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i = 1;i<=4;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(".");
					//System.out.print("1");
				}
			}System.out.println();
		}

	}

}
