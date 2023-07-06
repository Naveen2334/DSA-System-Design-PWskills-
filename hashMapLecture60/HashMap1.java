package hashMapLecture60;

import java.util.*;

public class HashMap1 {
	static void HashMap() {

		Map<String, Integer> mp = new HashMap<>();
		mp.put("akash", 21);
		mp.put("neha", 23);
		mp.put("kratika", 25);
		mp.put("alam", 19);
		System.out.println(mp);
		System.out.println(mp.get("alam"));
		System.out.println(mp.get("rahul"));
		mp.put("alam", 35);
		System.out.println(mp);
		System.out.println(mp.remove("akash"));
		System.out.println(mp.remove("ala"));
		System.out.println(mp.containsValue("akash"));
		System.out.println(mp.containsKey("alam"));
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		System.out.println(mp.entrySet());
	/*	for (String key : mp.keySet()) {
			System.out.printf("Age of %s is %d\n", key, mp.get(key));

		}
		for(var e : mp.entrySet()) {
			System.out.printf("age is of %d\n",e.getKey(),e.getValue());
		}
*/
	}

	public static void main(String[] args) {
		HashMap();
	}
}
