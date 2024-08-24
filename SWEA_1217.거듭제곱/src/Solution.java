import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	// scanner -> testcase
	// N,M 
	// rek function: M만큼 재귀호출
	Scanner sc = new Scanner(System.in);
	for(int t=1;t<=10;t++) {
		int T = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int ans = ref(N, M);
		System.out.println("#"+T+" "+ans);	
	}
}
// 재귀함수... 나 자신을 돌리기 
	static int ref(int N, int M) {
		if(M==0) {
			return 1;
		}
		else {
			return N*ref(N,M-1);
		}
		
	}
}
