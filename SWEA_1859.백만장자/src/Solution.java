import java.util.Scanner;
import java.util.Stack;
public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int t=1;t<=T;t++) {
		int d = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		// 스택으로 풀어보까
			// d만큼 반복해서 스택에 넣고
		for(int i=0;i<d;i++) {
			stack.push(sc.nextInt());
		}
		
		boolean right = true;
		int sales =0;
		int ans =0;
		for(int j=stack.size();j<=0;j--) {
			int num2 = stack.pop();
			int num1 = stack.pop();
			if(num2<num1) {
				right = false;
				continue;
			}
			else {
				sales = num2;
				ans+=sales-num1;
			}
		}
		System.out.println(ans);
			// pop하고 pop해서 num2가 num1 보다 작으면 0출력
			// pop하고 pop해서 num2가 num1 보다 크면 
				// sales를 num2로 지정
				// check if other elements are smaller than num2
					// if so then change element into sales
		
		
	}
}
}
