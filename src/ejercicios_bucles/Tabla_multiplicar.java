
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Pide un numero que debe estar entre 0 y 10
y mostrar la tabla de multiplicar de dicho numero
*/
public class Tabla_multiplicar {
    public static void main(String[] args) {
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("digita un numero entre 0 y 10"));
        
        while((num>10) || (num<0)){
            num=Integer.parseInt(JOptionPane.showInputDialog("digita un numero entre 0 y 10"));
        }
            for(int i=0; i<=10; i++){
            //JOptionPane.showMessageDialog(null, num+" x "+i+" = "+num*i+"\n");
            System.out.println(num+" x "+i+" = "+num*i+"\n");
        
        }
        
        
        
    }
}
