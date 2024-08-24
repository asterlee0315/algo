
import java.util.EmptyStackException;
import java.util.Stack;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	
	for(int t=1; t<=10; t++) {
		int a = sc.nextInt();
		sc.nextLine();
		String equation = sc.nextLine();
		String postfix = intoPostfix(equation);
//	System.out.println(postfix);
	
		int result = calculatePostfix(postfix);
		System.out.printf("#%d %d\n",t, result);

	}
	sc.close();
	}
	

	
	// 중위 표기법 into 후위표기법으로 변환
	 public static String intoPostfix(String str) {
	  Stack<Character> stack = new Stack<>();
	  StringBuilder postfix = new StringBuilder();

	  for (int i = 0; i < str.length(); i++) {
		  char cur = str.charAt(i);
		  if (Character.isDigit(cur)) {
			  postfix.append(cur).append(' '); // 숫자는 바로 추가
		  } else if (cur == '(') {
	                stack.push(cur); // 여는 괄호는 스택에 추가
		  } else if (cur == ')') {
	                // 닫는 괄호는 여는 괄호를 만날 때까지 스택에서 pop
			  while (!stack.isEmpty() && stack.peek() != '(') {
	                    postfix.append(stack.pop()).append(' ');
			  }
			  if(!stack.isEmpty()) {
				  stack.pop(); // 여는 괄호 제거				  
			  }
	      } else if (isOperator(cur)) {
	    	  // 연산자 처리
	    	  while (!stack.isEmpty() && precedence(stack.peek()) >=precedence(cur)){
	    		  postfix.append(stack.pop()).append(' ');
	    	  }
	    	  stack.push(cur);
	      }
	  }
	// 스택에 남아 있는 모든 연산자를 pop
      while (!stack.isEmpty()) {
          postfix.append(stack.pop()).append(' ');
      }

      return postfix.toString().trim();
  }


	

	private static int precedence(Character peek) {
		switch(peek) {
		case '+':
		case '-': 
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return -1;
		}
	}

	public static int calculatePostfix(String equation) {
		Stack<Integer> stack = new Stack<>();
		
		// 입력 문자열을 토큰으로 분리, 기준은 공백
		String[] tokens = equation.split(" ");
		
		// 스택에 집어넣어주기
		for(String token : tokens) {
			// 숫자 토큰인가
			if(isNumeric(token)) {
				stack.push(Integer.parseInt(token)); // 숫자면 스택에 추가
			}
			//연산자인가 checken
			else {
				if(stack.isEmpty()) {
					throw new EmptyStackException();
				}
				//연산자면 (앞에있는) 숫자들 먼저 꺼내주고
				int operand2 = stack.pop(); // LIFO로 2번 연산자가 먼저 나오고 연산자 기준 오른쪽으로 고고
				if (stack.isEmpty()) {
					throw new EmptyStackException();
				}
				int operand1 = stack.pop();
				// 계산
				int result = applyOperator(token,operand1, operand2);
				// 계산 결과를 스택에 푸쉬
				stack.push(result);
			}
		}
		 if (stack.isEmpty()) {
	            throw new EmptyStackException();
	        }
	        return stack.pop();
	    }

	private static boolean isOperator(char cur) {
		return cur== '+' || cur == '-' || cur == '*' || cur == '/' || cur == '^';
	}

	private static boolean isNumeric(String token) {
		try {
			Integer.parseInt(token);
			return true;
		} catch(NumberFormatException e) {			
			return false;
		}
	}
	
	
			
	private static int applyOperator(String token, int operand1, int operand2) {
		switch(token) {
		case "+":
			return operand1+operand2;
		case "-":
			return operand1-operand2;
		case "*":
			return operand1*operand2;
		case "/":
			return operand1/operand2;
		case "^":
			return (int) Math.pow(operand1, operand2);
		}
		return 0;
		}	
	}

