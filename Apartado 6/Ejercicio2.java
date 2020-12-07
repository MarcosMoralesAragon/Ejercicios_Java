/**
 * 
 * Este programa genera de manera aleatoria una carta de la baraja española
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio3{ 
  public static void main(String[] args) {
    
    System.out.println("Este programa genera de manera aleatoria una carta de la baraja española");
    System.out.println(" ");
    
    int palo = 0;
    int numero = 0;
    
    for (int i = 1; i <= 1; i++){
      palo = (int)(Math.random()*4 +1 );
      
      System.out.print("Su palo es: ");
      
      switch (palo) {
        
        case 1:
         System.out.println("Bastos");
        break;
        
        case 2:
         System.out.println("Espadas");
        break;
        
        case 3:
         System.out.println("Monedas");
        break;
        
        case 4:
         System.out.println("Copas");
        break;
      }
    }
    
    for (int i = 1; i <= 1; i++){
      numero = (int)(Math.random()*4 +1 );
      
      System.out.print("Su numero es: ");
      
      switch (numero) {
        
        case 1:
         System.out.println("As");
        break;
        
        case 2:
         System.out.println("2");
        break;
        
        case 3:
         System.out.println("3");
        break;
        
        case 4:
         System.out.println("4");
        break;
        
        case 5:
         System.out.println("5");
        break;
        
        case 6:
         System.out.println("6");
        break;
        
        case 7:
         System.out.println("7");
        break;
        
        case 8:
         System.out.println("Sota");
        break;
        
        case 9:
         System.out.println("Caballo");
        break;
        
        case 10:
         System.out.println("Rey");
        break;
      }
    }
  }
}
