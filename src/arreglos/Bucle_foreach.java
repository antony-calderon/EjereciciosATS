
package arreglos;

/* imprimir un areglo usando el bucle for each*/
public class Bucle_foreach {
    public static void main(String[] args) {
        String[] nombres={"Antony", "Jhony", "Marcela", "Santiago"};
        
        for(String nombre:nombres){
            System.out.println("Nombre: "+nombre);
        }
    }
}
