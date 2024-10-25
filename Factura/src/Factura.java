public class Factura {
    String nombrePlato;
    double precioPlato;
    int cantidad;

    public Factura(String nombrePlato, double precioPlato, int cantidad){
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
        this.cantidad = cantidad;

    }

    public  double calcularTotal(){
        return  precioPlato*cantidad;
    }
    public void mostrarfactura(){
        System.out.println("Factura");
        System.out.println("Platilla: "+nombrePlato);
        System.out.println("Precio del Platilla: "+precioPlato);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Total a pagar: "+calcularTotal());
    }
}
