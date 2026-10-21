import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;
        int puntosac = 0;
        for (int i = 1; i < 8; i++) {

            System.out.println("dime tus puntos Acumulados: ");
            int puntos = teclado.nextInt();
            puntosac+= puntos;
            if(puntos > 1000){
                mayor++;
            } else if (  puntos <= 1000){
                menor++;}


            }
        System.out.println("Puntos Acumulados: "+puntosac);
        System.out.println("Promedio de puntuacion: "+puntosac / 7);
        System.out.println("Partidas con mas de 1000 puntos: "+mayor);
        System.out.println("Partidas con o menos 1000 puntos: "+menor);
        }


    }
