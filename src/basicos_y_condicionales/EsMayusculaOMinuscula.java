
package basicos_y_Codicionales;

import javax.swing.JOptionPane;


public class EsMayusculaOMinuscula {
    public static void main(String[] args) {
        char letra;
        letra=JOptionPane.showInputDialog(null, "Digita una letra").charAt(0);/*charAt lee
        la primer letra de un String
        */
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra es mayúscula");
        }else{
            JOptionPane.showMessageDialog(null, "La letra es minúscula");
        }
    }
}
