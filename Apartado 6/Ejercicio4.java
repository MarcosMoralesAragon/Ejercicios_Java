/**
 * 20 numeros aleatorios entre 0 y 10
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio4{ 
  public static void main(String[] args) {
    
    System.out.println("20 numeros aleatorios entre 0 y 10");
    System.out.println(" ");
    
    
    for (int i = 1; i <= 40; i++){
      System.out.print( (int)(Math.random()*11 ) +" ");
    }
  }
}
