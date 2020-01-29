
package basicos_y_Codicionales;

import javax.swing.JOptionPane;


public class suma {
    public static void main(String[] args) {
        int num1;
        int num2;
        int suma;
        
        System.out.println("Programa para sumar\n");
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("digite el numero 1"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("digite el numero 2"));
        suma=num1+num2;
        
        JOptionPane.showMessageDialog(null, "la suma es: "+suma);
    }
}
