package Greedy1;

import java.util.ArrayList;
import java.util.List;

public class App {
	private static class Meeting{
		Integer startTime;
		Integer finishTime;
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return startTime+ " "+finishTime;
		}
	}

	

	public static void main(String[] args) {
		List<Integer> start =  List.of(1,3,0,5,8,5);
		List<Integer> finish = List.of(2,4,6,7,9,9);
		List<Meeting> meetings =  new ArrayList<>();
		for(int i = 0;i<start.size();i++) {	
			Meeting meeting =  new Meeting();
			meeting.startTime = start.get(i);
			meeting.finishTime = finish.get(i);
			
		}
		

	}

}
