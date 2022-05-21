package Streans;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploStream {
    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafaela");

        System.out.println(estudantes);

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("Maior número de letras: " +
                estudantes.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor número de letras: " +
                estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Com a letra r no nome: " +
                estudantes.stream().filter((estudante)
                        -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Retorna uma nova Coleção com a Quantidade de letras: " +
                estudantes.stream().map(estudante ->
                estudante.concat("-").concat(String.valueOf
                        (estudante.length()))).collect(Collectors.toList()));

        System.out.println("Retorna os 3 primeiros elemento: " +
                estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("Retorna os elementos: " +
                estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Retorna os elementos novamente: ");
        estudantes.stream().forEach(System.out::println);

        System.out.println("Todos os elementos tem W no nome? " +
                estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

        System.out.println("Tem algum elemento com letra minúscula no nome? " +
                estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

        System.out.println("Não tem nenhum elemento com letra minúscula no nome? " +
                estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

        System.out.println("Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Operação encadeada: ");
        System.out.println(estudantes.stream()
        .peek(System.out::println)
        .map(estutande -> estutande.concat("-").concat(String.valueOf(estutande.length())))
        .peek(System.out::println)
        .filter(estudante -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

    }
}
