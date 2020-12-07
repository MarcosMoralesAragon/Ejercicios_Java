/**
 * Generar la tirada de 3 dados aleatorios y sumar la puntuacion final
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio1{ 
  public static void main(String[] args) {
    
    System.out.println("Este programa genera de manera aleatoria 3 tiradas de dados");
    System.out.println(" ");
    
    int numero = 0;
    int suma = 0;
    
    for (int i = 1; i <= 3; i++){
      numero = (int)(Math.random()*10);
      System.out.print( numero +" ");
      suma = suma + numero;
    }
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Su suma es: " + suma);
  }
}
