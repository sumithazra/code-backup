package stdinout;

import java.util.Scanner;

public class DistanceMax {
 public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 
	 int N=sc.nextInt();
	 int L;
	 int M=L=N;
	 int[] speed=new int[N];
	 for(int i=0; i<N; i++)
	 {
		 speed[i]=sc.nextInt();
		 
	 }
	 
	 for (int i = 0; i < speed.length; i++) {
		System.out.println(speed[i]);
	}
	 
	 int[] mileage=new int[speed.length];
	 for (int i = 0; i < speed.length; i++) {
		mileage[i]=sc.nextInt();
	}
	 
	 for (int i = 0; i < mileage.length; i++) {
		System.out.println(mileage[i]);
	}
	 
	 
	 
	 
	 
}
	
	
}
