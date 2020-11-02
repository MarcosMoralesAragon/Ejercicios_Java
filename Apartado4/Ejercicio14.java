/**
 * Programa que detecte si el numero es divisible entre 5 y par/impar
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio14 { 
  public static void main(String[] args) {
   
   System.out.print("Introduzca el numero del que quiere saber si es par o ");
   System.out.println("divisible entre 5 ");
   System.out.print(">");
   int num = Integer.parseInt(System.console().readLine());
   
   System.out.println("");
   
   double resto = (num % 2);
   
   if (resto == 0) {
     System.out.println("Es par");
    } else {
      System.out.println("Es impar");
    }
  
   double resto = (num % 5);
   
   if (resto == 0) {
     System.out.println("Es divisible entre 5");
    } else {
     System.out.println("No es divisible entre 5");
    }
	}
}
