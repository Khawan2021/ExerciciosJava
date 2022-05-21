package Agencia;

public class Supervisor extends Gerente {
    private int salarioQueRecebe;

    public int salarioQueRecebe(){
        return salarioQueRecebe;
    }

    public void setSalarioQueRecebe(int salarioQueRecebe) {
        this.salarioQueRecebe = salarioQueRecebe;
    }

    public double calculaImposto(){
        return this.getValorVenal() * 0.05;
    }
}
