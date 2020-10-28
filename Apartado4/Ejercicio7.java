/**
 * Programa que calcula la media de 3 examenes
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio7 { 
  public static void main(String[] args) {
   
   System.out.println("Introduzca las 3 notas de las que quiere calcular la media:");
   System.out.print("> ");
   int nota1 = Integer.parseInt(System.console().readLine());
   System.out.print("> ");
   int nota2 = Integer.parseInt(System.console().readLine());
   System.out.print("> ");
   int nota3 = Integer.parseInt(System.console().readLine());
   
   if ((nota1 < 0)||(nota2 < 0)||(nota3 < 0)) {
     
     System.out.print("Revise que ninguna de las notas introducidas sea negativas");
    
    } else {
      
      int calculo = (nota1 + nota2 + nota3) / 3;
      
      System.out.println("La media de las 3 notas introducidas es " + calculo);
    }
	}
}
