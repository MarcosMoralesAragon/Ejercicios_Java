/**
 * Programa que haga operaciones ( sumas, restas, divisiones y multiplicaciones)
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio4 { 
  public static void main(String[] args) {
    
        String linea;
    
      System.out.print("Introduzca el primer numero:");
      linea = System.console().readLine();
      int numero1;
      numero1 = Integer.parseInt(linea);
    
      System.out.print("Introduzca el segundo numero:");
      linea = System.console().readLine();
      int numero2;
      numero2 = Integer.parseInt(linea);
      
      int suma;
      int resta;
      double division;
      double multiplicacion;
      suma = numero1 + numero2;
      resta = numero1 - numero2;
      division = numero1 / numero2;
      multiplicacion = numero1 * numero2;
      
      System.out.println("");
      System.out.println("OPERACIONES");
      System.out.println("");
      System.out.println("Suma: " + suma);
      System.out.println("Resta: " + resta);
      System.out.println("Division: " + division);
      System.out.println("Multiplicacion: " + multiplicacion);
      
      

    
    
  }
}
