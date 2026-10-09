import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int biciurb = 40;
    int bicimont = 60;
    int bicielec = 90;
    int horas;
    String res;

    System.out.printf("Escoge el tipo de bicicleta usada:\n 1.Bicicleta urbana \n 2.Bicicleta de montaña \n 3.Bicicleta electrica \n");
    int opc = teclado.nextInt();
    switch (opc){
        case 1:
            System.out.printf("Dime las horas que usaste la bicicleta: ");
             horas = teclado.nextInt();
            System.out.printf("Cuenta con membresia? ");
             res = teclado.next();
            if (horas > 0){
                double subtotal = biciurb * horas;
                if (res.equalsIgnoreCase("si")){
                    double descuento = ((biciurb * horas)*.20);
                 double total = subtotal - descuento;
                    System.out.print("Tipo de bicicleta: Bicicleta Urbana \n Subtotal:" + subtotal);
                    System.out.print("\n Descuento:" + descuento);
                    System.out.print("\n Total a paga: $" + total);
                } else if (res.equalsIgnoreCase("no")) {
                    double total = subtotal;
                    System.out.print("Tipo de bicicleta: Bicicleta Urbana \n Subtotal:" + subtotal);
                    System.out.print("\n Descuento: $0.00");
                    System.out.print("\n Total a paga: $" + total);
                }
            } else if (horas <= 0) {
                System.out.print("Cantidad de horas invalidas, intente nuevamente: ");
            }

        break;
        case 2:
            System.out.printf("Dime las horas que usaste la bicicleta: ");
            horas = teclado.nextInt();
            System.out.printf("Cuenta con membresia? ");
            res = teclado.next();
            if (horas > 0){
                double subtotal = bicimont * horas;
                if (res.equalsIgnoreCase("si")){
                    double descuento = ((bicimont * horas)*.20);
                    double total = subtotal - descuento;
                    System.out.print("Tipo de bicicleta: Bicicleta de montaña \n Subtotal:" + subtotal);
                    System.out.print("\n Descuento:" + descuento);
                    System.out.print("\n Total a paga: $" + total);
                } else if (res.equalsIgnoreCase("no")) {
                    double total = subtotal;
                    System.out.print("Tipo de bicicleta: Bicicleta montaña \n Subtotal:" + subtotal);
                    System.out.print("\n Descuento: $0.00");
                    System.out.print("\n Total a paga: $" + total);
                }
            } else if (horas <= 0) {
                System.out.print("Cantidad de horas invalidas, intente nuevamente: ");
            }

        break;
        case 3:
            System.out.printf("Dime las horas que usaste la bicicleta: ");
            horas = teclado.nextInt();
            System.out.printf("Cuenta con membresia? ");
            res = teclado.next();
            if (horas > 0){
                double subtotal = bicielec * horas;
                if (res.equalsIgnoreCase("si")){
                    double descuento = ((bicielec * horas)*.20);
                    double total = subtotal - descuento;
                    System.out.print("Tipo de bicicleta: Bicicleta electrica \n Subtotal:" + subtotal);
                    System.out.print("\n Descuento:" + descuento);
                    System.out.print("\n Total a paga: $" + total);
                } else if (res.equalsIgnoreCase("no")){
                    double total = subtotal;

                    System.out.print("Tipo de bicicleta: Bicicleta electrica \n Subtotal:" + subtotal);
                    System.out.print("\n Descuento: $0.00");
                    System.out.print("\n Total a paga: $" + total);
                }
            } else if (horas <= 0) {
                System.out.print("Cantidad de horas invalidas, intente nuevamente: ");
            }
        break;
        default:
            System.out.print("Opcion no valida, seleccione nievamente");

    }

    }
}