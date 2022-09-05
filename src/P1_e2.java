import java.util.*;

public class P1_e2 {
    
    public static void main(String [] args ){
    
    int edad;
    double altura;
    float peso;
    char nombre;

    try 
    (Scanner entrada= new Scanner(System.in)){
    System.out.println("Ingresa tu edad: ");
    edad = entrada.nextInt();
    System.out.println("Ingresa tu altura en cm es: ");
    altura = entrada.nextDouble();
    System.out.println("Ingresa tu peso: ");
    peso = entrada.nextFloat();
    System.out.println("Ingresa la primer letra de tu nombre: ");
    nombre =(char)entrada.next().charAt(0);
    System.out.println("Tu edad es: " + edad + "\nTu altura es: " + altura + "cm" + "\nTu peso en kg es : " + peso + "kg" + "\nLa primer letra de tu nombre es: " + nombre );








    }
    catch(Exception exc) {
     System.out.println(exc);
    }
    

       
    
    


    }
}