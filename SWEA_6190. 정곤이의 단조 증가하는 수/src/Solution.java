import java.util.Scanner;

public class Solution {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int T = sc.nextInt();
	for(int t=1;t<=T;t++) {
		int N = sc.nextInt();
		int [] arr = new int [N];
		for(int n=0;n<N;n++) {
			arr[n]=sc.nextInt();
		}
		boolean istrue = false;
		int ans=0;
			for(int r=0;r<arr.length-1;r++) {
				for(int c=1;c<arr.length-r;c++) {
					int b= arr[r]*arr[r+c];
					String a = String.valueOf(b);
					String [] arr2 = a.split("");
					if(arr2.length==1) {
						continue;
					}
					else{
						int [] arr3 = new int[arr2.length];
						for(int z=0;z<arr2.length;z++) {
							arr3[z]=Integer.parseInt(arr2[z]);
							}
						for(int j=0;j<arr2.length-1;j++) {
							if(arr3[j]<=arr3[j+1]) {
							istrue = true;
							ans=b;
							}
						else { break;}
					}
		
		}
			}
				}
					if(istrue = false) {
						System.out.println("#"+t+" "+"-1");
					}
					else {
						System.out.println("#"+t+" "+ ans);
					}
	}
	}
	
}
