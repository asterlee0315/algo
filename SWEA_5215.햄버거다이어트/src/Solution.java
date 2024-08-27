import java.util.Scanner;
/// also in diese powerset problemem du musst ja bedenken
/// 3 Bereichen
	// 1. unter import
		// hier musst ja die static elements einfugen soll
	// 2. main()
		
	// 3. powerset()

public class Solution {
	static int N;
	static int L;
	static int [] point;	
	static int [] cal;
	static boolean [] sel;
	static int ans;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int t=1;t<=T;t++) {
		N = sc.nextInt();
		L = sc.nextInt();
		point = new int[N];
		cal = new int[N];
		sel = new boolean[N];
		ans=0;
		for(int i=0;i<N;i++) {
			point[i]=sc.nextInt();
			cal[i]=sc.nextInt();
		}
		
		powerset(0);
		System.out.println("#"+t+" "+ans);
	}
}


public static void powerset(int idx) {
	// 기저 부분
	if(idx==N) {
		int sum=0;
		int sum2=0;
		for(int i=0;i<N;i++) {
			if(sel[i]) {
				sum+=point[i];
				sum2+=cal[i];
			}
		}
		if(sum2<=L && sum>ans) {
			ans=sum;
		}
		return; // niemals vergessen bitte return return return nach wo du warst
	}
	// 재귀 부분
	sel[idx]=true;
	powerset(idx+1);
	sel[idx]=false;
	powerset(idx+1);
	
}
}
