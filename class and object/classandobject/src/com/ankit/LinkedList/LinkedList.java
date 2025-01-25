package com.ankit.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    //Node class 
    private class Node {
         private int value  ;
        private Node next = null;

        public Node(int value ){
            this.value = value;
         
        }   
    }
    //first node and last node 
    private Node first ;
    private Node last;
    private int size;

    // function for adding element in begining
    public void addFirst(int item){
            var node = new Node(item);
            if(isEmpty())
               first = last = node;
            else{
                node.next = first;
                first = node;
            
            }
            size++;
    }

    // function for adding data in ending 
    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty())
            first = last = node;
        else{
            last.next = node ;
            last = node;
        }
        size++;
    }

    // function to add element at a specific index  
    public void add(int item ){
        var node = new Node(item);
        if(isEmpty()) first = last = node;
        else{
            last.next = node;
            last = node;
        }
        size++;
    }
    public int indexOf(int item){  int index = 0;  Node current =  null;
             if(first != null ) current = first;
           while(current != null ){
                 if(current.value == item) return index;
                 else{
                    index++;
                    current = current.next;
                 }

             }
             return -1;
    }
    //function to remove first item from list ;
    public  void removeFirst(){
        if(isEmpty()) 
        throw new NoSuchElementException();

        if(first == last){
            first = last = null;
             return;
        } 
        var second = first.next;
        first.next = null ;
        first = second;
        size--;
    }

        public void removeLast(){
               if(isEmpty()) throw new NoSuchElementException();

               if(first == last)  first = last = null;
               else{

                 var previous = getPrevious(last); 
                last = previous;
                last.next = null;   
               }   
                
                
            size--;
        }

        private Node getPrevious(Node node){
            var current = first;
            while(current != null){
                if(current.next == node) return current;
                current = current.next;
            }
            return null;
        }
             
    public void reverse(){
            if(isEmpty())return;
            //[10 <-  20 <-  30 <-  40 <- 50]
            //              p            c         n
           var previous = first;
           var current  = first.next;
           while(current != null){
                var next = current.next;
                current.next = previous;
                previous = current;
                current = next ;
                

           }
           last = first;
           last.next = null;
           first = previous;
          
             
    }
    public void Print(){
        Node current = first;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;

        }
    }
    public int[] toArray(){
         
        int[] array = new int[size];
            int index = 0;
            Node current = first;
            while(current != null ){
                array[index++] = current.value;
                current = current.next;
            }


        return array;
    }

    // retruns the size of the linked list
    public int size(){  return size; }

    // function to check whether give data is present or not 
    public boolean contains(int item){  return (indexOf(item) != -1 );  }

    // function to check whether list is empty or not 
    public boolean isEmpty(){    return (first == null);   }
}
