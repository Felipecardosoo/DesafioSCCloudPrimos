package SCCloudsNumPrimoRecursivaLinear.Recursiva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncaoRecursiva {
    public static List<Integer> primosAteN(int N){
        if (N <=1) {
            throw new IllegalArgumentException("N deve ser > que 1");
        }
        List<Integer> primos = new ArrayList<>();
        primosAteNRecursivo(N, 2, primos);
        return primos;
    }
    private static void primosAteNRecursivo(int N, int numero, List<Integer> primos) {
        if (numero > N) {
            return;
        }

        boolean nuPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                nuPrimo = false;
                break;
            }
        }

        if (nuPrimo) {
            primos.add(numero);
        }

        primosAteNRecursivo(N, numero + 1, primos);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        List<Integer> primos = primosAteN(numero);
        System.out.println(" Os números primos até " + numero + " são: " + primos);
    }
}