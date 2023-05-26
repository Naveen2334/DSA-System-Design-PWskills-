package lecture_40;

public class MoveZero {

	
	public static void main(String[] args) {
		int arr[] = {0,0,0,5,0,0};
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]==0&&arr[j+1]!=0) {
					//swap
					int temp =  arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
				
			}
			
		}
		for (int val : arr) {
			System.out.println(val+" ");
			
		}
	}
}
