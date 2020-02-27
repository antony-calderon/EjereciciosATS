
package arreglos;

import java.util.Scanner;

/* Leer por teclado una tabla de 10 elementos numericos enteros
y una posicion entre (0 y 9). Eliminar el elemento situado en la 
posición dada sin dejar huecos.
*/
public class EliminarPosicionArray {
    public static void main(String[] args) {
        int tabla[]=new int [10];
        int posicion;
        
        
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Llenando el arreglo de 10 elementos\n");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digita un numero: ");
            tabla[i]=entrada.nextInt();
        }
        
        //pedir la posicion entre 1 y 10
        
        do{
            System.out.print("Por favor digita la posicion a eliminar: \n");
            posicion=entrada.nextInt();
            
            if((posicion-1>=10) || (posicion-1<0)){
                System.out.println("Digita una posicion entre 1 y 10\n");
            }
        }while(posicion-1>=10 || posicion-1<0);
        
         for (int x=posicion-1;x<tabla.length-1;x++){
            tabla[x]=tabla[x+1];           
        }
        tabla[tabla.length-1]=0;
        
        //Arreglo con los nros desplazados a partir del eliminado
        for (int nro:tabla)
            System.out.print(nro+"-");
    }
}
