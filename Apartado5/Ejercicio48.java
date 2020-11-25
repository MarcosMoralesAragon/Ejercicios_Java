/**
 *
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio48{ 
  public static void main(String[] args) {
    
    System.out.println("Introduce el número del que desa realizar la operación");
    System.out.print(">");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    int numerosQueSalen = 0;
    boolean caracter0 = false;
    boolean caracter1 = false;
    boolean caracter2 = false;
    boolean caracter3 = false;
    boolean caracter4 = false;
    boolean caracter5 = false;
    boolean caracter6 = false;
    boolean caracter7 = false;
    boolean caracter8 = false;
    boolean caracter9 = false;
    
    while ( numero > 0){
      
      numerosQueSalen = numero % 10;
      numero = numero / 10;
      
      switch (numerosQueSalen){
        
        case 0:
          caracter0 = true;
        break;
        
        case 1:
          caracter1 = true;
        break;
        
        case 2:
          caracter2 = true;
        break;
        
        case 3:
          caracter3 = true;
        break;
        
        case 4:
          caracter4 = true;
        break;

        case 5:
          caracter5 = true;
        break;

        case 6:
          caracter6 = true;
        break;

        case 7:
          caracter7 = true;
        break;
        
        case 8:
          caracter8 = true;
        break;
        
        case 9:
          caracter9 = true;
        break;
      }
    }
    
    System.out.print("Dígitos que aparecen: ");
    
    if (caracter1){
      System.out.print("1 ");
    }
    
    if (caracter2){
      System.out.print("2 ");
    }
    
    if (caracter3){
      System.out.print("3 ");
    }
    
    if (caracter4){
      System.out.print("4 ");
    }
    
    if (caracter5){
      System.out.print("5 ");
    }
    
    if (caracter6){
      System.out.print("6 ");
    }
    
    if (caracter7){
      System.out.print("7 ");
    }
    
    if (caracter8){
      System.out.print("8 ");
    }
    
    if (caracter9){
      System.out.print("9 ");
    }
    
    System.out.println("");
    
    System.out.print("Dígitos que no aparecen: ");
    
    if (!caracter1){
      System.out.print("1 ");
    }
    
    if (!caracter2){
      System.out.print("2 ");
    }
    
    if (!caracter3){
      System.out.print("3 ");
    }
    
    if (!caracter4){
      System.out.print("4 ");
    }
    
    if (!caracter5){
      System.out.print("5 ");
    }
    
    if (!caracter6){
      System.out.print("6 ");
    }
    
    if (!caracter7){
      System.out.print("7 ");
    }
    
    if (!caracter8){
      System.out.print("8 ");
    }
    
    if (!caracter9){
      System.out.print("9 ");
    }
    
  }
}

