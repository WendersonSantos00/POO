package Classes;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria tipoConta;

    public Pessoa(){}

    public Pessoa(String nome, String endereco, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    //geters and seters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(ContaBancaria tipoConta) {
        this.tipoConta = tipoConta;
    }

    

}