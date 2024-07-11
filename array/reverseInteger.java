/*
 * 7. Reverse Integer
Medium
Topics
Companies
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-2^31 <= x <= 2^j31 - 1

 */

 import java.util.Scanner;


public class reverseInteger {
            
    public static int reverse_Integer(int x){
        long rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x = x/10;
            if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) return 0 ;
        }
        return (int)(rev);


    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println(reverse_Integer(n));
        sc.close();
    }
    
}
