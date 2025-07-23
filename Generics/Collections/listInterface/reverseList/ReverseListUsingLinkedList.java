package listInterface.reverseList;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseListUsingLinkedList {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			int input=sc.nextInt();
			list.add(input);
		}
		
		LinkedList<Integer> res=new LinkedList<>();
		
		for(int j=n;j>=0;j--) {
			res.add(list.get(j));
		}
		
		System.out.println(res);
		
	}
}
