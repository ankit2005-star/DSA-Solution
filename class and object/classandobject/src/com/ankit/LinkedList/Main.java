package com.ankit.LinkedList;

public class Main {

   public static void main(String[] args){
         var list = new LinkedList();
         System.out.println(list.size());
         list.add(10);
         System.out.println(list.size());
        list.add(20);
        list.add(30);
        System.out.println(list.size());
        list.add(40);  
        list.add(50);
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.size());
      
       int[] array = list.toArray();
        
       for(int i =0;i< list.size();  i++ ){
          System.out.print(array[i] + " ");
       }
                
                  

         
      }
         
   
   


    
}
