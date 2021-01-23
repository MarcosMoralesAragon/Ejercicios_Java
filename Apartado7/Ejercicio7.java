/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio7{ 
  public static void main(String[] args) {
    
    int[] numeros = new int[100];
    int rotacion1 = 0;
    int rotacion2 = 0;
    int i = 0;
    
      for ( i = 0; i < 100; i ++){
        numeros[i] = (int)(Math.random()*20);
        System.out.print(numeros[i] + " ");
      }
   
    System.out.println("");
    System.out.println("Que posiciones quiere cambiar de lugar :");
    System.out.print("-> Primero : ");
    int posicion1 = Integer.parseInt(System.console().readLine());
    System.out.println("");
    System.out.print("-> Segundo : ");
    int posicion2 = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    // El usuario no sabe que los arrays empiezan desde 0 ( asi el programa conoce el valor real al que se refiere el usuario)
    posicion1 --;
    posicion2 --;
    
    // Se guardan los resultados de cada una de esas variables
    rotacion1 = numeros[posicion1];
    rotacion2 = numeros[posicion2];
    
    //Se intercambian ambos datos
    numeros[posicion1] = rotacion2;
    numeros[posicion2] = rotacion1;
    
    i = 0;
    
    do {
      
      
      if (posicion1 == 0 || posicion2 == 0){
        System.out.print("'" + numeros[i] + "' ");
      } else {
        System.out.print(numeros[i] + " ");
      }
      
      posicion1 --;
      posicion2 --;
      i ++;
      
    } while (i < 100);
    
  }
}
