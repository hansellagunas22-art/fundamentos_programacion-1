import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("dime el piso en el que te encuentras: ");
        int piso = teclado.nextInt();
        System.out.println("dime el piso al que vas: ");
        int desti = teclado.nextInt();
        if (piso ==0 || desti == 0) {
            System.out.println("NO HAY PISO 0");

        } else if (desti == piso) {
            System.out.print("No puedes ir al mismo piso en el que estas");
        } else if (piso < 0 || desti <0) {
            System.out.print("No puedes dar numeros negativos");

        }else {
            while (piso < desti) {
                piso++;
                System.out.print(piso);

            }
            while (piso > desti) {
                piso--;
                System.out.print(piso);
            }
        }


    }

}