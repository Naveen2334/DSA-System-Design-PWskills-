package Greedy1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class logic1 {
	private static class Item{
		Integer value;
		Integer weight;
		public String toString() {
			return value+" ::::"+weight;
		}
	}
	private static class ItemComparator implements Comparator<Item>{

		@Override
		public int compare(Item o1, Item o2) {
			// TODO Auto-generated method stub
			if((o1.value/o1.weight)<(o2.value/o2.weight))
			return 1;
			else if((o1.value/o1.weight)>(o2.value/o2.weight))
				return -1;
			else
				return 0;
		}
		
	}
	public static void main(String[] args) {
		List<Integer> value = List.of(60,100,150,120);
		List<Integer> weights = List.of(10,20,50,15);
		List<Item> itemsList = new ArrayList<>();
		for(int i= 0;i<value.size();i++)
		{
			Item item = new Item();
			item.value= value.get(i);
			item.weight = weights.get(i);
			itemsList.add(item);
		}
		itemsList.sort(new ItemComparator());
		System.out.println(itemsList);
		int w = 30;
		int profit = 0;
		while(w > 0) {
			for(int i = 0;i <itemsList.size();i++) {
				Item item = itemsList.get(i);
				if(item.weight <= w) {
					profit += item.value;
					w-= item.weight;
					
				}
				else {
					profit += (item.value)/item.weight*w;
					w = 0;
				}
				System.out.println(profit);
			}
		}
	}

}
