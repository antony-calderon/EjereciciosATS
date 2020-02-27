/* Ordenamientos: Ordenamiento por inserción*/

package ordenamientos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Inserción {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int tabla[],nElementos, pos, aux;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos del array"));
        
        tabla=new int [nElementos];
        
        System.out.println("Digita el arreglo");
        for(int i=0; i<nElementos; i++){
            System.out.print((i+1)+". Digita un número: ");
            tabla[i]=entrada.nextInt();
        }
        
        ////Ordenamiento por Inserción//////////
        for(int i=0; i<nElementos; i++){
            pos=i;   /////marca la flecha donde vamos 
            aux=tabla[i];  /////guarda el valor de la ubicacion actual
            
            while((pos>0) && (tabla[pos-1] > aux)){ //si numeroIzquierda > numeroActual... hacemos cambio
                tabla[pos]=tabla[pos-1];
                pos--;
            }
            tabla[pos]=aux;
        }
        System.out.print("\nArreglo orden ascendente: ");
        for(int elemento:tabla){
            System.out.print(elemento+"-");
        }
        System.out.print("\nArreglo orden descendente: ");
        for(int i=(nElementos-1); i>=0; i--){
            System.out.print(tabla[i]+"-");
        }
    }
}
