package Classes;

public class PessoaJuridica extends Pessoa{
    private String tipoEmpresa;
    private String CNPJ;
    private String nomeFantasia;

    public PessoaJuridica(){}

    public PessoaJuridica(String nome, String endereco, String telefone, String email, String tipoEmpresa, String CNPJ, String nomeFantasia){
        super(nome, endereco,telefone, email);
        this.tipoEmpresa = tipoEmpresa;
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
    }
    public PessoaJuridica(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void mostrare(){
        System.out.println("\n___________EMPRESA___________");
        System.out.println("\n");
        System.out.println("Nome: " + getNome() + "\n" + "Endereco: " + getEndereco() + "\n" + "Fone: " + getTelefone() + "\n" +
                "E-mail: " + getEmail() + "\n" + "tipo: " + getTipoEmpresa() + "\n" + "CNPJ: " + getCNPJ() +"\n" +
                "Nome Fantasia: " + getNomeFantasia() + "\n" + "Conta: " + getTipoConta().getNumero() + "\n"
                + "\n" + "Saldo: " + getTipoConta().getSaldo());
    }
}