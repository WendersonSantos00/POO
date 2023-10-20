package Classes;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private String cnh;
    private String rg;
    public PessoaFisica(){}
    public PessoaFisica(String nome, String endereco, String telefone, String email, String cpf, String cnh, String rg){
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.cnh = cnh;
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    
}
