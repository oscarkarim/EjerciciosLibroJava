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
public class Testfiguras
{
 public static void main(String[] args)
 {
 Circulo c = new Circulo(4);
 Rectangulo r = new Rectangulo(10,5);
 Triangulo t = new Triangulo(3,6);

 System.out.println(c);
 System.out.println(r);
 System.out.println(t);
 }
}