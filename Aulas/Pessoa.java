package Aulas;

public class Pessoa{

    private String nome=    "Khawan Gonçalves";
    public String getNome() {
        return nome;
    }
    public String falarMeuProprioNome() {
        return "Olá meu nome é " + getNome();
    }
    private String idade= "18 anos";
    public String getIdade(){
        return idade;
    }
    public String andar() {
        return " Andando ";
    }
}