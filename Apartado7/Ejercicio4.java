/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio4{ 
  public static void main(String[] args) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    int i = 0;
    
    for ( i = 0; i < 20; i++){
      numero[i] = (int)(Math.random()*100);
    }
    
    for ( int j : numero) {
      System.out.print(j + "  |  ");
    }
    
    i = 0 ;
    System.out.println("");
    
    
    for ( int icuadrado = 0; icuadrado < 20; icuadrado++){
      cuadrado[icuadrado] = numero[i] * numero[i];
      i ++;
    }
    
    for ( int j : cuadrado) {
      System.out.print(j + " | ");
    }
    
    i = 0 ;
    System.out.println("");
    
    for ( int icubo = 0; icubo < 20; icubo++){
      cubo[icubo] = numero[i] * numero[i] * numero[i];
      i ++;
    }
    
    for ( int j : cubo) {
      System.out.print(j + "|");
    }
  }
}
