package listInterface;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
//import java.util.Scanner;

public class FindFrequency {
	//static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Map<String,Integer> freq=new HashMap<>();
		List<String> list =new ArrayList<>();
		
		list.add("apple");
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++) {
			if(list.contains(list.get(i))) {
				freq.put(list.get(i),freq.get(list.get(i)+1));
			}
			else {
				freq.put(list.get(i),1);
			}
		}
//		
		System.out.println(freq);
	}
}
