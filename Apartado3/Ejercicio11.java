/**
 * Conversor de Kb a Mb
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio11 { 
  public static void main(String[] args) {
    
    String linea;
      
      System.out.print("Introduce la cantidad de Kb que quiere converitr en Mb: ");
      linea = System.console().readLine();
      double Kb;
      Kb = Integer.parseInt(linea);
      
      double total;
      total = Kb / 1024;
      
      System.out.print("Sus ");
      System.out.print(Kb + " Kb");
      System.out.print(" son " + total + " Mb");
  }
}
