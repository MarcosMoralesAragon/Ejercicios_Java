/**
 * Programa que resuelve ecuacuines de primer grado
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio5 { 
  public static void main(String[] args) {
  
   System.out.println("Este programa resuelve ecuaciones ax + b = 0");
   System.out.println("");
  
   System.out.print("Introduzca la a de su ecuación: ");
   int a = Integer.parseInt(System.console().readLine());
  
   System.out.print("Introduzca la b de su ecuación: ");
   int b = Integer.parseInt(System.console().readLine());
   
    System.out.println("");
  
    if ( a == 0 ) {
      
      System.out.print("No tiene solución, ya que si a es cero");
      System.out.println(", no tenemos incognita a despejar");
      
    } else {
      
      if ( b == 0 ) {
        
        System.out.print("El resultado siempre sera 0");
        
      } else {
      
        int calculo = (-b) / a;
      
        System.out.println("El resultado de la x es: " + calculo);
      }
    }
	}
}
