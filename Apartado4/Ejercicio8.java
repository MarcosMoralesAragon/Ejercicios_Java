/**
 * Programa que calcula la media de 3 examenes, ademas, que diga si la nota media
 * es suficiente, insuficiente, bien, notable o sobresaliente
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio8 { 
  public static void main(String[] args) {
   
   System.out.println("Introduzca las 3 notas de las que quiere calcular la media:");
   System.out.print("> ");
   double nota1 = Double.parseDouble(System.console().readLine());
   System.out.print("> ");
   double nota2 = Double.parseDouble(System.console().readLine());
   System.out.print("> ");
   double nota3 = Double.parseDouble(System.console().readLine());
   
   double calculo
   
   if ((nota1 < 0)||(nota2 < 0)||(nota3 < 0)||(nota1 > 10)||(nota2 > 10)||(nota3 > 10)) {
     
     System.out.print("Revise que ninguna de las notas introducidas sea negativas");
     System.out.print(" o mayores de 10");
    
    } else {
      
      calculo = (nota1 + nota2 + nota3) / 3;
      
      System.out.print("La media de las 3 notas introducidas es " + calculo + ".");
      
      switch (calculo) {
        
        case (1) :
        
        System.out.println(" Su nota media es Insuficiente");
        break;
        
        case (2):
        
        System.out.println(" Su nota media es Insuficiente");
        break;
        
        case (3) :
        
        System.out.println(" Su nota media es Insuficiente");
        break;
        
        case (4):
        
        System.out.println(" Su nota media es Insuficiente");
        break;
        
        case (5) :
        
        System.out.println(" Su nota media es Suficiente");
        break;
        
        case (6) :
        
        System.out.println(" Su nota media es Bien");
        break;
        
        case (7) :
        
        System.out.println(" Su nota media es Notable");
        break;
         
        case (8):
         
        System.out.println(" Su nota media es Notable");
        break;
         
        case (9) :
         
        System.out.println(" Su nota media es Sobresaliente");
        break;
         
        case (10) :
         
        System.out.println(" Su nota media es Sobresaliente");
        break;

      }
    }
	}
}
