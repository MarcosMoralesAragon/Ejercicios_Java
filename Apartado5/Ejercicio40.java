/**
 *
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio40{ 
  public static void main(String[] args) {
    
    System.out.println("Introduzca la altura del rombo ( no se admiten numeros impares o menores que 3");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
  
    int caracterPorLinea = 1;
    int vecesAImprimir = 0;
    int espacios = 0;
    int espaciosIntermedios = (altura-1)/2;
    int espaciosEnMedio=0;
    
    do{
      vecesAImprimir = caracterPorLinea;
      espacios = altura;
      espaciosEnMedio = espaciosIntermedios;
      
      do{
      
        System.out.print(" ");
        espacios = espacios -1;
      
      }while (espacios > 0);
      
      do{
        
       System.out.print("*");
       
       while (espaciosEnMedio > 0){
          System.out.print(" ");
          espaciosEnMedio --;
        }
        vecesAImprimir --;
      }while (vecesAImprimir > 0);
      
      System.out.println("");
      altura = altura -1;
      caracterPorLinea = 2;
      
    }while(altura > 0);
    
  }
}
