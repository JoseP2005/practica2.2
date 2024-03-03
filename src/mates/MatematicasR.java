package mates;

import java.util.Random;

/**
 * Esta clase proporciona métodos para operaciones matemáticas.
 */
public class MatematicasR {
    private static Random generador = new Random();

    /**
     * Genera una aproximación de Pi usando un método de Monte Carlo de forma recursiva.
     *
     * @param n el número de puntos aleatorios a generar
     * @return la aproximación de Pi
     */
    public static double generarNumeroPiRecursivo(int n) {
        if (n <= 0) {
            return 0;
        } else {
            double estimacionPrev = generarNumeroPiRecursivo(n - 1);
            double x = generador.nextDouble();
            double y = generador.nextDouble();
            boolean dentroDelCirculo = x * x + y * y <= 1;

            double proporcionActual;
            if (dentroDelCirculo) {
                proporcionActual = 4.0;
            } else {
                proporcionActual = 0;
            }
            if (n == 1) {
                return proporcionActual;
            }
            return ((estimacionPrev * (n - 1)) + proporcionActual) / n;
        }
    }
}
