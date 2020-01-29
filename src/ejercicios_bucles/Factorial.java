
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* pedir un numero y calcular su factorial */
public class Factorial {
    public static void main(String[] args) {
        int factorial=1;
        int num=Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero para calcular su factorial"));
        
        while(num!=0){
            factorial*=num;
            num--;
        }
        JOptionPane.showMessageDialog(null, "factorial: "+factorial);
    }
}
