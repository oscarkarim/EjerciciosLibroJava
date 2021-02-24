/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class TestFecha3 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner scanner=new Scanner(System.in);
         // el usuario ingresa los los datos de la fecha
         System.out.println("Ingrese Fecha1 (dia, mes y anio): "); int dia = scanner.nextInt(); int mes = scanner.nextInt(); int anio = scanner.nextInt();
         // creo un objeto de la clase Fecha
         // el usuario ingresa los los datos de la fecha
         System.out.print("Ingrese Fecha2 (dia, mes y anio): ");
         dia = scanner.nextInt();
         mes = scanner.nextInt();
         anio = scanner.nextInt();

         // creo un objeto de la clase Fecha
         System.out.println("Fecha 1 = ");
         System.out.println("Fecha 2 = ");
         if( true )
         {
         System.out.println("Son iguales !");
         }
         else
         {
         System.out.println("Son distintas...");
         }
    }
    
}
