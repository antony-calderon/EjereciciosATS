
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Leer numeros hasta que se introduzca un 0.
para cada uno indicar si es par o impar.
*/
public class EsParOImpar {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero para saber si es par o impar\n"
                + "Si deseas salir oprime 0"));
        while(num!=0){
            if(num%2==0){
                JOptionPane.showMessageDialog(null, "El numero "+num+" es par");
            }else{
                JOptionPane.showMessageDialog(null, "El numero "+num+" es impar");
            }
            num=Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero"));
        }
    }
}
