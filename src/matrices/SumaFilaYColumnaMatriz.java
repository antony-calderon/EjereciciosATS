/* crear y cargar una matriz de tamaño n x m,
mostrar la suma de cada fila y de cada columna
*/
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class SumaFilaYColumnaMatriz {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        
        //pedimos numero de filas y columnas para la matriz
        int filas=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas"));
        int columnas=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas"));
        
        int sumafilas,sumacol;
                
        int matriz[][]=new int[filas][columnas];
        
        //llenamos la matriz
        System.out.println("Llena la matriz: ");
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("matriz: ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        
        //imprimir la matriz
        System.out.println("La matriz es: \n");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //procedemos a sumar filas
        for(int i=0;i<filas;i++){
            sumafilas=0;
            for(int j=0;j<columnas;j++){
                sumafilas+=matriz[i][j];
            }
            System.out.println("la suma de la fila "+i+" es: "+sumafilas);
        }
        System.out.println("");
        
        //procedemos a sumar las columnas
        for(int j=0;j<columnas;j++){
            sumacol=0;
            for(int i=0;i<filas;i++){
                sumacol+=matriz[i][j];
            }
            System.out.println("la suma de la columna "+j+" es: "+sumacol);
        }
        System.out.println("");
    }
    
}
