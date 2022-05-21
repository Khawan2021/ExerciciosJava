package Aulas;

public class ExemploMetodos {
    public static void main(String[] args) {
        Pessoa cara = new Pessoa();

        System.out.println(cara.falarMeuProprioNome());
        System.out.println(cara.getNome());
        System.out.println(cara.getIdade());
        System.out.println(cara.andar());
    }
}