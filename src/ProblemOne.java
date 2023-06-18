
public class ProblemOne {
    /*
     * Problema 1: múltiplos de 3 y 5
     * Si enumeramos todos los números naturales por debajo de 10 que son múltiplos de 3 o 5,
     * obtenemos 3, 5, 6 y 9. La suma de estos múltiplos es 23.
     * <p>
     * Encuentre la suma de todos los múltiplos de 3 o 5 debajo del valor del parámetro proporcionado number.
     */
    public int multiplesOf3and5(int numero) {
        int resultado = 0;

        for (int i = 0; i < numero; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                resultado += i;
            }
        }
        System.out.println(""+resultado);
        return resultado;
    }

}
