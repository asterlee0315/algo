import java.util.Scanner;
import java.util.Stack;

public class Solution2 {
public static void main(String[] args) {
	// ()) 이렇게 되는 순간 망함...
	Scanner sc = new Scanner (System.in);
	
	for(int t=1;t<=10;t++) {
		int N = sc.nextInt();
		String a = sc.next();
		Stack<Character> stack = new Stack<>();
		
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		int cnt4 = 0;
		boolean isbalanced = true;
	
		System.out.println(cnt1);
		for(int i=0; i<N;i++) {
			if (a.charAt(i) == '(') {
				cnt1++;
				stack.push(a.charAt(i));
			}
			else if (a.charAt(i) == '<') {
				cnt2++;
				stack.push(a.charAt(i));
			}
			else if (a.charAt(i) == '{') {
				cnt3++;
				stack.push(a.charAt(i));
			}
			else if (a.charAt(i) == '[') {
				cnt4++;
				stack.push(a.charAt(i));
			}
			if(isbalanced && stack.isEmpty()) {
				System.out.println("#"+t+" "+1);
			}
			else if (a.charAt(i)== ')') {
				if(!stack.isEmpty() && stack.peek()=='(') {
					stack.pop();
					cnt1--;
				}
				else {
					if(stack.isEmpty() || cnt1==0) {
						isbalanced = false;
						break;
					}
					
				}
			}
			else if (a.charAt(i)== '>') {
				if(!stack.isEmpty() && stack.peek()=='<') {
					stack.pop();
					cnt2--;
				}
				else {
					if(stack.isEmpty() || cnt2==0) {
						isbalanced = false;
						break;
					}
					
				}
			}
			else if (a.charAt(i)== '}') {
				if(!stack.isEmpty() && stack.peek()=='{') {
					stack.pop();
					cnt3--;
				}
				else {
					if(stack.isEmpty() || cnt3==0) {
						isbalanced = false;
						break;
					}
					
				}
			}
			else if (a.charAt(i)== ']') {
				if(!stack.isEmpty() && stack.peek()=='[') {
					stack.pop();
					cnt4--;
				}
				else {
					if(stack.isEmpty() || cnt4==0) {
						isbalanced = false;
						break;
					}
					
				}
			}
			  if (stack.isEmpty()) {
                  isbalanced = false;
                  break;
              }
			
		else {
			System.out.println("#"+t+" "+0);
		}
	
	
	
}
}
}
}	