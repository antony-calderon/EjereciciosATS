/* Busqueda secuencial*/

/* buscar un valor dentro de un arreglo*/
package busqueda;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {
    public static void main(String[] args) {
        ////se llena manualmente el arreglo/////////
        int tabla[]={1,2,6,8,7};
        int dato;
        boolean encontrado=false;
        
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digita el número a buscar: "));
        
        int i=0;////iterador que recorre el array
        while(i<5 && encontrado==false){//mientras i e menor a la cantidad de elementos y encontrado es falso
            if(tabla[i]==dato){//si el dato es encontrado
                encontrado=true;//encontrado pasa a true
            }
            i++;// se aumenta el iterador para seguir recorriendo el array
        }
        if(encontrado==false){//si no se encontro el número
            JOptionPane.showMessageDialog(null, "El número no fue encontrado en el arreglo");
        }else{//si se encontro el número
            JOptionPane.showMessageDialog(null, "El número fue encontrado en la posición: "+(i-1));
        }
    }
}
