/**
 * Conversor de euros a pesetas
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio2 { 
  public static void main(String[] args) {

    String linea;
    
      System.out.println("Introduzca el numero de euros:");
      linea = System.console().readLine();
      int euros;
      euros = Integer.parseInt(linea);
    
      double total;
      double pesetas = 166.380;
      total = euros * pesetas;
    
      System.out.println("La cantidad de euros introducidos son: " + euros);
      System.out.print("La cantidad de pesetas que tiene son: ");
      System.out.print(total);
      System.out.print(" pesetas");
    
  }
}
