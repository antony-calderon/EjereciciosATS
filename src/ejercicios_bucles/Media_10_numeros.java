
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Pedir 10 numeros, mostrar la media de los numeros positivos,
la media de los numeros negativos y la cantidad de ceros.
*/
public class Media_10_numeros {
    public static void main(String[] args) {
        float numero, cant_pos=0, suma_pos=0, media_pos=0, cant_neg=0, suma_neg=0, media_neg=0, cant_ceros=0;
        
        for(int i=1; i<=10; i++){
            numero=Float.parseFloat(JOptionPane.showInputDialog("digita un numero"));
            if(numero==0){
                cant_ceros++;
            }else if(numero>0){
                cant_pos++;
                suma_pos+=numero;
                media_pos=suma_pos/cant_pos;
            }else if(numero<0){
                cant_neg++;
                suma_neg+=numero;
                media_neg=suma_neg/cant_neg;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Cantidad de ceros: "+cant_ceros+"\n"
                        + "Media negativos: "+media_neg+"\n"
                        + "Media positivos: "+media_pos);
    }
}
