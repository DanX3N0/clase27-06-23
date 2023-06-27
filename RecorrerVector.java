public class RecorrerVector {
   public static void main(String[] args) {
      int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      recorrido(lista, 0);
   }

   static void recorrido(int[] lista, int indice){
      System.out.print(lista[indice] + " ");
      if(indice < lista.length - 1){
         recorrido(lista, indice + 1);
      }
   }
}
