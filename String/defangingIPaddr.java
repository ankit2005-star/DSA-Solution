import java.util.Scanner;

public class defangingIPaddr {

             public  static String defangIPaddr(String address) {
                    String ans = "";
                    if(address.length() ==0) return ans;
                  
 
                    for(int i = 0; i < address.length(); i++) {
                        if(address.charAt(i) == '.')ans += "[.]";
                        else  ans+= address.charAt(i);
                        


                      }
   
                        return ans;
            }
   

   
   
   
   
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.print(defangIPaddr(str));
         
         
         
         

    }
    
}
