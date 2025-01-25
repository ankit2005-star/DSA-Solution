public class Bitwise {

                //get ith bit 
                public static boolean  get_ith_bit(int n , int i){
                        int mask = 1<<i;
                        int ans =  (n&mask);

                        
                        return (ans > 0) ? true:false;
                }
                    // set ith bit 
                  public static int  set_ith_bit(int n , int i){
                        int mask = 1<<i;
                        int ans =  (n|mask);

                        
                        return (ans );
                }
                //clear ith bit 

                  public static int   clear_ith_bit(int n , int i){
                        int mask = 1<<i;
                        int ans =  (n&(~mask));

                        
                        return (ans );

                }
                    // update ith bit 
                 public static int   update_ith_bit(int val,int n , int i){
                         int ans =0;
                    if(val == 0)
                    ans = clear_ith_bit(n, i);

                        
                        return (ans );

                }

                //clear last i bits
                 public static int   clear_i_bits(int n , int i){
                        int mask = 1<<i;
                        int ans =  (n&(~mask));

                        
                        return (ans );

                }

                



    
}
