import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int T = sc.nextInt();
	for(int t=1; t<=T;t++) {
		String a = sc.next();
//		String [] arr = a.split(""); 배열을 굳이 만들지 않아도 괜찮
		
		Stack<Character> stack = new Stack<>();
		int cnt=0;
		
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) == '(') {
				stack.push('(');
			}
			else if(a.charAt(i)==')') {
				stack.pop();
				if(a.charAt(i-1) == '(') {
					cnt+=stack.size();
				}
				else {
					cnt++;
				}
			}
		}
		System.out.println("#"+t+" " +cnt);

	}
}
}
