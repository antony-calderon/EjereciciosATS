
package basicos_y_Codicionales;

import javax.swing.JOptionPane;


public class notaDe1Al10 {
    public static void main(String[] args) {
        float nota;
        nota=Float.parseFloat(JOptionPane.showInputDialog("digita tu nota"));
        
        if(nota>0 && nota<=2){
            JOptionPane.showMessageDialog(null, "Tu nota es: Insuficiente");
        }else if(nota>2 && nota<=4){
            JOptionPane.showMessageDialog(null, "Tu nota es: Suficiente");
        }else if(nota>4 && nota<=6){
            JOptionPane.showMessageDialog(null, "Tu nota es: Bien");
        }else if(nota>6 && nota<=8){
            JOptionPane.showMessageDialog(null, "Tu nota es: Notable");
        }else if(nota>8 && nota<=10){
            JOptionPane.showMessageDialog(null, "Tu nota es: Sobresaliente");
        }else{
            JOptionPane.showMessageDialog(null, "Tu nota no esta en el rango de calificaciones" );
        }
    }
}
