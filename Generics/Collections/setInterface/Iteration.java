package setInterface;

import java.util.Iterator;
import java.util.ArrayList;

public class Iteration {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Adidas");
		list.add("Nike");
		list.add("puma");
		
		Iterator<String> shoes = list.iterator();
		
		while(shoes.hasNext()) {
			String shoe = shoes.next();
			System.out.println(shoe);
		}
	}
}
