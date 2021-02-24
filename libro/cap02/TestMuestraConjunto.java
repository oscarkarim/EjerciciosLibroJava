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
public class TestMuestraConjunto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object[] arr = { new Fecha(2,10,1970) , new FechaDetallada("23/12/1948") , new String("Esto es una cadena") , new Integer(34) };
 // como el metodo es estatico lo invoco a traves de la clase MuestraConjunto.mostrar(arr);
    }
    
}
