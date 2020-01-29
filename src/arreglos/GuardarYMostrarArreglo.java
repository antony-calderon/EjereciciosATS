
package arreglos;

import javax.swing.JOptionPane;

/* Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo orden introducido*/
public class GuardarYMostrarArreglo {
    public static void main(String[] args) {
        float[] numeros=new float[5];
        
        JOptionPane.showMessageDialog(null, "Llenando el arreglo");
        
        for(int i=0; i<5; i++){
            numeros[i]=Float.parseFloat(JOptionPane.showInputDialog((i+1)+". Digite un numero"));
        }
        
        JOptionPane.showMessageDialog(null, "Mostrando el arreglo");
        
        for(float numero:numeros){
            System.out.println(numero);
        }
    }
}
