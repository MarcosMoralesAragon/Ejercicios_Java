/**
 * Programa  que ordena 3 números introducidos por el usuario
 *
 * @author MarcosMoralesAragon
 */
public class Ejercicio13 { 
  public static void main(String[] args) {
   
   System.out.println("Introduzca los 3 numeros que desea ordenar:");
   System.out.print("> ");
   int num1 = Integer.parseInt(System.console().readLine());
   System.out.print("> ");
   int num2 = Integer.parseInt(System.console().readLine());
   System.out.print("> ");
   int num3 = Integer.parseInt(System.console().readLine());
   
   if ((num1 > num2) && (num1 >num3) && (num2>num3)){
     
     System.out.println(num1 + ", "+ num2 +", "+ num3);
     
    } else if ((num1 > num2) && (num1 >num3) && (num3>num2)){
      
      System.out.println(num1 + ", "+ num3 +", "+ num2);
      
    } else if ((num2 > num1) && (num2 >num3) && (num1>num3)){
      
      System.out.println(num2 + ", "+ num1 +", "+ num3);
      
    } else if ((num2 > num1) && (num2 >num3) && (num3>num1)){
      
      System.out.println(num2 + ", "+ num3 +", "+ num1);
      
    } else if ((num3 > num2) && (num3 >num2) && (num1>num2)){
      
      System.out.println(num3 + ", "+ num1 +", "+ num2);
      
    } else if ((num3 > num2) && (num3 >num1) && (num2>num1)){
      
      System.out.println(num3 + ", "+ num2 +", "+ num1);
    }
	}
}
