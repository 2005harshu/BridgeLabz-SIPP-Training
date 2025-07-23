package listInterface.reverseList;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseListUsingArrayList {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int input=sc.nextInt();
			list.add(input);
		}
		
		System.out.println(list);
		
		List<Integer> res=new ArrayList<>();
		
		for(int j=n-1;j>=0;j--) {
			res.add(list.get(j));
		}
		
		System.out.println(res);

	}
}
