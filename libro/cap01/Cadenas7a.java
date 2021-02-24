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
public class Cadenas7a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Juan|Marcos|Carlos|Matias";
        String[] tokens = s.split("[|]");
        for(int i=0; i<tokens.length; i++)
        {
        System.out.println(tokens[i]);
        }
    }
    
}
