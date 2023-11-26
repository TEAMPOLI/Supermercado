package EmployeeService;
import Employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();

    public static void insertarEmpleado(Employee employee) {

        employeeList.add(employee);
        System.out.println("Empleado agregado exitosamente!!!");
    }

    public static List<Employee> obtenerListaDeEmpleados() {

        int i = 1;

        //Mostrar lista de productos
        for (Employee e : employeeList) {

            System.out.println("Empleado #" + i + " ID:" + e.getId() +
                    " Nombre: " + e.getNombre() +
                    ", Edad: " + e.getEdad());

            i++;
        }

        return employeeList;
    }

    public static void editarEmpleado(Employee empleadoNuevosValores) {

        for (Employee empleado : employeeList) {

            if (empleado.getId() == empleadoNuevosValores.getId()) {

                empleado.setNombre(empleadoNuevosValores.getNombre());
                empleado.setEdad(empleadoNuevosValores.getEdad());
                System.out.println("¡¡Empleado editado correctamente!!");
            }
        }
    }

    public static boolean eliminarEmpleado(Employee empleadoEliminar){

        for (Employee empleado : employeeList){

            if (empleado.getId() == empleadoEliminar.getId()){
                employeeList.remove(empleado);
                System.out.println("¡¡Cliente eliminado Correctamente!!");
                return true;
            }
        }

        return false;
    }
}
