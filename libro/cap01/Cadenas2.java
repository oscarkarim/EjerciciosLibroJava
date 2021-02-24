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
public class Cadenas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String s = "Esto Es Una Cadena de caracteres";
        int pos1 = s.indexOf('C'); int pos2 = s.lastIndexOf('C'); int pos3 = s.indexOf('x');
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);    
    }
    
}
