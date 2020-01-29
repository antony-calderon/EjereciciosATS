
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Pedir numeros hasta que se introduzca uno negativo,
y calcular la media.
*/
public class Calcular_media_numeros {
    public static void main(String[] args) {
        int num;
        int acumulado=0;
        int contador=0;
        float promedio;
      
        num=Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
          
        while(num>=0){
            acumulado=acumulado+num;
            contador++;
            num=Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
        }
        if (contador==0){
          JOptionPane.showMessageDialog(null, "Error, la division entre 0 no es posible");
        }else{
            promedio=(float)acumulado/contador;
            JOptionPane.showMessageDialog(null, "La media de los numeros ingresados es: "+promedio);
        }
        
    }
}
