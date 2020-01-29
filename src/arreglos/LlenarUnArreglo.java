/*
 Llenar un arreglo
 */
package arreglos;

import javax.swing.JOptionPane;


public class LlenarUnArreglo {
    public static void main(String[] args) {
        int elementos;
        
        elementos=Integer.parseInt(JOptionPane.showInputDialog("cuantos elementos tendra el arreglo"));
        
        char[] letras=new char[elementos];
        for(int i=0; i<elementos; i++){
            letras[i]=JOptionPane.showInputDialog((i+1)+" Digita un caracter").charAt(0);
        }
        for(int i=0; i<elementos; i++){
            System.out.println(letras[i]);
        }
    }
            
}
