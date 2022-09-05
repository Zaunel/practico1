import java.util.*;

public class P2_e3 {

    public static void main(String [] args){
    int number1;
    int number2;
    
    
    
    
    try(Scanner entrada = new Scanner(System.in)){
     System.out.println("Ingresa el primer numero: ");
      number1 = entrada.nextInt();
     System.out.println("Ingresa el segundo numero: ");
      number2 = entrada.nextInt();
     System.out.println("Si el primer numero es mayor que el segundo saldra true, de lo contrario saldra false: " + (number1>number2) + 
     "\n Si los dos numeros ingesados son multiplo de 2 saldra true o false " + "\n primer numero:" + (number1%2==0) + "\n segundo numero:" + (number2%2==0));




    }
     catch(Exception exc){
        System.out.println(exc);
     }


    }
 
    
}
