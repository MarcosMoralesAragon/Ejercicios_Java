/**
 * Calcular el volumen de un cono
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio9 { 
  public static void main(String[] args) {
    
  String linea;
      
      System.out.print("Introduzca el radio del cono: ");
      linea = System.console().readLine();
      int radio;
      radio = Integer.parseInt(linea);
    
      System.out.print("Introduzca la altura de su cono: ");
      linea = System.console().readLine();
      int altura;
      altura = Integer.parseInt(linea);
    
      double area;
      area = (0.33333333333) * radio * radio * altura ;
    
      System.out.print("La area final de su cono es: " + area);
      System.out.print("𝛑");
  
  }
}
