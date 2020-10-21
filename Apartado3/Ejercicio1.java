/**
 * Un programa que pide 2 números y que muestre el resultado de una multiplicación
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio1 { 
  public static void main(String[] args) {

    String linea;
    
    System.out.println("Introduzca el primer numero a multiplicar:");
    linea = System.console().readLine();
    int numero1;
    numero1 = Integer.parseInt(linea);
    
    System.out.println("Introduzca el segundo numero a multiplicar");
    linea = System.console().readLine();
    int numero2;
    numero2 = Integer.parseInt( linea );
    
    int total;
    total = numero1 * numero2;
    
    System.out.print("El primer numero es " + numero1);
    System.out.println(" y el segundo es " + numero2);
    System.out.print("El resultado de la multiplicación es ");
    System.out.print(total);
    
    
  }
}
