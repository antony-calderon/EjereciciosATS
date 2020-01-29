
package ejercicios_Bucles;

import javax.swing.JOptionPane;

/* una empresa que se dedica a la venta de desinfectantes necesita 
un programa para gestionar sus facturas. en cada factura figura: 
el codigo del articulo, la cantidad vendida en litros y el precio por litro.
Se pide de 5 facturas introducidas: Facturacion total, cantidad en litros vendidos
del artículo 1 y cuantas facturas se emitieron de mas de $600
*/
public class Facturacion_empresa {
    public static void main(String[] args) {
        int codigo, litros, litros_1=0,mayor_600=0;
        float precio_litro, fact_total=0, fact ;
        
        for(int i=1; i<=5; i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Digita el codigo del producto"));
            litros=Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de litros vendidos del producto "+i));
            precio_litro=Float.parseFloat(JOptionPane.showInputDialog("Digite el precio por litro del producto "+i));
            
            fact=litros*precio_litro;
            fact_total+=fact;
            
            if(codigo==1){
                litros_1+=litros;
            }
            if(fact>600){
                mayor_600++;
            }
        }
        JOptionPane.showMessageDialog(null, "Resumen Facturacion\n"
                                            + "Facturacion total: "+fact_total+"\n"
                                            + "Litros vendidos articulo 1: "+litros_1+"\n"
                                            + "Cantidad facturas mayores de 600: "+mayor_600);
    }
}
