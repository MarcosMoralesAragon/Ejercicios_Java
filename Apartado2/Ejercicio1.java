/**
 * Suma, resta división y multiplicación
 *
 * @author MarcosMoralesAragon
 */
public class  Ejercicio1 { 
  public static void main(String[] args) {
    
    int x = 144;
    int y = 999;
    int sum = x + y;
    int mul = x * y;
    double div = (double) y / (double) x;
    int rest = x - y;
    
    System.out.println("La suma de mis variables es " + sum);
    System.out.println("La resta de mis variables " + rest);
    System.out.println("La multiplicación de mis variables es " + mul); 
    System.out.println("La división de mis variables es " +div);
    
  }
}
