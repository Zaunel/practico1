import java.util.*;

public class P1_e1 {
    
    public static void main(String [] args) {
      
     
      int number1;
      int number2;
      int number3;
      int number4;
      int number5;
     try (Scanner entrada = new Scanner(System.in)) {
      System.out.println("Ingresa el primer numero: ");
      number1 = entrada.nextInt();
      System.out.println("Ingresa el segundo numero: ");
      number2 = entrada.nextInt();
      System.out.println("Ingresa el tercer numero: ");
      number3 = entrada.nextInt();
      System.out.println("Ingresa el cuarto numero: ");
      number4 = entrada.nextInt();
      System.out.println("Ingresa el quinto numero: ");
      number5 = entrada.nextInt();      
      System.out.println("Los numeros ingresados se mostraran de forma descendente: " + number5 + "," + number4 + "," + number3 + "," + number2 + "," + number1);
    }
   catch(Exception exc){
     System.out.println(exc);
   }
   }

}