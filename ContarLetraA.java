package ContarLetraA;

import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita uma string do usuário
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        int contador = 0;

        // Verifica a ocorrência da letra 'a' e 'A'
        for (char letra : texto.toCharArray()) {
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        // Exibe o resultado
        System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contador + " vez(es) na string.");

        scanner.close();
    }
}
