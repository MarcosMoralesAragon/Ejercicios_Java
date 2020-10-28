/**
 * Programa que calcula cuantas horas y minutos faltan para llegar a medianoche
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio11 { 
  public static void main(String[] args) {
   
   System.out.print("Introduzca que hora es: ");
   int hora = Integer.parseInt(System.console().readLine());
   
   System.out.print("Introduzca los minutos: ");
   int minutos = Integer.parseInt(System.console().readLine());
   
   if ((hora<0) || (hora>23) || (minutos<0) || (minutos>59)) {
     
     System.out.print("Hora invalida, horas o minutos mal introducidos");
     
    } else {
      
      int calculoHora = 24 - hora;
      int calculoMinuto = 60 - minutos;
      
      System.out.print("Faltan "+ calculoHora +" horas y "+ calculoMinuto +" minutos");
    }
	}
}
