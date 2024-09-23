package technique;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {
    public static List<Integer> fibonacci(int n) {
        List<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);

        while (true) {
            int nextValue = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
            if (nextValue > n) {
                break;
            }
            fibSequence.add(nextValue);
        }
        return fibSequence;
    }

    public static String verificaFibonacci(int num) {
        List<Integer> fibSequence = fibonacci(num);
        if (fibSequence.contains(num)) {
            return "O número " + num + " pertence à sequência de Fibonacci.";
        } else {
            return "O número " + num + " não pertence à sequência de Fibonacci.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numeroInformado = sc.nextInt();
        String resultado = verificaFibonacci(numeroInformado);
        System.out.println(resultado);
        sc.close();
    }
}