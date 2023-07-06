package lecture29;

public class Power {
	static int pow(int p,int q) {
		//base case
		if(q==0)
		{
			return 1;
		}
		else {
			return pow(p,q-1)*p;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2,3));

	}

}
