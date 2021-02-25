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
public class Numero
{
 private double valor;
 public Numero sumar(double a)
 {
 valor+=a;
 return this;
 }
 public Numero(double v)
 {
 valor = v;
 }
 @Override
 public String toString()
 {
 return Double.toString(valor);
 }
 public static double sumar(double a, double b)
 {
 return a + b;
 }
 public double getValor()
 {
 return valor;
 }
 public void setValor(double valor)
 {
 this.valor = valor;
 }
}