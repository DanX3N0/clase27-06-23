import javax.sound.midi.MidiEvent;

public class BusquedaBinaria {
   public static void main(String[] args) {
   
      int[] lista = {1, 3, 6, 23, 50, 55};

      int result = binarySearch(lista, 0, lista.length - 1, 3);
      System.out.println(result);
   }

   static int binarySearch(int[] lista, int start, int end, int element){
      if(start > end) return -1;
      int middle = (start + end) / 2;
      
      if(lista[middle] == element){
         return middle;
      }
      if(element < lista[middle]){
         return binarySearch(lista, start, middle - 1, element);
      }else{
         return binarySearch(lista, middle + 1, end, element);
      }

   }   




}
