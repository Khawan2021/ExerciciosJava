package Grafica;

/**
 * @(#)Janela.java
 *
 *
 * @author Luciano Santos
 * @version 1.00 2010/4/8
 */
//importando todas as classes do pacote AWT e Swing para a classe Janela
import java.awt.*;
import javax.swing.*;

/** abrindo a classe com extensão para JFrame [permitindo a criação de interface gráfica]
 * A classe deve ser declarada para que a Máquina Virtual "enxergue" a classe e interprete-a
 */
public class Janela extends JFrame {
    //declarando os componentes da janela
    Label lblFrase;

    /* abrindo o método construtor da classe
     * Esse trecho do código [ou da clase] será o resposável pela CONSTRUÇÃO da interface gráfica na memória,
     * por isso tem esse nome.
     * o construtor deve ser público e ter o mesmo nome da classe,
     * lembrando que java é case sensitive, então o nome do construtor deve ser identico ao da classe.
     */

    public Janela() {
        //definindo o título da janela
        super("Primeira Janela");

        //definindo tamanho e layout da janela

        setSize (800,400);
        setLayout(new FlowLayout()); //falaremos mais tarde sobre layouts

        //definindo operação padrão para o botão fechar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sem esta linha a janela não fecha pelo botão fechar.

        //configurando um label
        lblFrase = new Label("Minha primeira janela com texto");
        //adicionando o label configurado a janela
        add (lblFrase);

    }
    /* Abrindo o método principal da classe [Main em inglês significa principal]
     * Este método deve ser público, estático e vazio, ou seja, sempre vai ter a mesma estrutura;
     * Na sua criação é definida uma String, que receberá possiveis argumentos passados pelo usuário.
     * o nome da string costuma ser args [por abreviação de argumentos]
     * mas pode ser outro nome qualquer, como a, argumentos, parametros, param, etc
     *
     * mais tarde podemos trabalhar com classes usando argumentos para String
     */

    public static void main(String[] args) {
        /*instanciando o método construtor
         *mais tarde falaremos sobre instâncias do Java
         */

        Janela instancia = new Janela();//nesta linha o código carrega o construtor para memória, montando a tela NA MEMÓRIA
        //definindo a visibilidade da tela
        instancia.setVisible(true);
    }

}
