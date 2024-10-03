import java.util.Arrays;
import java.util.Scanner;
public class Solution {
	static int d;
	static int m;
	static int three;
	static int y;
	static int currentcost;
	static int cost;
	static int arr [];
public static void main(String[] args) {
	Scanner sc  = new Scanner (System.in);
	
	int T=sc.nextInt();
	for(int t=1;t<=T;t++) {
		d = sc.nextInt();
		m = sc.nextInt();
		three = sc.nextInt();
		y = sc.nextInt();
		arr = new int[12];
		for(int i=0;i<12;i++) {
			arr[i] = sc.nextInt();
		}
		cost(0,0);
		System.out.println("#"+t+" "+y);
//		System.out.println(Arrays.toString(arr));
	}
	}
public static void cost(int month, int currentcost ) {
	// 기저조건
		if(month>=12 ) {
			y = Math.min(currentcost, y);
			return;	
		}
	
	// 재귀부분
		if(month<=9) {
			cost(month+3, currentcost+three);
		}// 세달짜리
		cost(month+1, currentcost+m);// 한달짜리
		cost(month+1, currentcost+arr[month]*d);// 데일리
}
}
