/**
 * Programa que calcula el tiempo 
 * que tarda un objeto en caer al suelo desde una altura h
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio6 { 
  public static void main(String[] args) {
   
   System.out.println("tiempo que tarda un objeto en caer al suelo desde una altura h");
   
   System.out.println("");
   System.out.println("Introduzca la altura desde la que cae el objeto");
   double h = Integer.parseInt(System.console().readLine());
   
   double g = 9.8;
   
   if ((h == 0) || (h<0) ) {
     System.out.println("No puedes introducir horas negativas o iguales a 0");
    } else {
      double calculo = ((2*h)/g)*((2*h)/g)/2;
      System.out.println("EL tiempo que tarda es: " + calculo + " segundos");
    }
 	}
}
