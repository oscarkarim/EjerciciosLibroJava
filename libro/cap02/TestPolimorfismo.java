/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02;

/**
 *
 * @author Usuario
 */
public class TestPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // a fec (de tipo Fecha) le asigno un objeto FechaDetallada
 Fecha fec = new FechaDetallada("25/02/2009");
 // a obj (de tipo Object) le asigno un objeto FechaDetallada
 Object obj = new FechaDetallada("3/12/2008");
 // Imprimo los dos objetos
 System.out.println("fec = "+fec); // invoca a toString de fec
 System.out.println("obj = "+obj); // invoca a toString de obj
    }
    
}
