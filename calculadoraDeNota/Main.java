package calculadoraDeNota;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a primeira nota");
        float primeira = scanner.nextFloat();
        System.out.println("Insira a segunda nota");
        float segunda = scanner.nextFloat();

        System.out.println("Insira a terceira nota");
        float terceira = scanner.nextFloat();

        System.out.println("Insira a quarta nota");
        float quarta = scanner.nextFloat();

        float media = (primeira + segunda + terceira + quarta) / 4;

        String status = (media < 5)? "reprovado" : "aprovado";

        char mencao;
        if (media < 2.5){
            mencao = 'E';
        } else if (media < 5) {
            mencao = 'D';

        } else if (media < 7) {
            mencao = 'C';

        } else if (media < 9) {
            mencao = 'B';

        }else {
            mencao = 'A';
        }

        System.out.println("Media: " + media);
        System.out.println("Menção: " + mencao);
        System.out.println("Status: " + status);

    }
}
