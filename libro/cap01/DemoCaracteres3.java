/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;

/**
 *
 * @author Usuario
 */
public class DemoCaracteres3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char c;
        for( int i='A'; i<='Z'; i++ )
        {
        // para asignar un int en un char debemos "castear"
        c = (char) i;
        System.out.println(c);
        }
    }
    
}
