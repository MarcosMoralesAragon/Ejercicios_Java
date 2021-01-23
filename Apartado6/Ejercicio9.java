/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio9{ 
  public static void main(String[] args) {
    
    System.out.println("Muestra numeros pares hasta que saque el numero 24 (solo saca pares)");
    System.out.println(" ");
    
    int numero = 0;
    
    do {
      
      numero = (int)(Math.random()*50);
      
      numero = numero * 2;
      
      System.out.print(numero +" ");
     
    } while(numero != 24);
    
  }
}
