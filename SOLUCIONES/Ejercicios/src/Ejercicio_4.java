import java.util.Scanner;
public class Ejercicio_4 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc;
        double valorKW, numKV, valorInmueb, valorPlanilla;
        String cedula, nombCli;

        System.out.println("Ingrese el nombre del cliente:");
        nombCli = scanner.nextLine();
        System.out.println("Ingrese la cédula del cliente:");
        cedula = scanner.nextLine();

        System.out.println("Ingrese la opción a consultar:");
        System.out.println("1. Planilla de luz");
        System.out.println("2. Predio de un bien inmueble");
        opc = scanner.nextInt();

        if (opc == 1) {
            System.out.println("Ingresar el valor del Kilovatio:");
            valorKW = scanner.nextDouble();
            System.out.println("Ingrese el número de Kilovatios gastados al mes:");
            numKV = scanner.nextDouble();
            valorPlanilla = planillaLuz(valorKW, numKV);
            System.out.println("Reporte");
            System.out.println("Cliente " + nombCli + " con cédula " + cedula + " debe pagar el valor de $" + valorPlanilla);
        } else if (opc == 2) {
            System.out.println("Ingresar el valor del Inmueble:");
            valorInmueb = scanner.nextDouble();
            double predio = calcPredio(valorInmueb);
            System.out.println("Reporte");
            System.out.println("Cliente " + nombCli + " con cédula " + cedula + " tiene un inmueble valorado en $" +
                    valorInmueb + " y tiene que pagar de predio $" + predio);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    static double planillaLuz(double valorKW, double numKV) {
        return valorKW * numKV;
    }

    static double calcPredio(double valorInmueb) {
        return valorInmueb * 0.02;
    }
}