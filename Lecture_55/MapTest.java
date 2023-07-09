package Lecture_55;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		Map<String, Integer> map =  new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.put("e",5 );
		
		System.out.println(map);
		//for each loop
		
		for(Map.Entry<String, Integer> entry: map.entrySet())
		{
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		//for loop
		
		for(int i = 0;i<map.size();i++) {
			System.out.println(map.keySet());
			System.out.println(map.values());
		}
	}


}
