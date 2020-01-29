
package basicos_y_Codicionales;

import javax.swing.JOptionPane;

/*HACER UN PROGRAMA QUE LEA UN NUMERO ENTERO
Y MUESTRE SI EL NUMERO ES MULTIPLO DE 10
*/
public class EsONoMultiploDeDiez {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa un numero entero"));
        
        if(numero%10==0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no es multiplo de 10");
        }
    }
}
