
package ejercicios_Bucles;
/* Pedir numeros hasta que se teclee uno negativo, 
y mostrar cuantos numeros se han introducido.
*/
import javax.swing.JOptionPane;


public class CuantosNumerosIntroduciste {
    public static void main(String[] args) {
        int num;
        int cantidad=0;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero para añadirlo\n"
                + "Si deseas salir digita un numero negativo"));
        while(num>=0){
            cantidad++;
            num=Integer.parseInt(JOptionPane.showInputDialog("Digita otro numero"));
        }
        JOptionPane.showMessageDialog(null, "Introduciste "+cantidad+" numeros en total");
    }
}
