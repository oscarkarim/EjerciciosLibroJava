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
public class Triangulo extends FiguraGeometrica
{
 private double base;
 private double altura;
 public Triangulo(int b, int h)
 {
 base = b;
 altura = h;
 }
 public double area()
 {
 return base*altura/2;
 }
}