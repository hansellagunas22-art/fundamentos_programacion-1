import java.util.Scanner;

class Etiquetas {

    static void mostrarEtiqueta(int guia, String destino, double peso) {
        System.out.println("Etiqueta del paquete");
        System.out.println("Guia: " + guia);
        System.out.println("Destino: " + destino);
        System.out.println("Peso: " + peso + " kg");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int contador = 1;

        while (contador <= 2) {
            System.out.println("Paquete " + contador);

            System.out.print("Numero de guia: ");
            int guia = tecla.nextInt();

            System.out.print("Ciudad de destino: ");
            String destino = tecla.next();

            System.out.print("Peso en kg: ");
            double peso = tecla.nextDouble();

            mostrarEtiqueta(guia, destino, peso);

            contador++;
        }
    }
}