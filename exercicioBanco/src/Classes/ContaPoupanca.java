package Classes;

public class ContaPoupanca extends ContaBancaria{
    private double juros;
    private double saldoPoupanca;

    public ContaPoupanca(String titular, String banco, String agencia, int numero, double saldo, double juros, double saldoPoupanca){
        super(titular, banco, agencia, numero,saldo);
        this.juros = juros;
        this.saldoPoupanca = saldoPoupanca;
    }

    //geters

    public double getJuros(){
        return juros;
    }
    public double getSaldoPoupanca(){
        return saldoPoupanca;
    }

    //seters

    public void setJuros(double juros){
        this.juros = juros;
    }
    public void setSaldoPoupanca(double saldoPoupanca){
        this.saldoPoupanca = saldoPoupanca;
    }

    public double aplicarJuros(double aplicarJuros){
        saldoPoupanca = saldoPoupanca + (saldoPoupanca * juros);
        return saldoPoupanca;
    }
}
