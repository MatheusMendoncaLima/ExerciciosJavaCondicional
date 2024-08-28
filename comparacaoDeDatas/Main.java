package comparacaoDeDatas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> datas = new ArrayList<>();
        System.out.println("Insira o dia da primeira data");
        int dia1 = scanner.nextInt();
        System.out.println("Insira o mes da primeira data");
        int mes1 = scanner.nextInt();
        System.out.println("Insira o ano da primeira data");
        int ano1 = scanner.nextInt();
        System.out.println("Insira o dia da segunda data");
        int dia2 = scanner.nextInt();
        System.out.println("Insira o mes da segunda data");
        int mes2 = scanner.nextInt();
        System.out.println("Insira o ano da segunda data");
        int ano2 = scanner.nextInt();

        if (ano1 < ano2) {
            datas.add(dia1 + "-" + mes1 + "-" + ano1);
            datas.add(dia2 + "-" + mes2 + "-" + ano2);
        } else if (ano1 > ano2) {
            datas.add(dia2 + "-" + mes2 + "-" + ano2);
            datas.add(dia1 + "-" + mes1 + "-" + ano1);
        } else {
            if (mes1 < mes2) {
                datas.add(dia1 + "-" + mes1 + "-" + ano1);
                datas.add(dia2 + "-" + mes2 + "-" + ano2);
            } else if (mes1 > mes2) {
                datas.add(dia2 + "-" + mes2 + "-" + ano2);
                datas.add(dia1 + "-" + mes1 + "-" + ano1);
            } else {
                if (dia1 < dia2) {
                    datas.add(dia1 + "-" + mes1 + "-" + ano1);
                    datas.add(dia2 + "-" + mes2 + "-" + ano2);
                } else if (dia1 > dia2) {
                    datas.add(dia2 + "-" + mes2 + "-" + ano2);
                    datas.add(dia1 + "-" + mes1 + "-" + ano1);

                }
            }

        }
        datas.forEach(System.out::println);
    }
}
