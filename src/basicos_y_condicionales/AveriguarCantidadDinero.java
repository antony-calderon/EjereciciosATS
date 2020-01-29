
package basicos_y_Codicionales;

import java.util.Scanner;


public class AveriguarCantidadDinero {

    
    public static void main(String[] args) {
        calculo();
        
    }
    public static void calculo(){//51150 151300
        int salario=1000;
        int comision;
        int numCarros;
        double pago;
        int carrosVendidos;
        double porcentaje;
        
        Scanner en=new Scanner(System.in);
        System.out.println("Digite la cantidad de carros vendidos");
        numCarros=en.nextInt();
        comision=numCarros*150;
        System.out.println("Digite el valor de la venta de los carros");
        carrosVendidos=en.nextInt();
        porcentaje=carrosVendidos*0.05;
        pago=salario+comision+porcentaje;
        
        System.out.println("El pago al empleado es: "+pago);
    }
    
}
