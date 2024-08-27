package 부분집합;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA5215_햄버거다이어트 {
	static int N, L;
	static int [] point;
	static int [] cal;
	static boolean sel [];
	static int ans;
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	int T = sc.nextInt();
	for(int t=1;t<=T;t++) {
		N=sc.nextInt();
		L=sc.nextInt();
		point = new int [N];		
		cal = new int [N];
		sel = new boolean[N];
		ans=0;
		for(int i=0;i<N;i++) {
			point [i]= sc.nextInt();
			cal [i] = sc.nextInt();
		}
	powerset(0);
	System.out.println("#"+t+" "+ans);

	}
}

public static void powerset(int idx) {
	//기저
	if(idx==N) {
		int sum=0;
		int sum2=0;
		for(int i=0;i<N;i++) {// 지금 어디 돌거냐면.. sel
			if(sel[i]) {
				sum+=point[i];
				sum2+=cal[i];
			}
		}
//		System.out.println(sum);
		if(sum2<=L && sum>=ans) {
			ans=sum;
		}

		return;
	}
	// 재귀부분
	sel[idx]=true;
	powerset(idx+1);
	sel[idx]=false;
	powerset(idx+1);
}
}
