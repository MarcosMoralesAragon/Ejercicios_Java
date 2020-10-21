/**
 * Calcular la media de Preogramación sabiendo que el primer examen vale 0.4
 * y el segundo 0.6 del total
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio12 { 
  public static void main(String[] args) {
    
  String linea;
      
      System.out.print("Introduzca su primera nota: ");
      linea = System.console().readLine();
      int nota1;
      nota1 = Integer.parseInt(linea);
    
      System.out.print("Introduzca su segunda nota: ");
      linea = System.console().readLine();
      int nota2;
      nota2 = Integer.parseInt(linea);
      
      double notaFinal;
      notaFinal = nota1 * 0.4 + nota2 * 0.6;
      
      System.out.println("SU media final en programacion es: " + notaFinal);
  
  }
}
