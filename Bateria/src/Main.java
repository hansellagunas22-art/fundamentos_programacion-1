//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class CargaBateria {

    static int calcularMinutos(int porcentaje) {
        int minutos = 0;

        while (porcentaje < 100) {
            porcentaje = porcentaje + 8;
            minutos++;
        }

        return minutos;
    }

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int opcion = 1;

        while (opcion == 1) {
            System.out.print("Porcentaje inicial de bateria (0-100): ");
            int porcentaje = tecla.nextInt();

            while (porcentaje < 0 || porcentaje > 100) {
                System.out.print("Porcentaje invalido. Ingresa un valor entre 0 y 100: ");
                porcentaje = tecla.nextInt();
            }

            int minutos = calcularMinutos(porcentaje);
            System.out.println("Minutos necesarios: " + minutos);

            System.out.print("Otra intento?: 1 = si, 0 = no ");
            opcion = tecla.nextInt();
        }

        System.out.println("Fin del programa.");
    }
}