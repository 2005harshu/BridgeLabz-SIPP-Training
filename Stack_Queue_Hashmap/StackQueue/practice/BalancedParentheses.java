package practice;

import java.util.*;

public class BalancedParentheses {
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(char ch :str.toCharArray()) {
			if(ch =='(' || ch == '{' || ch=='[') {
				stack.push(ch);
			}
			else if(ch ==')' || ch == '}' || ch==']') {
				if(stack.isEmpty()) {
					return false;
				}
				char top=stack.pop();
				if(!isMatchingPair(top,ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	private static  boolean isMatchingPair(char open,char close) {
		return (open =='(' && close == ')') ||
				(open =='{' && close == '}') ||
				(open =='[' && close == ']');
	}
	
	public static void main(String[] args) {
		String input="{{[()]}}";
		if(isBalanced(input)) {
			System.out.println("The string is balanced.");
		}
		else {
			System.out.println("The string is not balanced.");
		}
	}
}
