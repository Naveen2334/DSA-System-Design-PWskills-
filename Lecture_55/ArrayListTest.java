package Lecture_55;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			arrayList.add(i);
			
		}
		System.out.println(arrayList);
		arrayList.remove(4);

		System.out.println(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i)+ " ");
		}
	
	}

}
