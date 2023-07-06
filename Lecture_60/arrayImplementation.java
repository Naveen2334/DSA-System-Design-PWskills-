package Lecture_60;

public class arrayImplementation {
	public static class queueA{
		int f = -1;
		int r = -1;
		int size = 0;
		int arr[] = new int[5];
		
		public void add(int val) {
			if(r == arr.length-1) {
				System.out.println("queue is full");
			}
			if(f==-1) f=r=0;
			else {
				arr[++r]=val;
			}
			size++;
		}
		public int remove() {
			if(size==0) {
				System.out.println("queue is empty");
			}
			f++;
			size--;
			return arr[f-1];
			
		}
		public int peek() {
			if(size==0) {
				System.out.println("queue is empty");
			}
			return arr[f];
		}
		public boolean isempty() {
			if(size==0) return true;
			else return false;
		}
		
	}

}
