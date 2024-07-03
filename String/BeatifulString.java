public class BeatifulString {
     public static int makeBeautiful(String str) {
        
        String ans = "";
        if(str.charAt(0)=='0'){
            for(int i =0;i<str.length(); i++){
                if(i%2==0) ans +='0';
                else ans+='1';
            }
         }
        else{
            for(int i =0;i<str.length(); i++){
                if(i%2==0) ans +='1';
                else ans+='0';
            }
         }
         int operation =0;
         for(int j=0;j<ans.length();j++){
             if(str.charAt(j) != ans.charAt(j)) operation++ ;
         }
         
         return operation;
    }
    public static void main(String[] arg){
        System.out.println(makeBeautiful("01010010101"));
    }
    
}
