package ProviderService;
import Client.Client;
import Employee.Employee;
import Provider.Provider;
import java.util.ArrayList;
import java.util.List;
public class ProviderService {

    private static List<Provider> providerList = new ArrayList<>();

    public static void insertarProveedor(Provider provider){

        providerList.add(provider);
        System.out.println("Proveedor agregado exitosamente!!!");
    }

    public static  List<Provider> obtenerListaDeProveedores(){

        int i=1;
        //Mostrar lista de productos
        for (Provider p : providerList) {

            System.out.println("Proveedor #"+ i +" ID:" +p.getId() +
                    " Nombre: "  + p.getNombre() +
                    ", Empresa: " + p.getNombreEmpresa());

            i++;
        }
        return providerList;
    }

    public static void editarProveedor(Provider proveedorNuevosValores) {

        for (Provider provider : providerList) {

            if (provider.getId() == proveedorNuevosValores.getId()) {

                provider.setNombre(proveedorNuevosValores.getNombre());
                provider.setNombreEmpresa(proveedorNuevosValores.getNombreEmpresa());
                System.out.println("¡¡Proveedor editado correctamente!!");
            }
        }
    }

    public static boolean eliminarProveedor(Provider proveedorEliminado){

        for (Provider provider : providerList){

            if (provider.getId() == proveedorEliminado.getId()){
                providerList.remove(provider);
                System.out.println("¡¡Proveedor eliminado Correctamente!!");
                return true;
            }
        }

        return false;
    }

}
