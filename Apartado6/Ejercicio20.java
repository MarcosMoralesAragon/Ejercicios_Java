/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio20{ 
  public static void main(String[] args) {
    
    System.out.println("Introduzca la altura del cubo");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    
    
    
    int relleno = ((int)(Math.random() * (altura )));
    int vacio = (altura -1) - relleno;
    
    
    
    do {
      
      if (vacio > 0){
        
        System.out.println("*    *");
      }
        
      if ( vacio < 0){
        
       System.out.println("*====*");
       
      }
      
      vacio --;
      altura--;
      
    } while (altura > 0);
    
    System.out.println("******");
    
  }
}
