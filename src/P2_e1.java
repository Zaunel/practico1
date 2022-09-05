import java.util.*;

public class P2_e1 {
    
   public static void main(String [] args) {
   double number1;
   double number2;
   double number3;
   double resultado;
   
  
   
   
   
   try (Scanner entrada = new Scanner(System.in)){
     System.out.println("Ingrese el primer numero: ");
     number1 = entrada.nextDouble();
     System.out.println("Ingrese el segundo numero: ");
     number2 = entrada.nextDouble();
     System.out.println("Ingresa el tercer numero: ");
     number3 = entrada.nextDouble();
     resultado =number1/number2;
     System.out.println("Los primeros dos numeros se dividen y el resultado seria: " + resultado + " y restandole el tercer numero ingresado el resultado quedaria " + (resultado-number3));
     










   }
   catch (Exception exc){
    System.out.println(exc);
      }
   


   }

}
