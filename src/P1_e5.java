import java.util.*;

public class P1_e5 {
    

    public static void main(String [] args ){ 
        char type;
        String nombre;
        String producto1;
        float importe1;
        String producto2;
        float importe2;
        float importetotal;


         try (Scanner entrada = new Scanner(System.in)){

         System.out.println("Elige el tipo de factura con el que vas a pagar: A, B o C ");
         type =(char)entrada.next().charAt(0);
         
         System.out.println("Ingresa tu nombre completo: ");
         nombre = entrada.next();
         
         System.out.println("Ingresa el nombre del producto que quieres llevar: ");
         producto1 = entrada.next();
        
         System.out.println("Ingresa el valor del producto 1: ");
         importe1 = entrada.nextFloat();
         
         System.out.println("Ingresa otro producto que quieras llevar: ");
         producto2 = entrada.next();
        
         System.out.println("Ingresa el valor del producto 2: ");
         importe2 = entrada.nextFloat();

         importetotal = importe1+importe2;

         System.out.println("Factura" + "\t" + "\t" + type + "\t" + "N250" + "\nNombre: " + nombre + "\nProducto" + "\t" + "\t" + "Importe" + "\n" + producto1 + "\t" + "\t"
         + "\t" + importe1 + "\n" + producto2 + "\t" + "\t" + importe2 + "\nImporte total" + "\t" + "\t" + importetotal );




        
   




        }
     catch(Exception exc){
        System.out.println(exc);
     }




    }
}
