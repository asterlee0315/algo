import java.util.Scanner;
import java.util.Stack;

public class Solution {
public static void main(String[] args) {
	// 스택을 4개 만들어서 괄호마다 넣어주면 되지 않을까
	Scanner sc = new Scanner (System.in);
	
	for(int t=1;t<=10;t++) {
		int N = sc.nextInt();
		String a = sc.next();
		
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		Stack<Character> stack3 = new Stack<>();
		Stack<Character> stack4 = new Stack<>();
		
		for(int i=0; i<a.length();i++) {
			if(a.charAt(i) == '(') {
				stack1.push(a.charAt(i));
			}
			if(a.charAt(i) == '{') {
				stack2.push(a.charAt(i));
			}
			if(a.charAt(i) == '[') {
				stack3.push(a.charAt(i));
			}
			if(a.charAt(i) == '<') {
				stack4.push(a.charAt(i));
			}
			if(!stack1.isEmpty() && a.charAt(i) == ')') {
				stack1.pop();
				
			}
			if(!stack2.isEmpty() &&a.charAt(i) == '}') {
				stack2.pop();
			}
			if(!stack3.isEmpty() &&a.charAt(i) == ']') {
				stack3.pop();
			}
			if(!stack4.isEmpty() &&a.charAt(i) == '>') {
				stack4.pop();
			}		
		}
		if(stack1.size()==0 && stack2.size()==0 && stack3.size()==0 && stack4.size()==0) {
			System.out.println("#"+t+" "+1);
		}
		else {
			System.out.println("#"+t+" "+0);
		}
	}
}
}
