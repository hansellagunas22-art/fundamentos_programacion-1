import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        int Existencias = 100;
        do {

            System.out.print("Menu de operaciones \n1.recibir \n2.retirar \n3.consultar \n4.finalizar");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Dame las unidades a recibir: ");
                    int unidades = teclado.nextInt();
                    int Exissuma= Existencias + unidades;
                    if (unidades < 0 || unidades == 0) {
                        System.out.print("Cantidad invalidad, intente nuevamente. ");
                    } else if (Exissuma > 0 && Exissuma < 250) {
                        System.out.print("Cantidad recibida con exito. ");
                        Existencias = unidades + Existencias;
                    }
                    break;
                case 2:
                    System.out.print("Dame las unidades a retirar: ");
                    int unidretiro = teclado.nextInt();
                    if (unidretiro < 0 || unidretiro == 0) {
                        System.out.print("Cantidad invalidad, intente nuevamente. ");
                    } else if (Existencias > unidretiro) {
                        Existencias = Existencias - unidretiro;
                        if (Existencias < 30) {
                            System.out.print("Inventario bajo.");
                        }
                        System.out.print("Cantidad retirada. ");
                    } else if (Existencias < unidretiro) {
                        System.out.print("Cantidad insuficiente. ");
                    }
                    break;
                case 3:


            }


        } while (opc == 4);
    }
}