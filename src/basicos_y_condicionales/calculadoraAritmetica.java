
package basicos_y_Codicionales;

import javax.swing.JOptionPane;

/* CONSTRUIR UN PROGRAMA QUE SIMULE EL FUNCIONAMIENTO DE UNA CALCULADORA
QUE PUEDE REALIZAR LAS CUATRO OPERACIONES ARITMETICAS BASICAS (SUMA, RESTA, 
PRODUCTO Y DIVISION) CON VALORES NUMERICOS ENTEROS. EL USUARIO DEBE ESPECIFICAR 
LA OPERACION CON EL PRIMER CARACTER DEL PRIMER PARAMETRO DE LA LINEA DE COMANDOS
S O s PARA LA SUMA, R O r PARA LA RESTA, P O p PARA EL PRODUCTO Y D O d PARA LA
DIVISION.
*/
public class calculadoraAritmetica {
    public static void main(String[] args) {
        int num1, num2,suma, resta, multi, div;
        char opc;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digita el primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo numero"));
        opc=JOptionPane.showInputDialog("Elige la operacion que deseas hacer:\n"+
                                                        "Suma: Digita S\n"+
                                                        "Resta: Digita R\n"+
                                                        "Producto: Digita P\n"+
                                                        "Division: Digita D\n").charAt(0);
        switch(opc){
            case 'S':
            case 's':   suma=num1+num2;
                        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                        break;
            case 'R':
            case 'r':   resta=num1-num2;
                        JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                        break;
            case 'P':
            case 'p':   multi=num1*num2;
                        JOptionPane.showMessageDialog(null, "La multiplicacion es: "+multi);
                        break;
            case 'D':
            case 'd':   div=num1/num2;
                        JOptionPane.showMessageDialog(null, "La division es: "+div);
                        break;
                        
            default:    JOptionPane.showMessageDialog(null, "Digitaste una opcion incorrecta");
        }
    }
}
