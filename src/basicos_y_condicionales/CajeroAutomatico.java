
package basicos_y_Codicionales;

import java.io.PrintStream;
import javax.swing.JOptionPane;

/* Hacer un programa que simule un cajero automatico con un saldo inicial de 
1000 dolares, con el suiguiente menu de opciones:
1. ingresar dinero a la cuenta
2. retirar dinero de la cuenta
3. salir */
public class CajeroAutomatico {
    public static void main(String[] args) {
        final int saldoInicial=1000;
        int ingreso, saldoActual, retiro;
        int opc;
        do{
        opc=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a tu cajero automatico, elige una opcion: \n"
                + "1. Ingresar dinero a la cuenta\n"
                + "2. Retirar dinero de la cuenta\n"
                + "3. Salir"));
        switch(opc){
            case 1:{
                ingreso=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto a consignar"));
                saldoActual=saldoInicial+ingreso;
                JOptionPane.showMessageDialog(null, "El saldo actual es: "+saldoActual);
            }break;
            case 2:{
                retiro=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto a retirar"));
                saldoActual=saldoInicial-retiro;
                if(retiro>saldoInicial){
                    JOptionPane.showMessageDialog(null, "Fondos insuficientes");
                }else{
                    saldoActual=saldoInicial-retiro;
                    JOptionPane.showMessageDialog(null, "El saldo actual es: "+saldoActual);
                }
                
            }break;
            case 3:{
                break;
            }
            default: JOptionPane.showMessageDialog(null,"Digitaste una opcion incorrecta");
            
        }
        }while(opc!=3);
        
    }
}
