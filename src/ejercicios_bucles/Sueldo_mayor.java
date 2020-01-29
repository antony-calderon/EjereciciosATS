
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Pedir un numero N, introducir N sueldos, y mostrar el sueldo maximo*/
public class Sueldo_mayor {
    public static void main(String[] args) {
        int num, sueldo, mayor=-99999, menor=99999;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero"));
        
        for(int i=1; i<=num; i++){
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("ingresa el sueldo "+i));
            if(sueldo>mayor){
                mayor=sueldo;
            }
            if(sueldo<menor){
                menor=sueldo;
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo mayor es: "+mayor+"\n"
                                            + "El sueldo menor es: "+menor);
    }
}
