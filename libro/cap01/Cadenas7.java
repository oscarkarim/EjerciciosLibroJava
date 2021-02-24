/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;
import java.util.StringTokenizer;
/**
 *
 * @author Usuario
 */
public class Cadenas7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "Juan|Marcos|Carlos|Matias";
        StringTokenizer st = new StringTokenizer(s,"|");
        String tok;
        while( st.hasMoreTokens() )
        {
        tok = st.nextToken();
        System.out.println(tok);
        }
    }
    
}
