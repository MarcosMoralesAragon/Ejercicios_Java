/**
 * Que diga que asgintura toca dependiendo el dia de la semana
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio1 { 
  public static void main(String[] args) {
    
    System.out.print("Introduzca el día de la semana (en números): ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String nombreAsignatura;
    
      switch (dia) {
        case 1:
          nombreAsignatura = "ED";
          break;
      
        case 2:
          nombreAsignatura = "PRO";
          break;
      
        case 3:
          nombreAsignatura = "PRO";
          break;
      
        case 4:
          nombreAsignatura = "PRO";
          break;
      
        case 5:
          nombreAsignatura = "FOL";
          break;
          
        default:
         nombreAsignatura = "No existe";
       }
    
    System.out.print("El día " + dia + " de la semana, tienes a primera " + nombreAsignatura);
    
  }
}
