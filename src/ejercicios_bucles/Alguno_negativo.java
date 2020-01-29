
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* Pedir 10 numeros y mostrar al final si se ha introducido alguno negativo*/
public class Alguno_negativo {
    public static void main(String[] args) {
        int num;
        boolean neg=false;
        
        for(int i=1; i<=10; i++){
            num=Integer.parseInt(JOptionPane.showInputDialog("digita un numero"));
            if(num<0){
                neg=true;
            }
        }
        if(neg==true){
            System.out.println("digitaste negativos");
        }else{
            System.out.println("todos positivos");
        }
        //JOptionPane.showMessageDialog(null, "Se han introducido: "+neg+" numeros negativos");
    }
}
