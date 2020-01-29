
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso*/
public class Algun_suspendido {
    public static void main(String[] args) {
        float nota;
        boolean suspenso=false;
        
        for(int i=1; i<=5; i++){
            nota=Float.parseFloat(JOptionPane.showInputDialog("digita la nota"+i));
            if(nota<4){
                suspenso=true;
            }
        }
        if(suspenso==true){
            JOptionPane.showMessageDialog(null, "Hay alumnos suspendidos");
        }
    }
}
