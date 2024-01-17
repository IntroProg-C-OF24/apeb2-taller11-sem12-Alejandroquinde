import java.util.Random;
public class Ejercicio_1 {
    public static void main(String[] args) {
        int valorfil = 3;
        int valorcolum = 6;
        int[][] matriz1 = new int[valorfil][valorcolum];
        int[][] matriz2 = new int[valorfil][valorcolum];
        int[][] matriz3 = new int[valorfil][valorcolum];
        double promedio;

        llenarMatriz(matriz1, valorfil, valorcolum);
        System.out.println("Matriz Generada:");
        presentarMatriz(matriz1, valorfil, valorcolum);

        llenarPares(matriz1, matriz2, valorfil, valorcolum);
        System.out.println("Pares de la matriz:");
        presentarMatriz(matriz2, valorfil, valorcolum);

        llenarImpares(matriz1, matriz3, valorfil, valorcolum);
        System.out.println("Impares de la matriz:");
        presentarMatriz(matriz3, valorfil, valorcolum);

        promedio = calcularPromedio(matriz1, valorfil, valorcolum);
        System.out.println("El promedio de los valores de la matriz es: " + promedio);
    }

    static void llenarMatriz(int[][] matriz, int valorfil, int valorcolum) {
        Random random = new Random();
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
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

    static void llenarPares(int[][] matriz1, int[][] matriz2, int valorfil, int valorcolum) {
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                if (matriz1[i][j] % 2 == 0) {
                    matriz2[i][j] = matriz1[i][j];
                } else {
                    matriz2[i][j] = 0;
                }
            }
        }
    }

    static void llenarImpares(int[][] matriz1, int[][] matriz3, int valorfil, int valorcolum) {
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                if (matriz1[i][j] % 2 != 0) {
                    matriz3[i][j] = matriz1[i][j];
                } else {
                    matriz3[i][j] = 0;
                }
            }
        }
    }

    static double calcularPromedio(int[][] matriz1, int valorfil, int valorcolum) {
        int sum = 0;
        for (int i = 0; i < valorfil; i++) {
            for (int j = 0; j < valorcolum; j++) {
                sum += matriz1[i][j];
            }
        }
        return (double) sum / (valorfil * valorcolum);
    }
}
