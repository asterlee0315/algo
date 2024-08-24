import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
public static void main(String[] args) {
	// 가로, 세로 3x3 all sum is == 
	// check if all three(horizontal, vertical, 3*3 array is 45
		// aber 이렇게 하면 겹치는게 나올 수도 잇음
	//1~9까지의 수가 모두 한번 씩 쓰였는지 check 
	// 리스트에다가 중복안되어있으면 넣어주고 // list 사이즈 체크 9개인지만 해줘도 enough
	
	//스도쿠판 받아오기
	Scanner sc = new Scanner (System.in);
	int T = sc.nextInt();
	for(int t=1;t<=T;t++) {
		int [][] arr = new int [9][9];
		for(int r=0;r<9;r++) {
			for(int c=0;c<9;c++) {
				arr[r][c] = sc.nextInt();
			}
		}
	// 가로 체크 
		boolean hCheck =true;
		for(int h=0;h<9;h++) {
			List<Integer> list = new ArrayList<>();	
			for(int v=0;v<9;v++) {
				if(!list.contains(arr[h][v])){
					list.add(arr[h][v]);
				}
				}
				if(list.size()!=9) {
					hCheck=false;
					break;
			}
		}
		
		boolean vCheck = true;
		for(int v=0;v<9;v++) {
			List<Integer> list2 = new ArrayList<>();
			for(int h=0;h<9;h++) {
				if(!list2.contains(arr[h][v])){
					list2.add(arr[h][v]);
				}
				}
				if(list2.size()!=9) {
					vCheck=false;
					break;
			}
		}
		// 3*3 array check 
		boolean aCheck = true;
		for(int i=0;i<=6;i+=3) {
			for(int j=0;j<=6;j+=3) {
				List<Integer> list3 = new ArrayList<>();
				for(int u=i;u<i+3;u++) {
					for(int e=j;e<j+3;e++) {
						if(!list3.contains(arr[u][e])) {
							list3.add(arr[u][e]);
						}
					}
				}
				// 미니 박스 하나 끝남
				if(list3.size()!=9) {
				aCheck=false;
				break;
			}
			}
			if (!aCheck) break;  // double 이중 포문을 사용했기 때문에 break 두번 해주어야함
		
	}
		if(vCheck == true && hCheck==true && aCheck==true) {
			System.out.println("#"+t+" " +1);
		}
		else {
			System.out.println("#"+t+" " +0);
		}
}
}
}
