import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int [][] arr;
	static boolean [][] arr2;
	static int r,c,nr, nc, pocket1, pocket2, min, gap;
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for(int tc=1;tc<=T;tc++) {
		// 영토 받아오기
		r = sc.nextInt();
		c = sc.nextInt();
		arr = new int [r][c];
		arr2 = new boolean [r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		} // 영토 받아옴
		// dfs를 보내보자
		min =Integer.MAX_VALUE;
		dfs(0,0);
		System.out.println("#"+tc+" "+min);
	}
	
	
}// ende des main

static void dfs(int a, int b) {

	
	int [] dr = {-1,1,0,0};// 상하좌우
	int [] dc = {0,0,-1,1};
//	pocket1+=arr[r][c];
	arr2[a][b]=true;
	for(int x=0;x<r;x++) {	
		for(int y=0;y<c;y++) {
			if(arr2[x][y]) pocket1+=arr[x][y];
			else {
				pocket2+=arr[x][y];
			}
		}
	}// pocket 값
	gap=Math.abs(pocket1-pocket2);
	min = Integer.min(min, gap);
}// ende des dfs
	
	for(int i=0;i<4;i++) {
		nr = a+dr[i];
		nc = b+dc[i];
		if(nr<0||nr>=r||nc<0||nc>=c||arr2[nr][nc]) { //
			continue;// 라면 가지 마시고
		
//		} else  {
//			// 갈 수 있다면 // 
//			arr2[nr][nc]=true;
//			gap=0;
//			pocket1=0;
//			pocket2=0;
////		pocket1+=arr[nr][nc];
//			int h=nr;
//			int o=nc;
//			dfs(nr, nc);
//		}
			arr2[nr][nc]=false;// 근데 안 갈 수도 있잖아
//			dfs(h,o);
		}
		
		
	}
	
// ende des 
