package ProductService;
import Product.Producto;
import java.util.ArrayList;
import java.util.List;
public class ProductService {

    private static List<Producto> productolist = new ArrayList<>();

    public static void insertarProducto(Producto producto){
        producto.setId(productolist.size());
        productolist.add(producto);
        System.out.println("Producto agregado con exito!!!");
    }

    public static List<Producto> obtenerListaDeProductos(){
        List<Producto> listaDeProductos = ProductService.productolist;

        int i=1;
        //Mostrar lista de productos
        for (Producto p : listaDeProductos) {

            System.out.println("Producto #"+ i +" ID:" + p.getId() +
                    " Nombre: "  + p.getNombre() +
                    ", Precio: " + p.getPrecio() +
                    ", Cantidad: " + p.getCantidad());

            i++;
        }

        return productolist;
    }

    public static void editarProducto(Producto productoNuevosValores){

        for (Producto producto : productolist) {
            if (producto.getId() == productoNuevosValores.getId()){
                producto.setNombre(productoNuevosValores.getNombre());
                producto.setPrecio(productoNuevosValores.getPrecio());
                producto.setCantidad(productoNuevosValores.getCantidad());
                System.out.println("¡¡Producto editado correctamente!!");
            }
        }
    }

    public static boolean eliminarProducto(Producto productoEliminar){

        for (Producto producto : productolist){

            if (producto.getId() == productoEliminar.getId()){
                productolist.remove(producto);
                System.out.println("¡¡Producto eliminado Correctamente!!");
                return true;
            }
        }

        return false;
    }

}

