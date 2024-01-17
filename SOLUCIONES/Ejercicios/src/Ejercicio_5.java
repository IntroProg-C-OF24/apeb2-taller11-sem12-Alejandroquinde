import java.util.Scanner;
public class Ejercicio_5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorfil, valorcolum;

        System.out.println("Ingrese la cantidad de filas y columnas de la matriz:");
        valorfil = scanner.nextInt();
        valorcolum = scanner.nextInt();

        int[][] matrizA = new int[valorfil][valorcolum];

        llenarMatriz(matrizA, valorfil, valorcolum);

        System.out.println("Matriz Generada:");
        presentarMatriz(matrizA, valorfil, valorcolum);

        int suma, resta, multiplicacion;
        suma = sumarMatriz(matrizA, valorfil, valorcolum);
        resta = restarMatriz(matrizA, valorfil, valorcolum);
        multiplicacion = multiplicarMatriz(matrizA, valorfil, valorcolum);

        System.out.println("La suma de los elementos de la matriz es: " + suma);
        System.out.println("La resta de los elementos de la matriz es: " + resta);
        System.out.println("La multiplicación de los elementos de la matriz es: " + multiplicacion);

        scanner.close();
    }

    static void llenarMatriz(int[][] matriz, int valorfil, int valorcolum) {
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
    }

    static void presentarMatriz(int[][] matriz, int valorfil, int valorcolum) {
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                System.out.print(matriz[i][j] + "  |  ");
            }
            System.out.println();
        }
    }

    static int sumarMatriz(int[][] matriz, int valorfil, int valorcolum) {
        int suma = 0;
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    static int restarMatriz(int[][] matriz, int valorfil, int valorcolum) {
        int resta = 0;
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                if (i == 0 && j == 0) {
                    resta = matriz[i][j];
                } else {
                    resta -= matriz[i][j];
                }
            }
        }
        return resta;
    }

    static int multiplicarMatriz(int[][] matriz, int valorfil, int valorcolum) {
        int multiplicacion = 1;
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                multiplicacion *= matriz[i][j];
            }
        }
        return multiplicacion;
    }
}