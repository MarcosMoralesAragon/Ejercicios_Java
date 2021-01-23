/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio5{ 
  public static void main(String[] args) {
    
    System.out.println("Muestra 50 numeros aleatorios entre 100 y 199");
    System.out.println(" ");
    
    int numeroMayor = 0;
    int numeroMenor = 199;
    int numero = 0;
    int suma = 0;
    
    for (int i = 1; i <= 50; i++){
      numero = ((int)(Math.random()*100) +100);
      System.out.print( numero +" ");
      
      if ( numero > numeroMayor) {
        numeroMayor = numero;
      }
      
      if ( numero < numeroMenor) {
        numeroMenor = numero;
      }
      
      suma = suma + numero;
      
    }
    
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("El numero mas grande es: " + numeroMayor);
    System.out.println("El numero mas pequeño es: " + numeroMenor);
    System.out.println("La media es : " + suma/50);
    
  }
}
