import java.util.*;
public class NextGreater{

  public static void nextGreater(int[] arr , int[] nextG ) {
     Stack<Integer> s = new Stack<>();
     for(int i = nextG.length-1 ; i >= 0 ; i--){
       while(!s.isEmpty() && arr[i]>= arr[s.peek()]){
	  s.pop();
       }
	if(s.isEmpty()){ nextG[i] = -1 ; }
  else { nextG[i] = arr[s.peek()] ; }
  s.push(i);
     }
     
 
  }


  public static void main(String[] args){
    int[] arr = { 1 , 2 , 8 , 7 , 3 , 4};
    int nextG[] = new int[arr.length];
    nextGreater(arr, nextG);
    for(int num : nextG)System.out.print(num + " " );
  }
}