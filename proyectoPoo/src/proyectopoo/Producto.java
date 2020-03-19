package proyectopoo;

/**
 * @author franjo2001
 */
// clase proncipal para Registrar los datos-
public class Producto {

    // variables locales
    private String nombre;
    private String unidad_medida;
    private int cantidad;
    private double precio;
    private String tipo;

    // constructor de la clase
    public Producto(String nombre, String unidad_medida, int cantidad, double precio, String tipo) {
        this.nombre = nombre;
        this.unidad_medida = unidad_medida;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
    }


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
     * @return the unidad_medida
     */
    public String getUnidad_medida() {
        return unidad_medida;
    }

    /**
     * @param unidad_medida the unidad_medida to set
     */
    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
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
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
