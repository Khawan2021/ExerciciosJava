package Carro;
import java.util.Scanner;

public class Carro {

     public static void main(String[] args) {

         Carro carro = new Carro();

         System.out.println("Escolha uma opção: \n0 - Sair\n"+
                 "1 - Mostrar Pessoas no carro\n"+
                 "2 - Adicionar pessoa no carro\n"+
                 "3 - Remover pessoa do carro\n");
         Scanner in = new Scanner( System.in );
         int opcao=in.nextInt();

         while(opcao != 0){

             if(opcao ==2){
                 carro.addPessoa();
             }
             if(opcao ==3){
                 carro.removerPessoa();
             }
             System.out.println("A quantidade de pessoas é " + carro.pessoasNoCarro());
             opcao = in.nextInt();
         }
         System.out.println("Programa finalizado com sucesso, o carro está com "
                 + carro.pessoasNoCarro() + " pessoa(s) ");

    }

    private int quantidade= 0;
    public int pessoasNoCarro()
    {
        return quantidade;
    }
    public int addPessoa()
    {
        quantidade= quantidade + 1;
        return  quantidade;
    }
    public int removerPessoa()
    {
        quantidade= quantidade - 1;
        return quantidade;
    }

 }