
import java.util.Scanner;

public class Parcial {
    public static void main(String[] args) {
        int totalAguardiente = 0;
        int totalClientes = 0;
        int total = 0;
        String continuar = "";
        String deseo = "";
        Scanner scanner = new Scanner(System.in);

        do {
            // Pedir el nombre del cliente
            System.out.print("Ingrese el nombre del cliente: ");
            String cliente = scanner.nextLine();

           do{
            // Mostrar menú de productos
            String menu = "Productos disponibles:\n" +
                    "1. Aguardiente - $31,900\n" +
                    "2. Ron - $45,200\n" +
                    "3. Vodka - $75,500\n" +
                    "4. Ginebra - $139,950\n" +
                    "Seleccione el número del producto que desea comprar: ";
            System.out.println(menu);
            int opcionProducto = Integer.parseInt(scanner.nextLine());

            String producto = "";
            int precio = 0;

            switch (opcionProducto) {
                case 1:
                    producto = "Aguardiente";
                    precio = 31900;
                    break;
                case 2:
                    producto = "Ron";
                    precio = 45200;
                    break;
                case 3:
                    producto = "Vodka";
                    precio = 75500;
                    break;
                case 4:
                    producto = "Ginebra";
                    precio = 139950;
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    continue;
            }


            // Pedir cantidad
            System.out.print("Ingrese la cantidad de botellas que desea comprar: ");
            int cantidad = Integer.parseInt(scanner.nextLine());
        
            // Calcular total
            total = precio * cantidad;

            // Contar botellas de aguardiente
            if (producto.equals("Aguardiente")) {
                totalAguardiente += cantidad;
            }
            // Mostrar resumen de la compra
            String resumen = "Resumen de la compra:\n" +
                    "Cliente: " + cliente + "\n" +
                    "Producto: " + producto + "\n" +
                    "Cantidad: " + cantidad + "\n" +
                    "Total a pagar: $" + total;
            System.out.println(resumen);

            
            System.out.println("¿desea algun otro producto? si/no ");
            deseo = scanner.nextLine();
        }while(deseo.equalsIgnoreCase("si"));
        totalClientes++;
            // Preguntar si hay más clientes
            System.out.print("¿Hay más clientes? (si/no): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("si"));

        // Mostrar resumen final
        String resumenFinal = "--- Resumen Final ---\n" +
                "Total de clientes atendidos: " + totalClientes + "\n" +
                "Total de botellas de aguardiente vendidas: " + totalAguardiente;
        System.out.println(resumenFinal);
    }
}
