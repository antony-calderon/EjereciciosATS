
package ejercicios_Bucles;
/* Pedir 10 numeros y escribir la suma total*/
import javax.swing.JOptionPane;


public class Suma_total {
    public static void main(String[] args) {
        
        int suma=0;
        int num;
        
        for(int i=0;i<=9;i++){
            num=Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
            suma=suma+num;
        }
        JOptionPane.showMessageDialog(null, "la suma total es: "+suma);
        
    }
}
