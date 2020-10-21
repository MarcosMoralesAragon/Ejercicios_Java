/**
 * Conversor de Mb a Kb
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio10 { 
  public static void main(String[] args) {
    
    String linea;
      
      System.out.print("Introduce la cantidad de Mb que quiere converitr en Kb: ");
      linea = System.console().readLine();
      double Mb;
      Mb = Integer.parseInt(linea);
      
      double total;
      total = Mb * 1024;
      
      System.out.print("Sus ");
      System.out.print(Mb + " Mb");
      System.out.print(" son " + total + " Kb");
  }
}
