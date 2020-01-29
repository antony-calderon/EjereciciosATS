
package basicos_y_Codicionales;

import java.util.Scanner;


public class CalificacionEstudiante {
    
    public static void main(String[] args) {
        notas();
    }
    
    public static void notas(){
        ////////se declaran las variables para el ejercicio//////////
        float participacion;
        float examen1;
        float examen2;
        float ultimoExamen;
        float nota;
        /////////se piden los datos//////////////
        Scanner en=new Scanner(System.in);
        System.out.println("Digite la nota de participacion");
        participacion=en.nextFloat()*0.10f;
        
        System.out.println("Digite la nota del examen 1");
        examen1=en.nextFloat()*0.25f;
        
        System.out.println("Digite la nota del examen 2");
        examen2=en.nextFloat()*0.25f;
        
        System.out.println("Digite la nota del examen final");
        ultimoExamen=en.nextFloat()*0.40f;
        
        //se calcula la nota final/////////////
        nota=participacion+examen1+examen2+ultimoExamen;
        
        /////se imprime la nota final///////////
        System.out.println("la nota del estudiante es: "+nota);
    }
    
}

