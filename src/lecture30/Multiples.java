package lecture30;

public class Multiples {
	
	static int multiples(int n,int k) {
		//base case
		if(k == 0 || n ==0) {
			return 0;
			
		}
		else 
		{
			return n*k;
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( multiples(5, 5));

	}

}
