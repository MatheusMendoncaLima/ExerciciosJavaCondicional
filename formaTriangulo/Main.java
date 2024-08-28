package formaTriangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float primeiroLado = scanner.nextFloat();
        float segundoLado = scanner.nextFloat();
        float terceiroLado = scanner.nextFloat();

        boolean forma = true;
        if (primeiroLado + segundoLado <= terceiroLado ||
            segundoLado + terceiroLado <= primeiroLado ||
            primeiroLado + terceiroLado <= segundoLado){
            forma = false;
        }
        if (forma){
            int ladosIguais = 1;
            if (primeiroLado == segundoLado) ladosIguais++;
            if (segundoLado == terceiroLado) ladosIguais++;
            if (terceiroLado == primeiroLado) ladosIguais++;

            String tipo;

            switch (ladosIguais){
                case 2:
                    tipo = "isoceles";
                    break;
                case 4:
                    tipo = "equilatero";
                    break;
                default:
                    tipo = "escaleno";
                    break;
            }

            System.out.println(ladosIguais);
            System.out.println(tipo);
        }else {
            System.out.println("Nao forma um triangulo");
        }

    }
}
