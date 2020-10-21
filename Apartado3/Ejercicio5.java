/**
 * 
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio5 { 
  public static void main(String[] args) {
    
      String linea;
      
      System.out.print("Introduzca la base de su rectangulo: ");
      linea = System.console().readLine();
      int base;
      base = Integer.parseInt(linea);
    
      System.out.print("Introduzca la altura de su rectangulo: ");
      linea = System.console().readLine();
      int altura;
      altura = Integer.parseInt(linea);
    
      double area;
      area = (base * altura);
    
      System.out.println("La area final de su rectangulo es: " + area);
  
  }
}
