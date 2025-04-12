import java.util.*;

public class StackA {

    public static void pushAtBottom(Stack<Integer>s,int item ){
            if(s.isEmpty()){
                s.push(item);
                return;
            }

            int top = s.pop();
         
        pushAtBottom(s,item);
        s.push(top);


    }

    public static void main(String[] args) {
        Stack<Integer> s = new  Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        pushAtBottom(s, 4);
        System.out.println(s);
       

    }
    
}
