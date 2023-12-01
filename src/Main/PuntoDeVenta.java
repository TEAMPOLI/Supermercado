package Main;
import Menu.Menu;
import java.util.Scanner;


public class PuntoDeVenta {
        private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean salir=false;


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


           try{

               int opcion =scanner.nextInt();
               Menu.menu(opcion);

               if(opcion==0){

                   salir=true;
               }

           }catch (Exception e){

               scanner.nextLine();
               System.out.println("Tiene que ser un numero");
           }




        }while (!salir);

    }

}