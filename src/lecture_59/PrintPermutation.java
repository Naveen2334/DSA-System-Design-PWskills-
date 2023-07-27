package lecture_59;

public class PrintPermutation {
	public static void main(String[] args) {
   			
	String str = "abc";
	printp(str, "");

	}
	public static void printp(String str,String t) {
		
		if(str=="")
		{
			System.out.println(t);
			return;
		}
		
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			String left = str.substring(0,i);//a
			
			String right = str.substring(i+1);//c
			String rem = left +right;
			printp(rem,t+ch);
			
		}
	}
}
