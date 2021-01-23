/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio3{ 
  public static void main(String[] args) {
    
    int[] numero = new int[10];
    int contador = 1;
    int i = 0;
    
    
    for ( i = 0; i < 10; i++){
      
      System.out.print(" Numero nº" + contador+ " --> ");
      numero[i] = Integer.parseInt(System.console().readLine());
      contador ++;
      
    }
    
    System.out.println("\nLos números introducidos, al revés, son los siguientes:");
    for (i = 9; i >= 0; i--) {
      System.out.println(numero[i]);
    }
  }  
}
