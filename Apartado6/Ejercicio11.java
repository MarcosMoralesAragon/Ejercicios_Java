/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio11{ 
  public static void main(String[] args) {
    
    
    int numero = 0;
    int notas = 20;
    int insuficiente = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    do {
      
      numero = (int)(Math.random()*10);
      
      switch (numero) {
        
        case 1:
          System.out.println("Insuficiente");
          insuficiente ++;
        break;
        
        case 2:
          System.out.println("Insuficiente");
          insuficiente ++;
        break;
        
        case 3:
          System.out.println("Insuficiente");
          insuficiente ++;
        break;
        
        case 4:
          System.out.println("Insuficiente");
          insuficiente ++;
        break;
        
        case 5:
          System.out.println("Suficiente");
          suficiente ++;
        break;
        
        case 6:
          System.out.println("Bien");
          bien ++;
        break;
        
        case 7:
          System.out.println("Notable");
          notable ++;
        break;
        
        case 8:
          System.out.println("Notable");
          notable ++;
        break;
        
        case 9:
          System.out.println("Sobresaliente");
          sobresaliente ++;
        break;
        
        case 10:
          System.out.println("Sobresalietne");
          sobresaliente ++;
        break;
        
      }
      
      notas --;
      
    } while(notas != 0);
    
    System.out.println(" ");
    System.out.println("RECUENTO FINAL");
    System.out.println("Insuficientes = " + insuficiente);
    System.out.println("Suficientes = " + suficiente);
    System.out.println("Bien = " + bien);
    System.out.println("Notable = " + notable);
    System.out.println("Sobresaliente = " + sobresaliente);
  }
}
