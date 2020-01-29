
package arreglos;

import javax.swing.JOptionPane;

/* leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden inverso al introducido*/
public class MostrarInversoArreglo {
    public static void main(String[] args) {
        float[]numeros=new float[5];
        
        JOptionPane.showMessageDialog(null, "Llenando el arreglo");
        
        for(int i=0; i<5; i++){
            numeros[i]=Float.parseFloat(JOptionPane.showInputDialog((i+1)+". Digita un numero"));
        }
        
        for(int i=4; i>=0; i--){
            System.out.println(numeros[i]);
        }
    }
}
