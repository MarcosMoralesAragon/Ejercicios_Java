/**
 * Salario semanal de un empresario a partir de las horas semanalas trabajadas
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio8 { 
  public static void main(String[] args) {
    
  String linea;
      
      System.out.print("Introduzca las horas semanales trabajadas: ");
      linea = System.console().readLine();
      int horas;
      horas = Integer.parseInt(linea);
    
      double total;
      total = horas * 12;
    
      System.out.print("Los euros a cobrar son: " + total);
      System.out.print(" euros");
  
  }
}
