import java.util.Scanner;
public class checkPermutation {
    public static boolean check_Permutation(String str1,String str2){
        if(str1.length()!=str2.length()) System.out.println(false);
        String ans = "";
        for(int i =0;i<str1.length();i++){
            for(int j = 0 ; j< str2.length() ; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    ans += str1.charAt(i);
                   
                }
            }
        }
        if(ans.equals(str1)) return true ;

        else return false ;



    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 ,str2;
        System.out.println("Enter the first string");
        str1 = scanner.nextLine();
        System.out.println("Enter the second string");
        str2 = scanner.nextLine();
        System.out.println(check_Permutation(str1,str2));
    }
}
