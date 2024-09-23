package technique;

import java.util.Scanner;

public class Two {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dígite uma palavra: ");
        String a = sc.nextLine();

        int contador = 0;
        boolean existeA = false;

        for (char c : a.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
                existeA = true;
            }
        }

        if (existeA) {
            System.out.println("A letra 'a' aparece " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não está presente na string.");
        }

        sc.close();
    }
}
