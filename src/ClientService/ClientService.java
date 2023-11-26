package ClientService;
import Client.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientService {

   private static List <Client> clientList = new ArrayList<>();

   public static void insertarCliente(Client client) {

       clientList.add(client);
       System.out.println("Cliente agregado exitosamente!!!");

   }

   public static List<Client> obtenerListaDeClientes(){

       List<Client> listaDeClientes = ClientService.clientList;

       int i=1;
       //Mostrar lista de productos
       for (Client c : listaDeClientes) {

           System.out.println("Cliente #"+ i +" ID:" +c.getId() +
                   " Nombre: "  + c.getNombre() +
                   ", Edad: " + c.getEdad());

           i++;
       }

       return clientList;
   }

    public static void editarCliente(Client clienteNuevosValores){

        for (Client client : clientList) {

            if (client.getId() == clienteNuevosValores.getId()){

                client.setNombre(clienteNuevosValores.getNombre());
                client.setEdad(clienteNuevosValores.getEdad());
                System.out.println("¡¡Cliente editado correctamente!!");
            }
        }
    }

    public static boolean eliminarCliente(Client clienteEliminar){

        for (Client client : clientList){

            if (client.getId() == clienteEliminar.getId()){
                clientList.remove(client);
                System.out.println("¡¡Cliente eliminado Correctamente!!");
                return true;
            }
        }

        return false;
    }

}





