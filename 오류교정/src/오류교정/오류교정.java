package 오류교정;

import java.util.Arrays;
import java.util.Scanner;

public class 오류교정 {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		int [][] a = new int [n][n];
		for(int i = 0; i<n ; i++) {
			for(int d=0; d<n;d++)
				a[i][d] = sc.nextInt();
		}
//		System.out.println(Arrays.deepToString(a));
	
	// 각 행 의 1개수 세기
		int [] row = new int [n];
		int [] col = new int [n];
		
		for(int i=0; i<n;i++) {
			int cnt =0;
			for(int e : a[i]){
				if(e == 1){
					cnt++;
					}
				}
			row [i] = cnt%2;
		}
		// 각 열의 1개수 세기
		for(int i=0; i<n;i++) {
			int cnt =0;
			for(int j=0; j<n;j++){
				if(a[j][i]==1){
					cnt++;
				}
			}
			col [i] = cnt%2;
		}
//		System.out.println(Arrays.toString(row));
//		System.out.println(Arrays.toString(col));
//	
		// 
		boolean rowCheck = Arrays.stream(row).allMatch(p->p == 0);
		boolean colCheck = Arrays.stream(col).allMatch(p->p == 0);
		
		if (rowCheck && colCheck) {
			System.out.println("OK");
		} else {
			// 1의 갯수가 홀수인 행 구하기
			int row1=0;
			int rowCount=0;
			int col1=0;
			int colCount=0;
			
			for(int i=0; i<n; i++) {
				if (row[i]!=0) {
					row1 = i+1;
					rowCount++;
				}
			}
			
			for(int i=0; i<n; i++) {
				if (col[i]!=0) {
					col1 = i+1;
					colCount++;
				}
			}
			
			if(rowCount == 1 && colCount==1) {
				System.out.println("Change_bit_"+"("+row1+","+col1+")");
			}
			else {
				System.out.println("Corrupt");
			}
			
			// 1의 갯수가 홀수인 열 구하기
		}
		
		// if 홀수열 홀수 행 ==1 이면 바꾸기
		// else sysout Corrupt
		
			}	
	}

		         
		        	
		        	 
		        
			
			
		         
		
	
	

	//	
		
		
		
		
		
		
		
		
		
//		
//	// sum 배열에는 a 배열의 속배열의 1의 갯수를 2로 나눈 값이 들어있음/ 
//		// 이제 얘를 계산
//		for(int i = 0 ; i < sum.length; i++) {
//			if (sum[i] ==0) {
//				System.out.println("okay");
//			}
//			else {
//			// 나머지가 
//				System.out.println(sum[i]+"oops");
//			}
//			} 
//		} 
//	}

		
		

	

	

