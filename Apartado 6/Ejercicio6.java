/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio6{ 
  public static void main(String[] args) {
    
    System.out.println("Muestra 50 numeros aleatorios entre 100 y 199");
    System.out.println(" ");
    
    int numero = (int)(Math.random()*100);
    boolean acertado = false;
    int numeroIntroducido = 0;
    int intentos = 5;
    
    do {
      System.out.print("Introduzca el numero que cree que es: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido == numero) {
        acertado = true;
      } else {
        System.out.println("Número incorrecto");
        
        if ( numero > numeroIntroducido){
         System.out.println("El numero que has introducido es menor");
        }
        
        if ( numero < numeroIntroducido){
         System.out.println("El numero que has introducido es mayor");
        }
      }
      
      intentos--;
      System.out.println("Quedan " + intentos + " intentos");
      System.out.println(" ");
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Has acertado el numero");
    } else {
      System.out.println("Lo siento, ha agotado las 5 oportunidades.");
      System.out.println("EL numero es : " + numero);
    }
  }
}
