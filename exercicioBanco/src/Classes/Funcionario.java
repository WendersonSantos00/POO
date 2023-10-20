package Classes;

public class Funcionario extends PessoaFisica{
    private String tipoFuncionario;
    private PessoaJuridica empresaFuncionario;
    private String codigoFuncionario;
    private Funcionario chefe;
    private Funcionario subordinado;


    public Funcionario(){}
    public Funcionario(String nome, String endereco, String telefone, String email,
    String cpf, String cnh, String rg, String tipoFuncionario, String codigoFuncionario){
        super(nome, endereco,telefone, email, cpf, cnh, rg);
        this.tipoFuncionario = tipoFuncionario;
        this.codigoFuncionario = codigoFuncionario;
    }


    //geters and setters


    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public PessoaJuridica getEmpresaFuncionario() {
        return empresaFuncionario;
    }

    public void setEmpresaFuncionario(PessoaJuridica empresaFuncionario) {
        this.empresaFuncionario = empresaFuncionario;
    }

    public String getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(String codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public Funcionario getSubordinado() {
        return subordinado;
    }

    public void setSubordinado(Funcionario subordinado) {
        this.subordinado = subordinado;
    }

    public void mostrar(){
        System.out.println("\n___________FUNCIONÁRIO___________");
        System.out.println("\n");
        System.out.println("Nome: " + getNome() + "\n" + "Endereco: " + getEndereco() + "\n" + "Fone: " + getTelefone() + "\n" +
                "E-mail: " + getEmail() + "\n" + "CPF: "+ getCpf()  + "\n" + "RG: " + getRg() + "\n" + "Tipo : " + getTipoFuncionario() + "\n" +
                "ID: " + getCodigoFuncionario() + "\n" + "Conta: " + getTipoConta().getNumero() + "\n" +
                "Saldo: " + getTipoConta().getSaldo());
    }
}
