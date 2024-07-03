 import java.util.Scanner;
 public class Solution{
	public static void main(String[] args) {





 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int a0 = s.nextInt();
		 int a1 = s.nextInt();
		 int cd = a1 - a0;

		 boolean ans = true;
		 if(n==2) System.out.print(ans);
		 else{
		  for(int i =1;i<n;i++){
			  int d = a1-a0;
			  if(d != cd)ans = false;
			  
			  a0 = a1;
			  a1 = s.nextInt();

			  
		  }

		 }
		if(n!=2) System.out.print(ans);
		s.close();
 
 }
 

 }


