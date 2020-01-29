
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Pedir 10 sueldos. mostrar su suma y cuantos hay mayores de 1000*/
public class Sueldos {
    public static void main(String[] args) {
        int sueldo, suma_sueldos=0, mayores=0;
        
        for(int i=1; i<=10; i++){
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("digita un sueldo"));
            suma_sueldos+=sueldo;
            if(sueldo>1000){
                mayores++;
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de los sueldos es: "+suma_sueldos+"\n"
                + "La cantidad de sueldos mayores de 1000 son: "+mayores);
    }
}
