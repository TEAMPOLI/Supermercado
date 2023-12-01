package Menu;
import Employee.Employee;
import Product.Producto;
import ProductService.ProductService;
import java.util.Scanner;
import Client.Client;
import ClientService.ClientService;
import EmployeeService.EmployeeService;
import Provider.Provider;
import ProviderService.ProviderService;
public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    public static void menu(int opcion){

        int opcionesAccion;
        switch (opcion) {

            case 1:
                Producto producto4 = new Producto();
                Employee employee4 = new Employee();
                Client client4 = new Client();

                ProductService.obtenerListaDeProductos();
                System.out.println("Ingrese el id del producto a vender");
                int idProductoAVender = scanner.nextInt();

                // Buscar el producto correspondiente en la lista de productos

                Producto productoEncontrado = ProductService.buscarProductoPorID(idProductoAVender);

                if (productoEncontrado != null) {
                    // Asignar los valores encontrados al producto4
                    producto4.setId(productoEncontrado.getId());
                    producto4.setNombre(productoEncontrado.getNombre());
                    producto4.setPrecio(productoEncontrado.getPrecio());
                    producto4.setCantidad(productoEncontrado.getCantidad());

                    System.out.println("Ingrese la cantidad a vender");
                    int cantidad = scanner.nextInt();

                    // Aquí necesitarás obtener la información del vendedor y cliente

                    System.out.println("Ingrese la id del empleado");
                    employee4.setId(scanner.nextInt());
                    System.out.println("Ingrese el nombre del empleado");
                    employee4.setNombre(scanner.next());

                    System.out.println("Ingrese la id del cliente");
                    client4.setId(scanner.nextInt());
                    System.out.println("Ingrese el nombre del cliente");
                    client4.setNombre(scanner.next());

                    ProductService.venderProducto(producto4, cantidad, employee4, client4);

                } else {
                    System.out.println("Producto no encontrado");
                }

                break;

            case 2:
                do {
                    System.out.println("\n" + "ACCIONES DE PRODUCTO\n" +
                            "1. Insertar Producto\n" +
                            "2. Editar Producto\n" +
                            "3. Eliminar Producto\n" +
                            "4. Obtener Informacion de producto\n" +
                            "0. Salir\n");

                    System.out.println("Eliga una opcion");
                    opcionesAccion = scanner.nextInt();

                    switch (opcionesAccion){

                        case 1:

                            Producto producto = new Producto();
                            System.out.println("Ingrese el nombre del producto\n");
                            producto.setNombre(scanner.next());


                            System.out.println("Ingrese el precio del producto\n");
                            producto.setPrecio(scanner.nextDouble());


                            System.out.println("Ingrese la cantidad del producto\n");
                            producto.setCantidad(scanner.nextInt());
                            ProductService.insertarProducto(producto);

                            break;

                        case 2:
                            Producto producto1 = new Producto();
                            System.out.println("Ingrese el ID del producto que desea editar");
                            producto1.setId(scanner.nextInt());
                            System.out.println("Ingrese el nuevo nombre del producto");
                            producto1.setNombre(scanner.next());
                            System.out.println("Ingrese el nuevo precio del producto");
                            producto1.setPrecio(scanner.nextDouble());
                            System.out.println("Ingrese la nueva cantidad");
                            producto1.setCantidad(scanner.nextInt());
                            ProductService.editarProducto(producto1);


                            break;
                        case 3:
                            Producto producto3 = new Producto();

                            ProductService.obtenerListaDeProductos();
                            System.out.println("Ingrese el ID del producto que desea eliminar");
                            producto3.setId(scanner.nextInt());

                            boolean eliminado = ProductService.eliminarProducto(producto3);

                            if (eliminado){
                                System.out.println("Lista con elproducto eliminado");
                                ProductService.obtenerListaDeProductos();
                            }else{
                                System.out.println("Producto no eliminado");
                            }



                            break;
                        case 4:
                            // Obtener la lista de productos desde el servicio
                            ProductService.obtenerListaDeProductos();

                            break;

                        case 0:
                            System.out.println("Saliendo del menu de acciones...");
                            break;

                        default:
                            System.out.println("ERROR Ingresa una opcion valida");

                    }

                }while (opcionesAccion!=0);

                break;

            case 3:
                do {
                    System.out.println("\n" + "ACCIONES DE CLIENTE\n" +
                            "1. Agregar Cliente\n" +
                            "2. Editar Cliente\n" +
                            "3. Eliminar Cliente\n" +
                            "4. Ver Informacion de Clientes\n" +
                            "0. Salir\n");

                    System.out.println("Eliga una opcion");
                    opcionesAccion = scanner.nextInt();

                    switch (opcionesAccion){

                        case 1:

                            Client client1 = new Client();
                            System.out.println("Ingrese el id del cliente\n");
                            client1.setId(scanner.nextInt());


                            System.out.println("Ingrese el nombre del cliente\n");
                            client1.setNombre(scanner.next());


                            System.out.println("Ingrese la edad del cliente\n");
                            client1.setEdad(scanner.nextInt());

                            ClientService.insertarCliente(client1);

                            break;

                        case 2:
                            Client client2 = new Client();

                            System.out.println("Ingrese el ID del cliente que desea editar");
                            client2.setId(scanner.nextInt());
                            System.out.println("Ingrese el nuevo nombre del cliente");
                            client2.setNombre(scanner.next());
                            System.out.println("Ingrese la nueva edad del cliente");
                            client2.setEdad(scanner.nextInt());

                            ClientService.editarCliente(client2);


                            break;
                        case 3:
                            Client cliente3 = new Client();

                            ClientService.obtenerListaDeClientes();
                            System.out.println("Ingrese el ID del cliente que desea eliminar");
                            cliente3.setId(scanner.nextInt());

                            boolean eliminado = ClientService.eliminarCliente(cliente3);

                            if (eliminado){
                                System.out.println("Lista con el cliente eliminado");
                                ClientService.obtenerListaDeClientes();
                            }else{
                                System.out.println("cliente no eliminado");
                            }



                            break;
                        case 4:
                            // Obtener la lista de clientes desde el servicio
                            ClientService.obtenerListaDeClientes();

                            break;

                        case 0:
                            System.out.println("Saliendo del menu de acciones...");
                            break;

                        default:
                            System.out.println("ERROR Ingresa una opcion valida");

                    }

                }while (opcionesAccion!=0);

                break;

            case 4:
                do {
                    System.out.println("\n" + "ACCIONES DE PROVEEDOR\n" +
                            "1. Agregar Proveedor\n" +
                            "2. Editar Proveedor\n"+
                            "3. Eliminar Proveedor\n" +
                            "4. Ver Informacion de Proveedor\n" +
                            "0. Salir\n");

                    System.out.println("Eliga una opcion");
                    opcionesAccion = scanner.nextInt();

                    switch (opcionesAccion){

                        case 1:

                            Provider provider1 = new Provider();
                            System.out.println("Ingrese el id del Proveedor\n");
                            provider1.setId(scanner.nextInt());


                            System.out.println("Ingrese el nombre del Proveedor\n");
                            provider1.setNombre(scanner.next());


                            System.out.println("Ingrese el nombre de empresa del ProveedorProveedor\n");
                            provider1.setNombreEmpresa(scanner.next());

                            ProviderService.insertarProveedor(provider1);

                            break;

                        case 2:
                            Provider provider2 = new Provider();

                            System.out.println("Ingrese el ID del proveedor que desea editar");
                            provider2.setId(scanner.nextInt());
                            System.out.println("Ingrese el nuevo nombre del proveedor");
                            provider2.setNombre(scanner.next());
                            System.out.println("Ingrese la nueva empresa del proveedor");
                            provider2.setNombreEmpresa(scanner.next());

                            ProviderService.editarProveedor(provider2);


                            break;
                        case 3:
                            Provider provider3 = new Provider();

                            ClientService.obtenerListaDeClientes();
                            System.out.println("Ingrese el ID del proveedor que desea eliminar");
                            provider3.setId(scanner.nextInt());

                            boolean eliminado = ProviderService.eliminarProveedor(provider3);

                            if (eliminado){
                                System.out.println("Lista con el proveedor eliminado");
                                ProviderService.obtenerListaDeProveedores();
                            }else{
                                System.out.println("proveedor no eliminado");
                            }



                            break;
                        case 4:
                            // Obtener la lista de proveedor desde el servicio
                            ProviderService.obtenerListaDeProveedores();

                            break;

                        case 0:
                            System.out.println("Saliendo del menu de acciones...");
                            break;

                        default:
                            System.out.println("ERROR Ingresa una opcion valida");

                    }

                }while (opcionesAccion!=0);

                break;

            case 5:
                do {
                    System.out.println("\n" + "ACCIONES DE EMPLEADO\n" +
                            "1. Agregar EMPLEADO\n" +
                            "2. Editar EMPLEADO\n" +
                            "3. Eliminar EMPLEADO\n" +
                            "4. Ver Informacion de EMPLEADO\n" +
                            "0. Salir\n");

                    System.out.println("Eliga una opcion");
                    opcionesAccion = scanner.nextInt();

                    switch (opcionesAccion){

                        case 1:

                            Employee empleado1 = new Employee();
                            System.out.println("Ingrese el id del empleado\n");
                            empleado1.setId(scanner.nextInt());


                            System.out.println("Ingrese el nombre del empleado\n");
                            empleado1.setNombre(scanner.next());


                            System.out.println("Ingrese la edad del empleado\n");
                            empleado1.setEdad(scanner.nextInt());

                            EmployeeService.insertarEmpleado(empleado1);

                            break;

                        case 2:
                            Employee empleado2 = new Employee();

                            System.out.println("Ingrese el ID del empleado que desea editar");
                            empleado2.setId(scanner.nextInt());
                            System.out.println("Ingrese el nuevo nombre del empleado");
                            empleado2.setNombre(scanner.next());
                            System.out.println("Ingrese la nueva edad del empleado");
                            empleado2.setEdad(scanner.nextInt());

                            EmployeeService.editarEmpleado(empleado2);


                            break;
                        case 3:
                            Employee empleado3 = new Employee();

                            ClientService.obtenerListaDeClientes();
                            System.out.println("Ingrese el ID del empleado que desea eliminar");
                            empleado3.setId(scanner.nextInt());

                            boolean eliminado = EmployeeService.eliminarEmpleado(empleado3);

                            if (eliminado){
                                System.out.println("Lista con el empleado eliminado");
                                EmployeeService.obtenerListaDeEmpleados();
                            }else{
                                System.out.println("empleado no eliminado");
                            }



                            break;
                        case 4:
                            // Obtener la lista de empleado desde el servicio
                            EmployeeService.obtenerListaDeEmpleados();

                            break;

                        case 0:
                            System.out.println("Saliendo del menu de acciones...");
                            break;

                        default:
                            System.out.println("ERROR Ingresa una opcion valida");

                    }

                }while (opcionesAccion!=0);
                break;

            case 6:
                ProductService.obtenerListaDeVentas();
                break;

            case 0:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("ERROR opcion no valida.");
        }

    }
}
