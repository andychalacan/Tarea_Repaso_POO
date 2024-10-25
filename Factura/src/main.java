import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del plato");
        String nombreplatillo = scanner.nextLine();
        System.out.println("Ingrese el precio del plato");
        double precioplatillo = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de platillos");
        int cantidad = scanner.nextInt();

        Plato plato=new Plato(nombreplatillo,precioplatillo);

        Factura factura = new Factura(plato.getNombre(),plato.getPrecio(),cantidad);
        factura.mostrarfactura();
        scanner.close();
    }
}
