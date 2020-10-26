/**
 * Que diga que asgintura toca dependiendo el dia de la semana
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio3 { 
  public static void main(String[] args) {
    
    System.out.print("Introduzca el día de la semana (en números): ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String nombreSemana;
    
      switch (dia) {
        case 1:
          nombreSemana = "Lunes";
          break;
      
        case 2:
          nombreSemana = "Martes";
          break;
      
        case 3:
          nombreSemana = "Miercoles";
          break;
      
        case 4:
          nombreSemana = "Jueves";
          break;
      
        case 5:
          nombreSemana = "Viernes";
          break;
          
        case 6:
         nombreSemana = "Sabado";
         break;
        
        case 7:
         nombreSemana = "Domingo";
         break;
          
        default:
         nombreSemana = "No existe";
       }
    
    System.out.print("El número " + dia + " corresponde al dia de la semana, " + nombreSemana);
    
  }
}
