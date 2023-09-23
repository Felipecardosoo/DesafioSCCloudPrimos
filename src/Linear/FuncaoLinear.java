package Linear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static SCCloudsNumPrimoRecursivaLinear.Recursiva.FuncaoRecursiva.primosAteN;

public class FuncaoLinear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        List<Integer> primos = new ArrayList<>();
        for(int i = 2; i <= numero; i++) {
            boolean primo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                primos.add(i);
            }
        }
        System.out.println(" Os números primos até " + numero + " são: " + primos);
    }
}