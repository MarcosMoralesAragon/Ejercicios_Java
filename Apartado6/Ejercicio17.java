/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio17{ 
  public static void main(String[] args) {
    
    System.out.println("Introduzca la altura del cubo");
    System.out.print("> ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca la anchura del cubo");
    System.out.print("> ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    int distanciaAltura = 0;
    int distanciaAnchura = 0;
  
    do{
      
      distanciaAltura = ((int)(Math.random() * (anchura))+1);
      
    }while((distanciaAltura>=altura) || (distanciaAltura==1));
    
    
    do{
      
      distanciaAnchura = ((int)(Math.random() * (anchura ))+1);
      
    }while((distanciaAnchura>=anchura) || (distanciaAnchura==1));
    

    System.out.println("");
    
    int caracterPorLineaBorde = 0;
    int linea = 0;
    int lineasPorPrintar = altura;
    int espacios=0;
    int posicionAncho = 0;
    distanciaAltura--;
    distanciaAnchura--;
    
    do {
      caracterPorLineaBorde = anchura;
      espacios = anchura - 2;
      posicionAncho = distanciaAnchura ;
      
      
      if (lineasPorPrintar == 1 || lineasPorPrintar == altura){
        
        while(caracterPorLineaBorde>0){
          
          System.out.print("* ");
          caracterPorLineaBorde--;
          
        }
      } else {
        
        System.out.print("* ");
        
        while (espacios>0){
          
          posicionAncho--;
          
          if ((distanciaAltura == 0) && (posicionAncho == 0)) {
        
            System.out.print("& ");
            espacios--;
            
          } else {
          
            System.out.print("  ");
            espacios--;
            
          }
        }
        
        System.out.print("*");
        
      }
      
      System.out.println("");
      lineasPorPrintar--;
      distanciaAltura--;
      
    }while(lineasPorPrintar > 0);
    
  }
}
