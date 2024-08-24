import java.util.Scanner;
import java.util.Stack;

public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 메인함수안에서 메인오더 내리기
	String expression = " ";
	String postfix = intopostfix(String expression);
	int result = evaluate(String postfix);
}

// 1. 중위를 후위로 바꾸어서 2. post 식을 계산
	//1. via intopostfix function

	static String intoPostfix(String expression) {
		String postfix="";
		Stack<String> stack = new Stack<>();
	// 1. 피연산자면 추가 2. 여는 괄호면 스택에 추가 3. 닫는 괄호면 열린 괄호 나올때까지 pop 4. 우선순위에 따라서 연산자.. 출력?
		for(int i=0;i<expression.length();i++) {
			char c = expression.charAt(i);
			
			// 1.피연산자면 추가
			if(c>='0' && c<='9'){
			postfix += c;
				}
			// 2. 여는 괄호면 스택에 추가
			else if(c='(') {
				stack.push(c);
			}
			//3. 닫는 괄호면 열린 괄호 나올 때까지 pop
			else if(c=')') {
				while(!='(') {
					String popItem= stack.pop();
					postfix+=popItem;
				}
			//4. 우선순위에 따라서 연산자 출력 팝
			else {// 스택이 비어있지 않고 / 여는 괄호가 아니고 && 우선순위가 작은 게 나올 때까지(to 후위니까 먼저 계산할 우선순위 높은 애들 빼주기)
				while(!stack.isEmpty() && stack.peek()!='(' && map.get(stack.peek)>=map.get(c)) {
					String popItem = stack.pop();
					postfix+=popItem;
				}
				// push는 곱하기가 나왔으면 -/+가 나올때까지 스택 안에 있는 애들을 건드려주고 우리의 인자 c를 처리하는 것
				stack.push(c);
			}
			}
			// 후위식 만들기 마지막 단계는 스택 털어주기
			while(stack.isEmpty()) {
				String popItem = stack.pop();
				postfix+=popItem;
			}
		}			
	}
	
	
//2. evaluate(postfix)
	// 위에서 postfix를 만들었으니 얘를 계산
		// 
	static int evaluate(String postfix) {
		Stack<Integer> stack2 = new Stack<>(); // 계산스택 eval 스택에는 숫자만 들어가요
		for(int i=0<i<postfix.length();i++) {
			char c = postfix.charAt(i);
			
			// 마찬가지로 피연산자면 그냥 push
			if('0'<=c&&c<='9') {
				stack2.push(c-'0');
			}
			else {				// 연산자면 왜냐면 괄호 없자네
				int num2 = stack2.pop();
				int num1 = stack2.pop();
				int result;
					if(c=='+') {
					result = num1 + num2;
				}
					else if(c=='-') {
						result = num1 - num2;
					}
					else if(c=='*') {
						result = num1*num2;
					}
					else {
						result = num1/num2;
					}
			}
			stack2.push(result); // 중간계산값을 스택에 저장
		}
		return stack.pop(); // 헷갈 노노 스택에 마지막에 남아있는 잔여값이 계산결과값
	}

}