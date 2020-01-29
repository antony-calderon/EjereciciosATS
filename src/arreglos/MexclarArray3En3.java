
package arreglos;

import java.util.Scanner;

/* Leer los datos correspondientes a dos tablas de 12 elementos
numericos, y mezclarlos en una tercera de la forma: 3 de la a, 
3 de la b, otros 3 de la a, otros 3 de la b, etc
*/
public class MexclarArray3En3 {
    public static void main(String[] args) {
        int a[], b[], c[];
        
        a=new int[6];
        b=new int[6];
        c=new int[12];
        
        System.out.println("hola");
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Llenando el arreglo 1");
        for(int i=0;i<6;i++){
            System.out.print((i+1)+". Digite un numero: ");
            a[i]=entrada.nextInt();
        }
        
       
        
        System.out.println("Llenando el arreglo 2");
        for(int i=0; i<6;i++){
            System.out.print((i+1)+". Digite un numero: ");
            b[i]=entrada.nextInt();
        }
        
        int j=0;
        
        
        for(int i=0;i<6;i+=3){
            
                c[j]=a[i];
                j++;
                c[j]=a[(i+1)];
                j++;
                c[j]=a[(i+2)];
                j++;
                c[j]=b[i];
                j++;
                c[j]=b[(i+1)];
                j++;
                c[j]=b[(i+2)];
                j++;
            
        
        }
        
        for(int cc:c){
            System.out.println(cc);
        }
    }
}
