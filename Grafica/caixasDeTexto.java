package Grafica;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class caixasDeTexto {

    public static void main(String[] args){
        String mensagem;
        Scanner entrada = new Scanner(System.in);
        //JOptionPane.showMessageDialog(null,"Meu primeiro programa gráfico!\n Obrigado, Curso Java Progressivo!");
        //System.out.print("Digite a mensagem a ser exibida na caixa de diálogo: ");
        //mensagem = entrada.nextLine();
        //System.out.println(mensagem);
        mensagem = JOptionPane.showInputDialog("Digite algo: ");
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
