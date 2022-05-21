package Grafica;

/**
 * @(#)Botao.java
 *
 *
 * @author Luciano Santos
 * @version 1.00 2010/4/8
 */

import java.awt.*; //importando todas as classes do pacote AWT e Swing para a classe Janela
import javax.swing.*;
import java.awt.event.*;//importando as classes do pacote de eventos do AWT, para que o botao funcione

public class Botao extends JFrame {
    //declarando componentes
    Label lblDigite,lblResultado;
    TextField txtNome;
    Button btnOk;

    public Botao(){
        setTitle("Botão de Ação");//definindo o titulo da janela

        setSize (800,80);//definindo tamanho e layout da janela
        setLayout(new FlowLayout()); //falaremos mais tarde sobre layouts

        setLocationRelativeTo(null);//centralizando a janela

        //definindo operação padrão para o botão fechar
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sem esta linha a janela não fecha pelo botão fechar.

        lblDigite = new Label("Digite seu nome ao lado e clique em Ok.");//configurando o label
        add (lblDigite);//adicionando o label configurado a janela

        txtNome = new TextField(15);//configurando o campo de texto pro tamanho 15
        add(txtNome);//adicionando o campo de texto configurado a janela

        btnOk = new Button("OK");//configurando o botao ok
        add(btnOk);//adicionando o botao configurado a janela

        lblResultado = new Label("  ");//Configurando o label para começar vazio
        add(lblResultado);//adicionando o label configurado

        //pondo o botao OK em espera
        btnOk.addActionListener(new Ok());
    }

    //atribuindo uma funcionalidade ao botao OK
    public class Ok implements ActionListener
    {
        public void actionPerformed(ActionEvent ev)
        {
            lblResultado.setText("Parabéns "+ txtNome.getText()+"!");
        }
    }

    public static void main(String[] args) {
        /*instanciando o método construtor
         *mais tarde falaremos sobre instâncias do Java
         */

        Botao ok = new Botao();//nesta linha o código carrega o construtor para memória, montando a tela NA MEMÓRIA
        //definindo a visibilidade da tela
        ok.setVisible(true);
    }

}
