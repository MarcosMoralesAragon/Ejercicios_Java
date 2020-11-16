/**
 * Realizar un control de acceso a una caja fuerte con 4 intentos
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio7 { 
  public static void main(String[] args) {
  
   System.out.println("Introduzca el código de la caja fuerte (tienes 4 intentos");
   System.out.print("> ");
   int contraseña = Integer.parseInt(System.console().readLine());
  
   int comprobante = 1234;
   boolean acierto = false;
   int intentos = 0;
   int restantes;
   boolean finalBucle = false
  
    if (contraseña == comprobante) {
    
     System.out.println("Contraseña correcta, bienvenido");
    }else{
      
      do {
        intentos = intentos + 1;
        restantes = 4 - intentos;
        
        System.out.println("Error, contraseña incorrecta (quedan "+ restantes +" intentos)");
        System.out.print("> ");
        contraseña = Integer.parseInt(System.console().readLine());
        
        if (contraseña == comprobante) {
          acierto = true;
          System.out.println("Contraseña correcta, bienvenido");
        }
      } while ((acierto == false) || (intentos < 3));
    }  
  }
}

