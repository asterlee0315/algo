package 참외밭;

	import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int orange = sc.nextInt();
		int [][] a = new int [2][6];
		for(int i = 0 ; i<6; i++) {
			a[0][i] = sc.nextInt();
			a[1][i] = sc.nextInt();
		}
		
		// 전체 사각형 넓이 구하기
		int [] rectangle = new int[6];
		for (int i=0; i<6; i++) {
			rectangle [i] = a[1][i];
		}
		
		// 찾을 배열
		int[] b = {1,1,2,2,2,2};
		
		// 치환 배열
		int[] c = new int[6];
		boolean isSame = false;
		for(int i=0; i<6;i++) {
			for(int j=0;j<6;j++) {
				if(i!=j && a[0][i]==a[0][j]) isSame=true;
			}
			if(isSame == true) c[i]=2;
			else c[i]=1;
			isSame=false;
		}
		
		int cc[] = new int [12];
		System.arraycopy(c, 0, cc, 0, 6);
		System.arraycopy(c, 0, cc, 6, 6);
		
		System.out.println(Arrays.toString(c));
		
	
		int idx = 0;
		// b랑 cc 포크레인
		for(int i=0;i<6;i++) {
			int f [] = Arrays.copyOfRange(cc, i, i+6);
			if (Arrays.equals(b, f) == true) {
				idx=i;break;
			}
		}
		
		
		// 미니 사각형 넓이 계산
		int mini[] = Arrays.copyOf(rectangle, 12);
		System.arraycopy(rectangle, 0, mini, 6, 6);
		int miniRectangle = mini[idx+3]* mini[idx+4];
		
		int max = 0;
		int sum = 0;
		for(int t=0;t<6;t++) {
			if (rectangle[t]>max) 
				max = rectangle[t];
			sum += rectangle[t];
		}
		int large = max *((sum - max*2)/2);
		
		// 참외 갯수 구하기
		int total = (large - miniRectangle) * orange;



//	System.out.println(Arrays.deepToString(a));
//	System.out.println(Arrays.toString(mini));		
//	System.out.println(Arrays.toString(b));		
//	System.out.println(Arrays.toString(c));		
//	System.out.println(Arrays.toString(cc));		
//	System.out.println(idx);		
//	System.out.println(miniRectangle);
	System.out.println(total);

    
	}

}
