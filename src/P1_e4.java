import java.util.Scanner;

public class P1_e4 {
    
  public static void main(String [] args) {
    String nombre;
    int edad;
    double altura;
    String ocupacion;

    try (Scanner entrada = new Scanner(System.in)) {
    System.out.println("Ingresa tu nombre: ");
    nombre = entrada.nextLine();
    System.out.println("Ingresa tu edad: ");
    edad = entrada.nextInt();
    System.out.println("Ingresa tu altura en cm: ");
    altura = entrada.nextDouble();
    System.out.println("Ingresa tu ocupacion: ");
    ocupacion = entrada.next();
    System.out.println("Tu nombre es: " + nombre + "\nTu edad es: " + edad + " años" + "\nTu altura es de: " + altura + "cm" + "\nTu ocupacion es: " + ocupacion);




    }
  catch(Exception exc) {
    System.out.println(exc);

   }

  }




}
