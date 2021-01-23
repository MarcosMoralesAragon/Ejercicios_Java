/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio10{ 
  public static void main(String[] args) {
    
    System.out.println("Crea 10 lineas con caracteres de longitud aleatoria entre 1 y 40");
    System.out.println(" ");
    
    int numero = 0;
    int lineas = 10;
    int caracterPorLinea = 0;
    
    do {
      
      caracterPorLinea = (int)(Math.random()*40);
      
      while (caracterPorLinea>0){
        
        numero = (int)(Math.random()*6);
        
        switch (numero) {
          
          case 1:
            System.out.print("* ");
          break;
          
          case 2:
            System.out.print("- ");
          break;
          
          case 3:
            System.out.print("= ");
          break;
          
          case 4:
            System.out.print(". ");
          break;
          
          case 5:
            System.out.print("| ");
          break;
          
          case 6:
            System.out.print("@ ");
          break;
          
        }
        caracterPorLinea --;
      }
      System.out.println("");
      lineas --;
      
    } while(lineas > 0);
  }
}
