package proyectopoo;
// clase usada como auxiliar y poider crear objetos y calcular los precios finales
/**
 *
 * @author franjo2001
 */
public class VentaProducto {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the iva
     */
    public double getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(double iva) {
        this.iva = iva;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    private String nombre;
    private int cantidad;
    private double precio;
    private double iva;
    private double subtotal;
    private double total;
    
    // metodo para calcular el subtotal
    public void calcularSubtotal() {

        subtotal = cantidad * precio;

    }

    // metodo para calcular el iva
    public void calcularIva() {

        iva = 0.12 * subtotal;

    }

    // metodo para calcular el total
    public void calcularTotal() {

        total = subtotal + iva;

    }

}
