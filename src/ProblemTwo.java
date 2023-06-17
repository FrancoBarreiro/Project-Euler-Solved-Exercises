import java.util.ArrayList;
import java.util.List;

public class ProblemTwo {

    /**
     * Cada nuevo término en la sucesión de Fibonacci se genera sumando los dos términos anteriores.
     * Al comenzar con 1 y 2, los primeros 10 términos serán:
     * <p>
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     * Al considerar los términos en la secuencia de Fibonacci cuyos valores no exceden de n, encuentre la suma de los términos pares.
     */
    public int fiboEvenSum(int n) {
        int sumaNumPares = 0;
        List<Integer> fibonacci = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (fibonacci.size() > 1) {
                int numeroSiguiente = fibonacci.get(i - 2) + fibonacci.get(i - 3);
                fibonacci.add(numeroSiguiente);
                if (numeroSiguiente <= n && numeroSiguiente % 2 == 0) {
                    sumaNumPares += numeroSiguiente;
                }
                if (numeroSiguiente > n) {
                    System.out.println("" + sumaNumPares);
                    return sumaNumPares;
                }
            } else {
                fibonacci.add(i);
                if (sumaNumPares <= n && i % 2 == 0) {
                    sumaNumPares += i;
                } else if (i == n) {
                    System.out.println("" + sumaNumPares);
                    return sumaNumPares;
                }
            }
        }
        System.out.println("" + sumaNumPares);
        return sumaNumPares;
    }


}

