package calculadoraIMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que horas começa seu turno?");
        String turno = "";

        while (turno.equalsIgnoreCase("")) {
            int horario = scanner.nextInt();
            switch (horario) {
                case 5:
                    turno = "manha";
                    break;
                case 13:
                    turno = "tarde";
                    break;
                case 21:
                    turno = "noite";
                    break;
                default:
                    System.out.println("numero invalido");
                    break;
            }
        }

        System.out.println("Você é do turno da " + turno);
        scanner.close();
    }
}
