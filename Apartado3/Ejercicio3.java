/**
 * Conversor de pesetas a euros
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio3 { 
  public static void main(String[] args) {
    
        String linea;
    
      System.out.println("Introduzca el numero de pesetas:");
      linea = System.console().readLine();
      int pesetas;
      pesetas = Integer.parseInt(linea);
    
      double total;
      double conversor = 166.380;
      total = pesetas / conversor;
    
      System.out.println("La cantidad de pesetas introducidos son: " + pesetas);
      System.out.print("La cantidad de euros que tiene son: ");
      System.out.print(total);
      System.out.print(" euros");
    
    
  }
}
