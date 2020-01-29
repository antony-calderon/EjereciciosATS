
package basicos_y_Codicionales;

import javax.swing.JOptionPane;

/* HACER UN PROGRAMA QUE TOME DOS NUMEROS Y DIGA SI AMBOS
   SON PARES O IMPARES
*/
public class ParesOImpares {
    public static void main(String[] args) {
        int num1;
        int num2;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
        
        if(num1%2==0 && num2%2==0){
            JOptionPane.showMessageDialog(null, "Los numeros "+num1+" y "+num2+" son pares");
        }else if(num1%2!=0 && num2%2!=0){
            JOptionPane.showMessageDialog(null, "Los numeros "+num1+" y "+num2+" son impares");
        }else if(num1%2==0 && num2%2!=0){
            JOptionPane.showMessageDialog(null, "El numero "+num1+" es par y el numero "+num2+" es impar");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+num1+" es impar y el numero "+num2+" es par");
        }
    }
}
