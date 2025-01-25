public class PatternFromMyNotes {
    public static void pattern1(int n){
        char ch = (char)('A' +n-1);
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){

                System.out.print(ch - i +j +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        pattern1(5);
    
    
    }
}
