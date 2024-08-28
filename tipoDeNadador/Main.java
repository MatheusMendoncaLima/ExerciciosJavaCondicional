package tipoDeNadador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");


        int idade = scanner.nextInt();

        String classificacao;
        if(idade < 5) {
            classificacao = "novo demais";
        } else if (idade < 8){
            classificacao = "Infatil A";
        } else if (idade < 11) {
            classificacao = "Infatil B";

        } else if (idade < 14) {
            classificacao = "Juvenil A";

        } else if (idade < 18) {
            classificacao = "Juvenil B";

        }else {
            classificacao = "Senior";
        }

        System.out.println("Com "+ idade + " anos, você é classificado como: " + classificacao);
    }
}
