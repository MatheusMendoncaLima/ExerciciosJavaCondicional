package cardapio;

import java.util.*;

public class Main {
    public static final HashMap<String, Float> CARDAPIO = new HashMap<>();
    static {
        CARDAPIO.put("BigMac", 5f);
        CARDAPIO.put("Quarteirão", 5f);
        CARDAPIO.put("MacChicken", 5f);
        CARDAPIO.put("Cheddar", 5f);
        CARDAPIO.put("Cheese burguer", 5f);


    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo!");
        System.out.println("nosso cardapio é:");
        System.out.println("-----------------------------");
        CARDAPIO.forEach((nome, preco)-> System.out.println(nome+" : R$" + preco));
        System.out.println("-----------------------------");
        String item = "";
        System.out.println("Faça seu pedido");
        while (!CARDAPIO.containsKey(item)){
            if (!item.equalsIgnoreCase("")) System.out.println("Nome invalido");
            item = scanner.nextLine();

        }
        System.out.println("O item " +item+" custa R$"+ CARDAPIO.get(item));
    }
}
