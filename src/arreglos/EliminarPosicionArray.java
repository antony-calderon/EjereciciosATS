
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
        
        //jejeje
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Llenando el arreglo de 10 elementos\n");
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digita un numero: ");
            tabla[i]=entrada.nextInt();
        }
        
        //pedir la posicion entre 0 y 9
        
        do{
            System.out.print("Por favor digita la posicion: \n");
            posicion=entrada.nextInt();
            
            if(posicion>9 || posicion<0){
                System.out.println("Digita una posicion entre 0 y 9\n");
            }
        }while(posicion>9 || posicion<0);
        
        //print the array
        for(int elemento:tabla){
            System.out.print(elemento+"-");
        }
    }
}
