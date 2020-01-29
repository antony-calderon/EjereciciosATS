
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Leer un numero e indicar si es positivo o negativo.
El proceso se repetira hasta que se introduzca un 0.
*/
public class PositivoONegativo {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero para saber si es positivo o negativo\n"
                + "Digita 0 si deseas salir"));
        while(num!=0){
            if (num>0){
                JOptionPane.showMessageDialog(null, "El numero es positivo");
            }else{
                JOptionPane.showMessageDialog(null, "El numero es negativo");
            }
            num=Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero"));
        }
    }
}
