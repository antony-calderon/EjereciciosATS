
package arreglos;

import java.util.Scanner;

/* Diseñar una aplicacion que declare una tabla de 10 elementos enteros.
Leer mediante el teclado 8 numeros, Despues se debe pedir un numero y una posicion,
insertarlo en la posicion indicada, desplazando los que estan detras.
*/
public class InsertarEnPosicion {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int num, pos;
        int tabla[]=new int[10];
        
        for(int i=0;i<8;i++){
            System.out.print((i+1)+". Digite un numero: ");
            tabla[i]=entrada.nextInt();
        }
        
        //pedimos el numero nuevo
        System.out.println("Digite el nuevo numero");
        num=entrada.nextInt();
        
        //Pedimos la posicion
        System.out.println("Digite la posición");
        pos=entrada.nextInt();
        pos=pos-1;   //se aclara la posicion para que sea entendible al usuario
        
        //recorremos el arreglo para mover los elementos,
        //empezando desde la penultima posicion e irlos corriendo
        //hacia la ultima. (en un arreglo de 10 elementos se tienen 9 posiciones 
        //empezando en 0.
        for(int i=8;i>=pos;i--){
            tabla[i+1]=tabla[i];
        }
        // se añade el numero a la posicion indicada
        tabla[pos]=num;
        
        //imprimimos el arereglo
        for(int elementos:tabla){
            System.out.print(" "+elementos);
        }
        
        
    }
}
