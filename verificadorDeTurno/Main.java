package verificadorDeTurno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira seu peso em kg");
        double peso = scanner.nextDouble();
        System.out.println("insira sua altura em metros");
        double altura = scanner.nextDouble();
        double imc = peso/Math.pow(altura,2);
        String status;
        if (imc < 18){
            status="magreza";
        } else if (imc < 25) {
            status="saudavel";
        } else if (imc < 30) {
            status ="sobrepeso";
        }else {
            status = "obesidade";
        }

        System.out.println("com imc de "+imc+" seu estado é: " + status );

    }
}
