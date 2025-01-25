public class xorTillN {
  
  

   public static void xor(int n) {
      if (n % 4 == 0) {
         System.out.println(n);
      } else if (n % 4 == 1) {
         System.out.println(1);
      } else if (n % 4 == 2) {
         System.out.println(n + 1);
      } else {
         System.out.println(0);
      }

   }

   public static void main(String[] args) {
      int var1 = 10;
      xor(var1);
   }
}
