import java.util.Scanner;
public class Ejercicio_2 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcNum;
        double lado, baseTri, alturaTri, baseRec, alturaRec, areaTotal;

        System.out.println("Escoge la opción para calcular:");
        System.out.println("1. Área del Cuadrado");
        System.out.println("2. Área del Triángulo");
        System.out.println("3. Área del Rectángulo");
        opcNum = scanner.nextInt();

        if (opcNum == 1) {
            System.out.println("Escribe el lado del cuadrado:");
            lado = scanner.nextDouble();
            areaTotal = areaCuadrado(lado);
            System.out.println("El área del cuadrado es: " + areaTotal);
        } else if (opcNum == 2) {
            System.out.println("Ingrese la base del triángulo:");
            baseTri = scanner.nextDouble();
            System.out.println("Ingrese la altura del triángulo:");
            alturaTri = scanner.nextDouble();
            areaTotal = areaTriangulo(baseTri, alturaTri);
            System.out.println("El área de un triángulo es: " + areaTotal);
        } else if (opcNum == 3) {
            System.out.println("Ingrese la base del rectángulo:");
            baseRec = scanner.nextDouble();
            System.out.println("Ingrese la altura del rectángulo:");
            alturaRec = scanner.nextDouble();
            areaTotal = areaRectangulo(baseRec, alturaRec);
            System.out.println("El área del rectángulo es: " + areaTotal);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    static double areaCuadrado(double lado) {
        return lado * lado;
    }

    static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    static double areaRectangulo(double base, double altura) {
        return base * altura;
    }
}
