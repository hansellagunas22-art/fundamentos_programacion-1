import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresa la temperatura ambiente en celcius: ");
    double temp = teclado.nextDouble();
    if(temp < 10){
        System.out.print("Cuidado Frio Extremo!!");
    } else if (temp >= 10 && temp <= 20) {
        System.out.print("Clima fresco");
    } else if (temp >= 21 && temp <= 30) {
        System.out.print("Clima agradable");
    } else if (temp > 30) {
        System.out.print("Cuidado, Calor extremo");
    }
    }
}