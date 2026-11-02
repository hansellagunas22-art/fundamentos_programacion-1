import java.util.Scanner;

class Descarga {

    static double calcularTiempo(double tamano, double velocidad) {
        double tiempo = tamano / velocidad;
        return tiempo;
    }

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Tamano del archivo en MB: ");
        double tamano = tecla.nextDouble();

        while (tamano < 0) {
            System.out.print("El tamano no puede ser negativo. Ingresalo de nuevo: ");
            tamano = tecla.nextDouble();
        }

        System.out.print("Velocidad de descarga en MB/s: ");
        double velocidad = tecla.nextDouble();

        while (velocidad <= 0) {
            System.out.print("La velocidad debe ser mayor que cero. Ingresala de nuevo: ");
            velocidad = tecla.nextDouble();
        }

        double tiempo = calcularTiempo(tamano, velocidad);
        System.out.println("Tiempo estimado de descarga: " + tiempo + " segundos");
    }
}