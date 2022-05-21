package Agencia;

public class Metodo {
    public static void main(String[] args){
        Gerente gerente = new Gerente();
        gerente.setValorVenal(1000.0);
        System.out.println(gerente.calculaImposto());

        Supervisor supervisor = new Supervisor();
        supervisor.setValorVenal(1000.0);
        System.out.println(supervisor.salarioQueRecebe());
        System.out.println(supervisor.calculaImposto());

        Atendente atendente = new Atendente();
        atendente.setValorVenal(1000.0);
        System.out.println(atendente.Recebeu());
        System.out.println(atendente.calculaImposto());
    }

}
