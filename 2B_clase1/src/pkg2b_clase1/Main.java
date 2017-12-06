/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2b_clase1;

import java.util.Scanner;

/**
 *
 * @author daulloa2
 */
public class Main {


    
    
   public static int cociente( int numerador, int denominador )
      throws ArithmeticException
   {
      return numerador / denominador; // posible divisi�n entre cero
   } 
    
   public static void main( String[] args )
   {
      Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada
      boolean bandera = true; // determina si se necesitan m�s datos de entrada
      int numerador,denominador,n,indice;
      
      
      do
      {
         try // lee dos n�meros y calcula el cociente
         {
            System.out.print( "Introduzca un numerador entero: " );
            numerador = explorador.nextInt();
            System.out.print( "Introduzca un denominador entero: " );
            denominador = explorador.nextInt();
            int resultado = cociente( numerador, denominador );
            System.out.printf( "\nResultado: %d / %d = %d\n", numerador,
               denominador, resultado );
            
            bandera = false;

            
                } catch (ArithmeticException e) {
                    System.err.println("Numeros no pueden ser divisibles para 0");
                    
                }
                
            } while (bandera);
            
        
    }
    
}
