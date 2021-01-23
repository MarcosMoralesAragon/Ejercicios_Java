/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio5{ 
  public static void main(String[] args) {
    
    int[] numero = new int[10];
    int maximo = 0;
    int minimo = 0;
    int contadorLugarMaximo = 0;
    int contadorLugarMinimo = 0;
    int i = 0;
    
    for ( i = 0; i < 10; i++){
      
      numero[i] = Integer.parseInt(System.console().readLine());
      
      if (i == 0){
        
        minimo = numero[i];
        maximo = numero[i];
        contadorLugarMaximo = i;
        contadorLugarMinimo = i;
        
      } else {
      
        if (numero[i] > maximo){
          
          maximo = numero[i];
          contadorLugarMaximo = i;
          
        } 
        
        if (numero[i] < minimo){
          
          contadorLugarMinimo = i;
          minimo = numero[i];
          
        }
      }
    }
    
    System.out.println("");
    System.out.println("-----------------------------------------------");
    System.out.println("");
    i = 0;
    
    do{
      
      System.out.print(numero[i]);
      
      if (contadorLugarMaximo == 0){
        
        System.out.print(" máximo");
        
      }
      
      if (contadorLugarMinimo == 0) {
        
        System.out.print(" mínimo");
        
      }
      
      System.out.println("");
      contadorLugarMinimo --;
      contadorLugarMaximo --;
      i ++;
      
    } while (i < 10);
    
  }  
}
