import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int T = sc.nextInt();
		for(int t=1; t<=T; t++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int j=0;
			int [] arr  = new int[N*M];
			while(j<N*M-1) {
				for(int r=1;r<=N;r++) {
					for(int c=1;c<=M;c++) {
						arr[j]=r+c;
						j++;
					}
				}
			}
			
			// arr에 나온 값들 중복 제거 하고 리스트에 추가
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<N*M;i++) {
				if(!list.contains(arr[i])) {
					list.add(arr[i]);
				}
			}
			Collections.sort(list);
			
			// 나온 합 값 만큼 arr2 배열만들고, 나온 횟수 카운트해서 값으로 저장
			int [] arr2 = new int [N+M+1];
			for(int x=0;x<arr.length;x++) {
				arr2[arr[x]]++;
			}
			
			// arr2 순회하면서 가장 큰 값의 인덱			
			int ans=0;
			for(int y=0;y<arr2.length;y++) {
				if(arr2[y]>=ans) {
					ans=y;
				}
			}
//			System.out.println(ans);
			// cnt세기
			int cnt=0;
			for(int z=0;z<arr2.length;z++) {
				if(arr2[z]==ans-1) {
					cnt++;
				}
			}
//			System.out.println(cnt);
			// cnt 숫자 만큼 반복하면서 값 출력
			System.out.print("#"+t+" ");
				for(j=0;j<arr2.length;j++) {
					if(arr2[j]==ans-1) {
						System.out.print(j+" ");
					}
			}
				System.out.println();
			
		}
	}
}
