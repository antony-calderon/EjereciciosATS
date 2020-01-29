
package basicos_y_Codicionales;
/* PEDIR UN NUMERO ENTRE 0 Y 99999 Y DECIR CUANTAS CIFRAS TIENE*/ 
import javax.swing.JOptionPane;


public class cuantasCifrasTiene {
    public static void main(String[] args) {
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entre 0 y 99999"));
        
        if(numero<10){
            JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
        }else if(numero<100){
            JOptionPane.showMessageDialog(null, "El numero tiene 2 cifras");
        }else if(numero<1000){
            JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
        }else if(numero<10000){
            JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras");
        }else if(numero<100000){
            JOptionPane.showMessageDialog(null, "El numero tiene 5 cifras");
        }else{
            JOptionPane.showMessageDialog(null, "El numero debe estar entre 0 y 99999");
        }
    }
}
