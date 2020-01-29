
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Pedir numeros hasta que se teclee 0, mostrar la 
suma de todos los numeros introducidos
*/
public class Suma_numeros_introducidos {
    public static void main(String[] args) {
        int num;
        int suma=0;
        
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("digita un numero para sumarlo"));
            suma=suma+num;
        }while(num!=0);
        JOptionPane.showMessageDialog(null, "La suma de todos los numeros es: "+suma);
    }
}
