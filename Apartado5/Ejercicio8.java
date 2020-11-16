/**
 * Muestra la tabla de multiplicar
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio8{ 
  public static void main(String[] args) {
    
    System.out.println("Introduce el numero del que quieres sacar la tabla de multiplicar");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int multiplicador = 0;
    int calculo = 0;
    
    //Bucle que muestra la tabla de multiplicar del número introducido
    
    do {
      calculo = multiplicador * numero;
      System.out.println(multiplicador + " x " + numero + " = " + calculo);
      multiplicador = multiplicador + 1;
    } while (multiplicador < 11);
  }
}
