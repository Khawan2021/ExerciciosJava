package Agencia;

public class Atendente extends Gerente{
    private int Recebeu;

    public int Recebeu(){
        return Recebeu;
    }

    public void setRecebeu(int Recebeu) {
        this.Recebeu = Recebeu;
    }

    public double calculaImposto(){
        return this.getValorVenal() * 0.01;
    }
}
