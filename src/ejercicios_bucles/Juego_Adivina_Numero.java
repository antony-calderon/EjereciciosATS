
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Realizar un juego para adivinar un numero. para ello generar un numero 
entre 0 y 100, y luego ir pidiendo numeros indicando "es mayor" o "es menor" 
segun sea mayor con respecto a N. El proceso termina cuando el usario acierta
y mostrar el numero de intentos.
*/
public class Juego_Adivina_Numero {
    public static void main(String[] args) {
        int respuesta=(int)((Math.random()*100));
        int num;
        int intentos=0;
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
            intentos++;
            if(num<respuesta){
                JOptionPane.showMessageDialog(null, "Es mayor");
            }else if(num>respuesta){
                JOptionPane.showMessageDialog(null, "Es menor");
            }
            
        }while(num!=respuesta);
        JOptionPane.showMessageDialog(null, "La respuesta es correcta, el numero de intentos fue: "+intentos);
    }
}
