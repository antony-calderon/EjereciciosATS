
package basicos_y_Codicionales;

import javax.swing.JOptionPane;

/*PEDIR 3 NUMEROS Y MOSTRARLOS ORDENADOS DE MAYOR A MENOR*/
public class Ordenar3NumerosMayorMenor {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int mayor=0;
        int medio=0;
        int menor=0;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
        num3=Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero"));
        
        if(num1>num2 && num1>num3 && num2>num3){
            mayor=num1;
            medio=num2;
            menor=num3;
        }else if(num1>num2 && num1>num3 && num3>num2){
            mayor=num1;
            medio=num3;
            menor=num2;
        }else if(num2>num1 && num2>num3 && num1>num3){
            mayor=num2;
            medio=num1;
            menor=num3;
        }else if(num2>num1 && num2>num3 && num3>num1){
            mayor=num2;
            medio=num3;
            menor=num1;
        }else if(num3>num1 && num3>num2 && num1>num2){
            mayor=num3;
            medio=num1;
            menor=num2;
        }else if(num3>num1 && num3>num2 && num2>num1){
            mayor=num3;
            medio=num2;
            menor=num1;
        }
        JOptionPane.showMessageDialog(null, "El numero mayor es: "+mayor+" \nEl numero medio es: "+medio+
                " \nEl numero menor es:  "+menor);
    }
}
