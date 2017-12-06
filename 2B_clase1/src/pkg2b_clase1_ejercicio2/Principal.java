/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2b_clase1_ejercicio2;

import java.util.Scanner;

/**
 *
 * @author daulloa2
 */
public class Principal {
    public static void main(String[] args) {
        
        int contador=0;
        String nombre,apellido;
        Scanner teclado= new Scanner(System.in).useDelimiter("\n");
        Estudiante estudiantes[]= new Estudiante[4];
        
        double notasMate[]= new double[4];
        double notasSociales[]= new double[4];
        
        while(contador<4){
            try {
                System.out.println("posicion: "+contador);
                System.out.print("Ingrese nombre: ");
                nombre= teclado.next();
                System.out.print("Ingrese apellido: ");
                apellido= teclado.next();
                System.out.print("Ingrese nota Matematica: ");
                notasMate[contador]= Double.parseDouble(teclado.next());
                System.out.print("Ingrese nota Sociales: ");
                notasSociales[contador]= Double.parseDouble(teclado.next());
                
                estudiantes[contador]= new Estudiante(nombre,apellido);
                contador++;
                
                
            } catch (NumberFormatException numberFormatException) {
                System.err.println("No se puede poner letras en notas!");
            }catch (Exception e){
                
            }
        }
        Asignacion a= new Asignacion(estudiantes,notasMate,notasSociales);
        
        System.out.println(a);
    }
}
