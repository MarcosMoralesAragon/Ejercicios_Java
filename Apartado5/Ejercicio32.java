/**
 *
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio32{ 
  public static void main(String[] args) {
    
    System.out.println("Porfavor introduzca un numero entero positivo");
    System.out.print("> ");
    int numeroTeclado = Integer.parseInt(System.console().readLine());
    
    int ultimonumero = 0;
    int suma = 0;
    
    System.out.print("Dígitos pares: ");
    
    while (numeroTeclado > 0){
      
      ultimonumero = numeroTeclado % 10;
      numeroTeclado = numeroTeclado / 10;
      
      if (ultimonumero % 2 == 0){
        
        System.out.print(ultimonumero + " ");
        suma = ultimonumero + suma;
        
      }
    }
    
    System.out.println("");
    System.out.print("Suma de digitos pares: " + suma);
    
  }
}
