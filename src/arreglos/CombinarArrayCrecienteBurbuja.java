package arreglos;

import java.util.Scanner;

public class CombinarArrayCrecienteBurbuja {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla1[] = new int[10];
        int tabla2[] = new int[10];
        int tabla3[] = new int[20];
        boolean creciente = true;

        //Filling the array number 1
        System.out.println("Llenando el primer arreglo:\n");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Ingrese un numero: ");
                tabla1[i] = entrada.nextInt();
            }
            //check if it is growing
            for (int i = 0; i < 9; i++) {
                if (tabla1[i] < tabla1[i + 1]) {
                    creciente = true;
                }
                if (tabla1[i] > tabla1[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("El arreglo no esta en forma creciente, vuelve a digitar: ");
            }
        } while (creciente == false);

        //filling the array number 2
        System.out.println("Llenando el segundo arreglo:\n");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.print((i + 1) + ". Ingrese un numero: ");
                tabla2[i] = entrada.nextInt();
            }
            //check if it is growing
            for (int i = 0; i < 9; i++) {
                if (tabla2[i] < tabla2[i + 1]) {
                    creciente = true;
                }
                if (tabla2[i] > tabla2[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("El arreglo no esta en forma creciente, vuelve a digitar: ");
            }
        } while (creciente == false);

        
        for (int i = 0, j = 0; i < 10; i++) {
            //copiamos el primer elemento de tabla1
            tabla3[j] = tabla1[i];
            //se incrementa j para avanzar al siguiente elemento de tabla1
            j++;
            //copiamos el primer elemento de tabla2
            tabla3[j] = tabla2[i];
            //se incrementa j para avanzar al siguiente elemento de tabla2
            j++;
        }
        //Método burbuja
        int auxiliar;
        for (int i = 0; i < ((tabla3.length) - 1); i++) { //Cuantas vueltas tiene que dar
            for (int j = 0; j < ((tabla3.length) - 1); j++) { //Intercambiar numeros e ir ordenando
                if (tabla3[j] > tabla3[j + 1]) {
                    auxiliar = tabla3[j];
                    tabla3[j] = tabla3[j + 1];
                    tabla3[j + 1] = auxiliar;
                }
            }
        }
        for(int obj:tabla3){
            System.out.print(obj+"-");
        }
    }
}
