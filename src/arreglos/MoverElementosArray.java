
package arreglos;

import java.util.Scanner;

/* Crear un programa que lea por teclado una tabla de 10 numeros
enteros y la desplace una posicion hacia abajo: el primero pasa 
a ser el segundo, el segundo pasa a ser el tercero y asi sucesivamente.
El ultimo pasa a ser el primero.
*/
public class MoverElementosArray {
    public static void main(String[] args) {
        int tabla[]=new int[10];
        int aux;
        
        Scanner entrada=new Scanner(System.in);
        
        //filling the array of 10 elements
        for(int i=0; i<10; i++){
            System.out.print((i+1)+". Digita un numero: ");
            tabla[i]=entrada.nextInt();
        }
        
        //assigning the value of the last position to the auxiliary
        
        aux=tabla[(tabla.length)-1];
        
        //moving the elements to the right
                
            for(int i=8;i>=0;i--){
            tabla[i+1]=tabla[i];
            }
        
        
        //assigning the value of the auxiliary to the first position
        tabla[0]=aux;
        
        //print the array
        for(int a:tabla){
            System.out.print(a+" ");
        }
    }
}
