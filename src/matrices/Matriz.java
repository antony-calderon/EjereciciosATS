
package matrices;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz {
    public static void main(String[] args) {
        int matriz[][]={{1,2,3,4},{5,6,7,8},{1,2,3,0}};
        
        for(int i=0; i<3; i++){///Número de filas
            for(int j=0; j<4;j++){///Número de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        /////llenando manualmente la matriz//////////
        Scanner entrada = new Scanner (System.in);
        System.out.println("Llenando la matriz con ayuda del usuario\n");
        //pedimos al usuario numero de filas y columnas
        int filas=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de filas que tendra tu matriz: "));
        int columnas=Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de columnas que tendra tu matriz: "));
        
        //declaramos la matriz
        int matriz2[][]=new int[filas][columnas];
        
        //llenando la matriz
        System.out.println("Digita la matriz: ");
        for(int k=0;k<filas;k++){
            for(int l=0;l<columnas;l++){
                System.out.print("Matriz ["+k+"]["+l+"]: ");
                matriz2[k][l]=entrada.nextInt();
            }  
        }
        //imprimiendo la matriz
        System.out.println("\nla matriz es: ");
        for(int k=0; k<filas; k++){///Número de filas
            for(int l=0; l<columnas;l++){///Número de columnas
                System.out.print(matriz2[k][l]);
            }
            System.out.println("");
        }
    }
    
}
