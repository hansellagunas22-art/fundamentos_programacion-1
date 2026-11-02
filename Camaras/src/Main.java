import java.util.Scanner;

class RentaCamaras {

    static double calcularRenta(double tarifa, double horas) {
        double total = tarifa * horas;
        return total;
    }

    static void mostrarComprobante(double total) {
        System.out.println("Total a pagar: $" + total);
    }

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Tarifa de renta por hora: ");
        double tarifa = tecla.nextDouble();

        while (tarifa <= 0) {
            System.out.print("La tarifa debe ser mayor que cero, Ingresala de nuevo: ");
            tarifa = tecla.nextDouble();
        }

        System.out.print("Cantidad de horas de uso: ");
        double horas = tecla.nextDouble();

        while (horas <= 0) {
            System.out.print("Las horas deben ser mayores que cero, Ingresalas de nuevo: ");
            horas = tecla.nextDouble();
        }

        double total = calcularRenta(tarifa, horas);
        mostrarComprobante(total);
    }
}