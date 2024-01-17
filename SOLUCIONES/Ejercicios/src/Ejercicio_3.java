import java.util.Scanner;
public class Ejercicio_3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double param1, param2, param3, param4;
        String cualit;

        System.out.println("Ingrese la nota del parámetro 1:");
        param1 = scanner.nextDouble();
        System.out.println("Ingrese la nota del parámetro 2:");
        param2 = scanner.nextDouble();
        System.out.println("Ingrese la nota del parámetro 3:");
        param3 = scanner.nextDouble();
        System.out.println("Ingrese la nota del parámetro 4:");
        param4 = scanner.nextDouble();

        cualit = califiCuali(param1, param2, param3, param4);

        System.out.println("El promedio cualitativo es: " + cualit);

        scanner.close();
    }

    static String califiCuali(double param1, double param2, double param3, double param4) {
        double prom = (param1 + param2 + param3 + param4) / 4;

        if (prom <= 5) {
            return "Regular";
        } else if (prom <= 8) {
            return "Bueno";
        } else if (prom <= 9) {
            return "Muy bueno";
        } else {
            return "Sobresaliente";
        }
    }
}