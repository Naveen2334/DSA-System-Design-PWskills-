package lecture29;
// sum of digit 
public class SOD {
	static int sod(int n) {
		if(n>=0&& n<=9) {
			return n;
		}
		else
		{
			return sod(n/10)+n%10;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sod(12345));

	}

}
