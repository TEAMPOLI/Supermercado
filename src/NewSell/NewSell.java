package NewSell;
import Product.Producto;
import Employee.Employee;
import Client.Client;
public class NewSell {

    private Producto producto;
    private int cantidadVendida;
    private Employee vendedor;
    private Client cliente;

    public NewSell(Producto producto, int cantidadVendida, Employee vendedor, Client cliente) {
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    public Employee getVendedor() {
        return vendedor;
    }

    public void setVendedor(Employee vendedor) {
        this.vendedor = vendedor;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
}