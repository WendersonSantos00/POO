package Classes;

public class ContaBancaria {
    private String titular;
    private String banco;
    private String agencia;
    private int numero;
    private double saldo;

    public ContaBancaria(int numero){
        this.numero = numero;
    }
    public ContaBancaria(String titular, String banco, String agencia, int numero, double saldo){
        this.titular = titular;
        this.banco = banco;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

    }

    // geters

    public String getTitular(){
        return titular;
    }
    public String getBanco(){
        return banco;
    }
    public String getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    //seters

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setBanco(String banco){
        this.banco=banco;
    }
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double depositar){
        saldo = saldo + depositar;
        return saldo;
    }
    public double sacar(double sacar){
        saldo = saldo - sacar;
        return saldo;
    }
}
