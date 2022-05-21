package Agencia;

public class Gerente {

    private String modelo;
    private String marca;

    private double valorVenal;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void recebeu() {
        System.out.println("Recebeu o salário");
    }

    public double getValorVenal() {
        return valorVenal;
    }

    public void setValorVenal(double valorVenal) {
        this.valorVenal = valorVenal;
    }
    public double calculaImposto() {
        return this.valorVenal * 0.1;
    }
}
