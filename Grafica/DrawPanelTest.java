package Grafica;

import javax.swing.JFrame;

public class DrawPanelTest {

    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();

        JFrame aplicacao = new JFrame();
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.setSize(500, 500);
        aplicacao.add(panel);
        aplicacao.setLocationRelativeTo(null);
        aplicacao.setVisible(true);
    }
}


