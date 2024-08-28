package numeroDoMes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final List<String> meses = new ArrayList<>(Arrays.asList("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"));
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero do mes");
        while (true) {
            int mes = scanner.nextInt();
            if (mes > meses.size() || mes <= 0) {
                System.out.println("Valor invalido");
            }else {
                System.out.println(meses.get(mes-1));
                break;
            }
        }

    }
}
