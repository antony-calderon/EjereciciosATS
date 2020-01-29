
package arreglos;

import java.util.Scanner;

/* Leer por teclado dos tablas de 10 numeros enteros
y mezclarlas en una tercera tabla de la siguiente forma:
1 del A, 1 del B, 2 del A, 2 del B, etc
*/
public class MezclarArreglosEnUno {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        int pares[],impares[],todos[];
        
        pares=new int[10];
        impares=new int[10];
        todos=new int[20];
        
        System.out.println("Digite el primer arreglo");
        for(int i=0; i<10; i++ ){
            System.out.print((i+1)+". Digita un numero: ");
            pares[i]=entrada.nextInt();
        }
        System.out.println("\n");
        System.out.println("Digite el segundo arreglo");
        
        for(int i=0;i<10;i++){
            System.out.print((i+1)+". Digite un numero ");
            impares[i]=entrada.nextInt();
        }
        
        int j=0;
        
        for(int i=0;i<10;i++){
            todos[j]=pares[i];
            j++;
            todos[j]=impares[i];
            j++;
        }
        for(int todo:todos){
            System.out.println(todo);
        }
    }
}
