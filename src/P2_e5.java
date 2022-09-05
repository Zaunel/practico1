import java.util.*;

public class P2_e5{
   
    
    public static void main(String [] args){
        int number1;
        int number2;
       
      try(Scanner entrada = new Scanner (System.in)){
       System.out.println("Ingrese dos numeros: ");
       number1 = entrada.nextInt();
       number2 = entrada.nextInt();
       System.out.println(("El primer valor ingresado ") + (number1) + (" incrementa a: ") + (++number1) + ("\n El segundo valor ingresado ") + (number2) + (" decrementa a: ") + (--number2));

     



      }
      catch(Exception exc){
        System.out.println(exc);
      }


    }




}