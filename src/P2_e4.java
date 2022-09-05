import java.util.*;

public class P2_e4 {

    public static void main(String [] args){
      int number1;
        try(Scanner entrada = new Scanner(System.in)){
         System.out.println("Ingresa el primer numero: ");
          number1 = entrada.nextInt();
         System.out.println("El numero ingresado saldra como true o false si es multiplo de 6 y 7" + "\n Multiplo de 6?: " + (number1%6==0) + "\n Multiplo de 7?: "
         + (number1%7==0) + "\n Saldra true o false si el numero ingresado es mayor a 30 y multiplo de 2: " + "\n Mayor a 30?: " + (number1>30) + ("\n Multiplo de 2?: ") + (number1%2==0)
         + ("\n Si es menor o igual a 30 saldra true o false: ") + (number1<=30) + ("\n Si el cociente de dicho numero con 5 es mayor que 10 saldra true or false: ")
         + (number1/5>10));




        }
          catch(Exception exc){
            System.out.println(exc);
          }



    }
    
}
