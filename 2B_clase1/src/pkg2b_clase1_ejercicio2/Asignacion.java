/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2b_clase1_ejercicio2;

/**
 *
 * @author daulloa2
 */
public class Asignacion {
    
    Estudiante[] estudiantes;
    double[] notasMatematicas;
    double[] notasSociales;   

    public Asignacion(Estudiante[] estudiantes, double[] notasMatematicas, double[] notasSociales) {
        this.estudiantes = estudiantes;
        this.notasMatematicas = notasMatematicas;
        this.notasSociales = notasSociales;
    }
    
    
    
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public double[] getNotasMatematicas() {
        return notasMatematicas;
    }

    public void setNotasMatematicas(double[] notasMatematicas) {
        this.notasMatematicas = notasMatematicas;
    }

    public double[] getNotasSociales() {
        return notasSociales;
    }

    public void setNotasSociales(double[] notasSociales) {
        this.notasSociales = notasSociales;
    }
    
    public double promedioEstudiante(int i){
        double total=0;
        
            total+= getNotasSociales()[i];
            total+= getNotasMatematicas()[i];
        
        
        return total/2;
    }
    
    public double PromedioGeneralMate(){
        double total=0;
        for (int i = 0; i < getNotasMatematicas().length; i++) {
            total+= getNotasMatematicas()[i];
        }
        return total/this.getEstudiantes().length;
    }
    
    public double PromedioGeneralSociales(){
        double total=0;
        for (int i = 0; i < getNotasSociales().length; i++) {
            total+= getNotasSociales()[i];
        }
        return total/this.getNotasSociales().length;
    }
    
    
    
    @Override
    public String toString(){
        String cadena="";
        for (int i = 0; i < getEstudiantes().length; i++) {
            cadena+=String.format("%s\n"
                    + "\tMatematica: %.2f\n"
                    + "\tSociales: %.2f\n"
                    + "\tPromedio: %.2f\n\n",estudiantes[i].toString(),notasMatematicas[i],notasSociales[i],promedioEstudiante(i));
        }
        
        return String.format("%s\n"
                + "Promedio General\n"
                + "Promedio Matematicas : %.2f\n"
                + "Promedio Sociales : %.2f\n", cadena,PromedioGeneralMate(),PromedioGeneralSociales());
    }
    
    
}
