import java.util.*;
public class StockSpan{
  public static void stockSpan(int[] stocks , int[] span){

     Stack<Integer>s = new Stack<>();
     span[0] = 1;   s.push(0);
     for( int i = 1 ; i < span.length ; i++){
       while(stocks[s.peek()] < stocks[i]) s.pop();
       span[i] = i - s.peek();
       s.push(i);
     }

  }
  
  public static void main(String[] args){
     int[] stocks = { 100 , 80 , 60 , 70 , 60 , 85 , 100};
     int[] span = new int[stocks.length];
     stockSpan(stocks,span);
     for(int item : span){System.out.print(item + " " );}
  }
}