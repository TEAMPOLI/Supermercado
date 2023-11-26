package Main;
import Menu.Menu;
import java.util.Scanner;


public class PuntoDeVenta {
        /*private static Menu menu = new Menu();
        private static ProductService productService = new ProductService();*/
        private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int opcion ;

        do {

            System.out.println("MENU\n"
                    +"1.Nueva Venta\n"
                    +"2.Producto\n"
                    +"3.Cliente\n"
                    +"4.Proveedor\n"
                    +"5.Empleado\n"
                    +"6.Venta\n"
                    +"0.Salir\n"
            );
            System.out.println("Ingrese su opcion\n");
            opcion =scanner.nextInt();


        Menu.menu(opcion);

        }while (opcion!=0);

    }

}