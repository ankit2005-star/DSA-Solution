public class Recursion {

    //check if  the array is sorted or not 

    public static boolean  isSorted(int arr[] , int i){
        if(i == arr.length-1) return true;
        if(arr[i]  > arr[i+1]) return false;

        return isSorted(arr, i +1);

    }
    // find the index of  first occurence of an element

        public static int  firstOcc(int arr[] , int i , int target){
            if(i == arr.length-1 && arr[i] != target ) return -1;

            if(arr[i] == target) return i;

            return firstOcc(arr, i+1,target);

        }


        // Last Occurence 
        public static int lastOcc(int arr[] , int i , int target){ 
                if(i == arr.length ) return -1;

                int isFound = lastOcc(arr, i+1, target);
                if(isFound == -1 && arr[i]== target) return i;

                return isFound;

                

        }

        // power x^n
        public static int pow(int x , int n){
            if(n==0)  return 1;

            return (n%2== 0)?pow(x,n/2) * pow(x,n/2): x* pow(x,n/2) * pow(x,n/2);
        }

        //remove duplicate from string 

        public static void remDuplicate(String str,int idx , StringBuilder newStr , boolean arr[] ){
            if(idx == str.length()){
                  
                return;
            }

            char c = str.charAt(idx);
            if(arr[c -'a']  == true) remDuplicate(str, idx+1, newStr, arr);
            else {
                arr[c - 'a']= true;
                newStr.append(c);
                remDuplicate(str, idx+1, newStr, arr);
            }

                    }

                    public  static  int  friendsPairing( int n){
                if(n==1 || n==2 )return n;

                int single = friendsPairing(n-1);
                int pair = (n-1)*friendsPairing(n-2);

                return single + pair;

            }

            //given number to string like 

            public static void  fun(int n , String arr[] , StringBuilder newStr ){
                if(n == 0 ) return ;

                int last_digit = n%10;
                fun(n/10, arr, newStr.insert(0,arr[last_digit]+" "));

            }

            //calculating  length of a string 

            public static int length(String str ){
                if(str.equals("") ) return 0;

                return 1 + length(str.substring(1));


            }

            public static int contString(String str1 ){
                if(str1.equals("")) return 0;
                  int ans = printComb(str1);
                return ans +  contString(str1.substring(0,str1.length()-1));
              

            }
           
            public static int  printComb(String str){
                if(str.equals("")) return 0 ;
               
                if(str.charAt(0) == str.charAt(str.length()-1))
                return 1 + printComb(str.substring(0,str.length()-1));
               return  printComb(str.substring(0,str.length()-1));
            }
             
    public static void main(String[] args)
    {
           
         System.out.println(contString("abcab"));

    }
}
