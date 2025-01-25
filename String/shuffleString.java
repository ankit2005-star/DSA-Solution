import java.util.Scanner;

public class shuffleString {
     public static String restoreString(String s, int[] indices) {
        String result = new String();
        for(int i =0;i< indices.length;i++){
            result[indices[i]] = s.charAt(i);
        }
     return new String(result);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] indices = new int[s.length()];
        for(int i=0;i<indices.length;i++){
            indices[i] = sc.nextInt();
        }
        System.out.println(restoreString(s,indices));
        sc.close();


    }
    
}
