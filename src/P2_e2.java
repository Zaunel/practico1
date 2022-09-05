import java.util.*;

public class P2_e2 {


    public static void main(String [] args){
    int number1;
      
   
   
    try(Scanner entrada = new Scanner(System.in)){
        System.out.println("Ingresa un numero: ");
        number1 = entrada.nextInt();
        System.out.println("El cociente del numero ingresado por el divisor 2 el resutado es: " + number1/2 + "\n El cociente del numero ingresado por el divisor 3 el resultado es: "
        + number1/3 + "\n El cociente del numero ingresado por el divisor 4 el resultado es: " + number1/4);
        
    }
         catch(Exception exc){
            System.out.println(exc);
         }
             
    

        }
}