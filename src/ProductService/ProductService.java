package ProductService;
import Product.Producto;
import java.util.ArrayList;
import java.util.List;
import NewSell.NewSell;
public class ProductService {

    private static List<Producto> productolist = new ArrayList<>();
    private static List<NewSell> listaDeVentas = new ArrayList<>();


    public static void insertarProducto(Producto producto) {
        producto.setId(productolist.size());
        productolist.add(producto);
        System.out.println("Producto agregado con exito!!!");
    }

    public static List<Producto> obtenerListaDeProductos() {
        List<Producto> listaDeProductos = ProductService.productolist;

        int i = 1;
        //Mostrar lista de productos
        for (Producto p : listaDeProductos) {

            System.out.println("Producto #" + i + " ID:" + p.getId() +
                    " Nombre: " + p.getNombre() +
                    ", Precio: " + p.getPrecio() +
                    ", Cantidad: " + p.getCantidad());

            i++;
        }

        return productolist;
    }

    public static void editarProducto(Producto productoNuevosValores) {

        for (Producto producto : productolist) {
            if (producto.getId() == productoNuevosValores.getId()) {
                producto.setNombre(productoNuevosValores.getNombre());
                producto.setPrecio(productoNuevosValores.getPrecio());
                producto.setCantidad(productoNuevosValores.getCantidad());
                System.out.println("¡¡Producto editado correctamente!!");
            }
        }
    }

    public static boolean eliminarProducto(Producto productoEliminar) {

        for (Producto producto : productolist) {

            if (producto.getId() == productoEliminar.getId()) {
                productolist.remove(producto);
                System.out.println("¡¡Producto eliminado Correctamente!!");
                return true;
            }
        }

        return false;
    }

    public static boolean venderProducto(Producto productoVenta, int cantidadVenta) {

        for (Producto producto : productolist) {
            if (producto.getId() == productoVenta.getId()) {
                if (producto.getCantidad() >= cantidadVenta) {
                    int cantidadActual = producto.getCantidad();
                    producto.setCantidad(cantidadActual - cantidadVenta);

                    registrarVenta(productoVenta, cantidadVenta);

                    System.out.println("¡Venta realizada correctamente!");
                    return true;
                } else {
                    System.out.println("No hay suficiente stock para completar la venta");
                    return false;
                }
            }
        }
        System.out.println("Producto no encontrado");
        return false;
    }

    private static void registrarVenta(Producto producto, int cantidad) {
        NewSell nuevaVenta = new NewSell(producto, cantidad);
        listaDeVentas.add(nuevaVenta);
    }

    public static List<NewSell> obtenerListaDeVentas() {
        for (NewSell n : listaDeVentas) {
            System.out.println("Venta - Producto: " + n.getProducto().getNombre() +
                    ", Cantidad: " + n.getCantidadVendida());
        }
        return listaDeVentas;
    }
}

