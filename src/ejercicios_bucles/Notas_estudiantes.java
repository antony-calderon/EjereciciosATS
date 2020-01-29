
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Dadas 6 notas, escribir la cantidad de alumnos aprobados,
condicionados y suspensos.
*/
public class Notas_estudiantes {
    public static void main(String[] args) {
        float nota;
        int aprobados=0, suspensos=0, condicionados=0;
        
        for(int i=1; i<=6; i++){
            do{
               nota=Float.parseFloat(JOptionPane.showInputDialog("Digita la nota en un rango de 0 a 10")); 
            }while(nota<0 || nota>10);  
            
            if(nota>4){
                aprobados++;
            }else if(nota==4){
                condicionados++;
            }else if(nota<4){
                suspensos++;
            }
        }
        JOptionPane.showMessageDialog(null, "Alumnos aprobados: "+aprobados+"\n"
                                            + "Alumnos condicionados: "+condicionados+"\4n"
                                            + "Alumnos suspensos: "+suspensos);
    }
}
