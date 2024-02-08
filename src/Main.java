import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String input = "Maria-F, João-M, Ana-F, Pedro-M, Laura-F";

        String[] nomes = input.split(",");

        ArrayList<String> listaDeNomesMasculinos = new ArrayList<>();
        ArrayList<String> listaDeNomesFemininos = new ArrayList<>();

        for (String nome : nomes) {
            String[] partes = nome.trim().split("-");
            String nomeAtual = partes[0].trim();
            char genero = partes[1].trim().charAt(0);

            if (genero == 'M') {
                listaDeNomesMasculinos.add(nomeAtual);
            } else if (genero == 'F') {
                listaDeNomesFemininos.add(nomeAtual);
            }
        }

        Collections.sort(listaDeNomesMasculinos);
        Collections.sort(listaDeNomesFemininos);

        System.out.println("Nomes do grupo Masculino:");
        for (String nome : listaDeNomesMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes do grupo Feminino:");
        for (String nome : listaDeNomesFemininos) {
            System.out.println(nome);
        }
    }
}