/*
 En un nuevo proyecto crear una clase de nombre Producto con los atributos código de tipo entero,
descripción un String, precio de tipo double y stock de tipo entero; 
un constructor que permita inicializar todos sus atributos y los métodos get y set.
Desde el método main de clase principal del proyecto instanciar un Producto 
y luego mostrar por consola el estado de todos sus atributos.
 */

package ejercicio1;

public class Ej1enc1 {

    public static void main(String[] args) {
        
        Producto produ1 = new Producto(00552, "cafe",355.6, 500);
        
        System.out.println("Su codigo es " + produ1.getCodigo());
        System.out.println("Tipo de producto: " + produ1.getDescripcion());
        System.out.println("Su precio: " + produ1.getPrecio());
        System.out.println("En stock: " + produ1.getStock());

        System.out.println("ESTO ES UNA PRUEBA");
        
    }
}
