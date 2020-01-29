
package ejercicios_Bucles;
/* leer un numero y dar su cuadrado,
salir al digitar un negativo.
*/
import javax.swing.JOptionPane;


public class Leer_numero_mostrar_cuadrado {
    public static void main(String[] args) {
        float num;
        
        JOptionPane.showMessageDialog(null, "El cuadrado de tu numero, digita un negativo para salir");
        num=Float.parseFloat(JOptionPane.showInputDialog("ingresa un numero"));
            
        while(num>0){
            JOptionPane.showMessageDialog(null, "El cuadrado es: "+Math.pow(num, 2));
            num=Float.parseFloat(JOptionPane.showInputDialog("ingresa otro numero"));
        }
    }
}
