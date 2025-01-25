public class  ListNode{

    class Node{

        int data ;
        Node next ;


        Node(int data){
            this.data = data;
           this.next = null;
        }
        Node(int data , Node next ){
            this.data = data;
            this.next = next;
        }
    }
            public Node reverseLinkedList(Node head) {
       
                      if (head == null || head.next == null) {

                      return head;
                        }
                       Node newHead = reverseLinkedList(head.next);
                        Node front = head.next; 
                        front.next = head;
                          head.next = null;
                        return newHead;
          }
} 
-0987612