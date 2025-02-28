
public class Backtracking{

    public static void chngArray(int [] arr, int idx){
        if(idx >= arr.length) return ; 

        arr[idx] = idx+1;
        chngArray(arr, idx+1);
        arr[idx ] -=2;
    }

    //function to print subsets of an string 
            public static void      findSubset(String str , int idx , String ans ){
                    if(idx == str.length()){
                        System.out.print(ans + " ");
                        return ;
                    }

                //choic 
                //yes 
                    findSubset(str, idx+1, ans+ str.charAt(idx));
                //No 
                findSubset(str, idx+1, ans  );

            }

            //permutaion of string 

                 public static void permutation(String str , String ans){
                    if(str.equals("")){
                        System.out.println(ans  + " ");
                    }

                    //recursion 
                    for(int i =0;i<str.length();i++){
                        char c = str.charAt(i);
                        String str2 = str.substring(0 , i) + str.substring(i+1);
                        permutation(str2, ans+c);

                    }
                 }


    public static void main(String[] args ){
        String str = "abc";
        permutation(str, "");

    }
}