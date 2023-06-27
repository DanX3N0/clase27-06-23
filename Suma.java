public class Suma{
   public static void main(String[] args) {
      
      int resultado = sumatoria(3);
      System.out.println(resultado);
   }

   public static int sumatoria(int n){
      if(n == 1) return 1;
      return n + sumatoria(n - 1);
   } 

}


