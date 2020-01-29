
package arreglos;

import javax.swing.JOptionPane;

/* Leer 5 numeros por teclado, almacenarlos en un arreglo y
a continuacion realizar la media de los numeros positivos, la media
de los negativos y contar el numero de ceros
*/
public class CalculosEnArreglo {
    public static void main(String[] args) {
        int cant_ceros=0, cant_pos=0, cant_neg=0;
        float suma_pos=0, suma_neg=0;
        
        float[]numeros=new float[5];
        for(int i=0; i<5; i++){
            numeros[i]=Float.parseFloat(JOptionPane.showInputDialog((i+1)+". Digite un numero"));
            if(numeros[i]<0){
                cant_neg++;
                suma_neg+=numeros[i];
            }else if(numeros[i]>0){
                cant_pos++;
                suma_pos+=numeros[i];
            }else if(numeros[i]==0){
                cant_ceros++;
            }
        }
        JOptionPane.showMessageDialog(null, "La media de los positivos es: "+(suma_pos/cant_pos)+"\n"
                                            +"La media de los negativos es: "+(suma_neg/cant_neg)+"\n"
                                            +"La cantidad de ceros es: "+cant_ceros);
        
    }
}
