package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;


public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("Pedro");
        nomes.add("Paulo");
        nomes.add("Maria");
        nomes.add("Juliana");
        nomes.add("Nicole");

        System.out.println(nomes);

        nomes.set(3, "Larissa");
        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Wesley");
        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);
        nomes.remove("Wesley");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        int posicao = nomes.indexOf("Nicole");
        System.out.println(posicao);


        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Nicole");
        tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temJuliana = nomes.contains("Juliana");
        System.out.println(temJuliana);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes){
            System.out.println("--->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("----->" + iterator.next());
        }

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);


    }

}
