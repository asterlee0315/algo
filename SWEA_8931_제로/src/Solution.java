
import java.util.Scanner;
import java.util.Stack;

public class Solution { // 스택으로 구현
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();

	for(int t=1;t<=T;t++) {
		int sum=0;
		int j=sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<j;i++) {
			int m = sc.nextInt();
			if(m!=0) {
				stack.push(m);
			}
			else { 
				stack.pop();
			}		
		}
		// 스택 돌면서 sum에 값 추가 
		while(!stack.isEmpty()) {
			sum+=stack.pop();
		}
	System.out.println("#"+t+" "+sum);
	
	}
}
}
