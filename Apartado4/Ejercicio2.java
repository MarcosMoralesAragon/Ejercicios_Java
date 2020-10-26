/**
 * Que diga que momento del dia es segun la hora
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio2 { 
  public static void main(String[] args) {
  
    System.out.print("Introduzca la hora del día (sin minutos): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    String momentoDelDia;
    
      if (hora > 24 || hora < 0) {
        System.out.print("Hora no valida");
      
      } else {
        
       if (hora => 6 && hora <= 12){
       
       System.out.println("¡Buenos días!");
       
       }
       if (hora => 13 && hora <= 20){
      
        System.out.println("Buenas Tardes");
       
       }
       if (hora => 21 || hora < 6 ){
      
        System.out.println("Buenas Noches");
        
       }
          
       }
      }
  }

