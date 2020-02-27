/* Odenamiento método: burbuja*/
package ordenamientos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Burbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tabla[], nElementos, aux;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos elementos tendrá el array?"));
        
        tabla=new int [nElementos];//Asignamos el número de elementos al arreglo
        
        for(int i=0; i<nElementos; i++){
            System.out.print((i+1)+". Digite un número: ");
            tabla[i]=entrada.nextInt();
        }
        System.out.println("");
        //////Método Burbuja///////////
        for(int i=0; i<(nElementos-1);i++){
            for(int j=0; j<(nElementos-1); j++){
                if(tabla[j]>tabla[j+1]){ //numeroActual > numeroSiguiente
                aux=tabla[j];
                tabla[j]=tabla[j+1];
                tabla[j+1]=aux;
                }
            }
        }
        
        //Showing the array
        System.out.println("Arreglo ordenado en forma creciente: ");
        for(int elemento:tabla){
            System.out.print(elemento+"-");
        }
        
        System.out.println("\nArreglo ordenado en forma Decreciente: ");
        for(int i=(nElementos-1); i>=0; i--){
            System.out.print(tabla[i]+"-");
        }
    }
}
