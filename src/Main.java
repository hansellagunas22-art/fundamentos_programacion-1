import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     System.out.print("Dime tu calificacion: ");
     double Prom = teclado.nextDouble();
     System.out.print("Dime tu porcentaje de asistencia: ");
     double porcentaje = teclado.nextDouble();
     if (Prom < 7.0){
         System.out.print("Reprobado por promedio");
     } else if (Prom >= 7.0 && porcentaje < 80) {
         System.out.print("Reprobado por faltas");
     } else if (Prom >= 7.0 && porcentaje >= 80) {
         System.out.print("Aprobado Regular");
     } else if (Prom < 7.0 && porcentaje < 80) {
         System.out.print("No Acredita");
     } else if (Prom > 10 && porcentaje > 100) {
         System.out.print("Valores no Validos");
     }
    }
}