/**
 * Realizar un control de acceso a una caja fuerte con 4 intentos
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio7 { 
  public static void main(String[] args) {
   
   System.out.println("Introduce los 4 digitos del código de la caja fuerte");
   System.out.print("> ");
   int contra = Integer.parseInt(System.console().readLine());
   
   System.out.println("");
   
   int comprobante = 1234;
   int intentos = 0;
   int acierto = 0;
    
    if (comprobante == contra) {
      System.out.println("Contraseña correcta, bienvenido señor");
    } else {
        do {
          
          intentos = intentos +1;
          int restantes = 3-intentos;
          
          System.out.println("Error");
          System.out.print("Introduce los 4 digitos del código");
          System.out.println(" (quedan " + restantes + " intentos restantes)");
          System.out.print("> ");
          contra = Integer.parseInt(System.console().readLine());
          System.out.println("");
        
            if (contra == comprobante) {
            acierto = 1;
             } 
        }while (acierto < 0);
        System.out.println("Contraseña correcta, bienvenido señor");
      }
    }
	}

