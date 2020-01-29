
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Pedir un numero N, y mostrar
todos los numeros del 1 al N
*/
public class Numero_de_1_a_N {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
        for(int i=0;i<=num;i++){
            JOptionPane.showMessageDialog(null, i);
        }
    }
}
