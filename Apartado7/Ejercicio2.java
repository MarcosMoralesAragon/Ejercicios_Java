/**
 * 
 * 
 * 
 * @author MarcosMoralesAragon
 */
public class Ejercicio2{ 
  public static void main(String[] args) {
    
    char[] simbolo = new char[10];
    
    simbolo[0] ='a';
    simbolo[1] ='x';
    simbolo[4] ='@';
    simbolo[6] =' ';
    simbolo[7] ='x';
    simbolo[8] ='Q';
    
    int contador = 0;
    
    for(char lista : simbolo){
      
      System.out.println("simbolo[" + contador + "] = " + lista);
      contador ++;
    }
    
  }  
}
