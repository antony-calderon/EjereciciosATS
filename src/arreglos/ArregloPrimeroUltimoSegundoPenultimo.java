
package arreglos;

import java.util.Scanner;

/* Leer 10 numeros enteros, guardarlos en un arreglo.
Mostrarlos en el siguiente orden: el primero, el ultimo, el segundo, el penultimo, etc
*/
public class ArregloPrimeroUltimoSegundoPenultimo {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numeros[]=new int[10];
        int x=0,y=9;//x=sera el primer elemento, y=sera el ultimo
        
        System.out.println("Guardando numeros para el Arreglo: ");
        
        for(int i=0;i<10;i++){
            System.out.print("Digite un  numero: ");
            numeros[i]=entrada.nextInt();
        }
        
        for(int i=0;i<5;i++){ //imprimimos los elementos en la posicion x and y
            System.out.println(numeros[x]);
            System.out.println(numeros[y]);
            x+=1; //modificamos las variables para cambiar los elementos a imprimir
            y-=1;
        }
    }
}
