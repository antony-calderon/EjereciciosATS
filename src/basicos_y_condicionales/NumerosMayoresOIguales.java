
package basicos_y_Codicionales;

import javax.swing.JOptionPane;
/*PEDIR DOS NUMEROS Y DECIR CUAL ES EL MAYOR O SI SON IGUALES*/

public class NumerosMayoresOIguales {
    public static void main(String[] args) {
        int n1;
        int n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero"));
        
        if(n1>n2){
            JOptionPane.showMessageDialog(null, "El numero "+n1+" es mayor");
        }else if(n1<n2){
            JOptionPane.showMessageDialog(null, "El numero "+n2+" es mayor");
        }else if(n1==n2){
            JOptionPane.showMessageDialog(null, "Los numeros "+n1+" y "+n2+" son iguales");
        }
    }
}
