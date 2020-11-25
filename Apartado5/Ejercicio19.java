/**
 *
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio19{ 
  public static void main(String[] args) {
    
   System.out.println("Este programa pinta una piramide (del tamaño que desee) ");
   System.out.println("Porfavor, introduzca la altura de la piramide: ");
   System.out.print("> ");
   int altura = Integer.parseInt(System.console().readLine());
  
   System.out.println(" ");
   System.out.println("Porfavor, introduzca el caracter con el que desea realizar la piramide: ");
   String x = System.console().readLine();
   System.out.println(" ");
  
   int caracterPorLinea = 1;
   int vecesAImprimir = 0;
   int espacios = 0;
    
    do{
      vecesAImprimir = caracterPorLinea;
      espacios = altura;
      
      do{
      
        System.out.print(" ");
        espacios = espacios -1;
      
      }while (espacios > 0);
      
      do{
        
       System.out.print(x);
       vecesAImprimir = vecesAImprimir - 1;
       
      }while (vecesAImprimir > 0);
      
      System.out.println("");
      altura = altura -1;
      caracterPorLinea = caracterPorLinea + 2;
      
    }while(altura > 0);
  }
}
