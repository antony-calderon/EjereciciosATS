
package ejercicios_Bucles;
/* diseñar un programa que muestre el producto de los 10
primeros numeros impares
*/
public class Producto_primeros_impares {
    public static void main(String[] args) {
        
        int producto=1;
        for(int i=0; i<=20; i++){
            if(i%2==1){
                producto*=i;   
            } 
        }
        System.out.println(producto);
    }
}
