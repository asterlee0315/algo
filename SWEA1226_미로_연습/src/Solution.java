import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int str, stc, goalr, goalc, nr, nc;
	static int [][]arr;
	static boolean [][]arr2;
	static boolean answer;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		for(int tc=1;tc<=10;tc++) {
			int T = sc.nextInt();
			answer = false;
			str=0;
			stc=0;
			goalr=0;
			goalc=0;
			// 미로판 받아오기
			arr = new int [16][16];
			for(int r=0;r<16;r++) {
				String a = sc.next();
				for(int c=0;c<16;c++) {
					arr[r][c]=a.charAt(c)-'0' ;
				}
			}
			
			// 순회하면서 시작점, 골인점 찾기
			for(int i=0;i<16;i++) {
				for(int j=0;j<16;j++) {
					if(arr[i][j]==2) {
						str=i;
						stc=j;
					}
					if(arr[i][j]==3) {
						goalr=i;
						goalc=j;
					}
				}
			}
//			System.out.println(stc);
			
			// 시작점에서 dfs 시작
			arr2 = new boolean[16][16];
			dfs(str, stc);
			
			if(answer) {
				System.out.println("#"+tc+" "+1);
			}
			else {
				System.out.println("#"+tc+" "+0);
			}
		}// ende des tc
	}// ende des main
	
	static void dfs(int r, int c) {
		// 기저조건
		if(arr[r][c]==3) {
			answer = true;
			return;
		}
		
		// 재귀부분
		// 완전탐색 하겠다 = 사방 탐색( 으 nr,nc)
		int [] dr = {-1,1,0,0}; // 상하좌우
		int [] dc = {0,0,-1,1}; // 상하좌우
		
		for(int i=0;i<4;i++) {
			nr = r+dr[i];
			nc = c+dc[i];
			;
			// 안가는 경우 constraint // 사방 || visited || 또 하나가뭐였지
			if(nr<0||nr>16||nc<0||nc>16 ||arr2[nr][nc]||arr[nr][nc]==1) {
				continue; // 가지 않습니다.
			}
			arr2[nr][nc]=true;
			dfs(nr, nc);
		}
	}
	
	
}
