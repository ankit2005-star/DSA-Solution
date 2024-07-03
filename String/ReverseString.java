import java.util.Scanner;
public class ReverseString {

    public static String reverseString(String str ){
        int n = str.length();
        String reverseString  = "";
        for(int i = n-1; i >= 0; i--){
            reverseString += str.charAt(i);

        }
        return reverseString;
    
    }
    public static void main(String[] args){

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str =  sr.nextLine();
        String reverseString = reverseString(str);
        System.out.println(reverseString);
        sr.close();

    }
    
}
