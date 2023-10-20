/*  1. Vocês deverão se reunir em equipes de até 05 pessoas, ou seja equipe <= 5.

2. Cada equipe deverá implementar o último exercício da Aula 05 (https://github.com/EvandroJRSilva/POO_ED/tree/main/src/aula05/texto)
2.1. Na classe ContaBancaria vocês
    2.1.1. Vocês deverão acrescentar atributo(s) e método(s) para saque, depósito e atualização de valores
    do saldo. Não esquecer do método aplicaJuros existente na classe ContaPoupanca,
     ou seja, é um método que deve ser aplicado ao montante presente na conta do usuário.
2.2. Na classe Principal
    2.2.1. Vocês deverão criar três objetos da classe Funcionario. Os valores para os atributos do primeiro
    objeto vocês mesmos escolherão. Os valores para os atributos dos dois outros objetos devem ser
    preenchidos pelo usuário através de leitura no console.
    2.2.2. Criar uma empresa qualquer, como instância da classe PessoaJuridica.
    2.2.3. Imprimir no console o nome de cada funcionário e dizer que são funcionários da empresa recém criada.
     Utilize os métodos getters para ter acesso aos nomes.
    2.2.4. Permita a um usuário escolher, via console, dois funcionários e realizar manipulações entre eles,
    desde modificar valores de atributos como também um depositar na conta do outro, etc.
    2.2.5. Ao fim do programa, devem ser impressos no console todos os objetos criados e seus respectivos valores.

3. A data de entrega será 19/10/23, ou seja na próxima quinta.
3.1. Cada grupo deverá criar um arquivo zipado contendo apenas as classes criadas e enviar diretamente para mim pelo Telegram. Meu usuário: @evandro_jr_silva.
3.2. Na mensagem em que me enviarem o arquivo, deve constar também o nome completo de todos os membros da equipe.
3.3. O horário limite para entrega é as 23:59.

4. Este trabalho está valendo até 5 pontos a serem acrescentados à nota da prova.
4.1. Ou seja, supondo que você esteja com a nota 4, sua nota poderá subir até 9. */

import Classes.ContaBancaria;
import Classes.ContaPoupanca;
import Classes.Funcionario;
import Classes.PessoaJuridica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCadastro de empresa\n");
        //nome, endereco, telefone, tipo, cnpj, nomefantasia
        System.out.print("\n\n" + "Cadastrar empresa" + "\n");
        System.out.print("Nome da empresa: ");
        String nomeempresa = scanner.nextLine();
        System.out.print("Digite o endereco da empresa: ");
        String enderecoempresa= scanner.nextLine();
        System.out.print("Digite o email da empresa: ");
        String emailempresa = scanner.nextLine();
        System.out.print("Digite o telefone da empresa: ");
        String telefoneempresa = scanner.nextLine();
        System.out.print("Digite o tipo da empresa: ");
        String tipoempresa= scanner.nextLine();
        System.out.print("Digite o cnpj da empresa: ");
        String cnpj = scanner.nextLine();
        System.out.print("Digite o Nome Fantasia da empresa: ");
        String fantasia= scanner.nextLine();
        System.out.print("Banco da empresa: ");
        String bancoemp= scanner.nextLine();
        System.out.println("Agencia: ");
        String agenciaemp = scanner.nextLine();
        System.out.print("Numero da conta: ");
        int numeroemp = scanner.nextInt();
        System.out.print("Saldo da conta: ");
        int saldoemp = scanner.nextInt();


        PessoaJuridica empresa1 = new PessoaJuridica(nomeempresa, enderecoempresa, emailempresa,
                telefoneempresa, tipoempresa, cnpj, fantasia);
        empresa1.setTipoConta(new ContaBancaria (nomeempresa, bancoemp, agenciaemp, numeroemp, saldoemp));
        empresa1.mostrare();

        PessoaJuridica empresa2 = new PessoaJuridica();


        // nome, endereço,email,telefone,conta, cpf, cnh, rg, cargo, empresa, idFuncionario
        System.out.print("\n\n" +"Cadastrar Funcionario 1\n");
        System.out.print("Digite o nome do Funcionario: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o endereco do Funcionario: ");
        String endereco= scanner.nextLine();
        System.out.print("Digite o email do Funcionario: ");
        String email = scanner.nextLine();
        System.out.print("Digite o telefone do Funcionario: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o cpf do Funcionario: ");
        String cpf= scanner.nextLine();
        System.out.print("Digite o cnh do Funcionario: ");
        String cnh = scanner.nextLine();
        System.out.print("Digite o rg do Funcionario: ");
        String rg= scanner.nextLine();
        System.out.print("Digite o cargo do Funcionario: ");
        String cargo = scanner.nextLine();
        System.out.print("Digite o id do Funcionario: ");
        String id= scanner.nextLine();
        System.out.print("Digite o nome da empresa do Funcionario: ");
        String nomeEmpresa = scanner.nextLine();
        System.out.print("Banco da funcionario: ");
        String banco= scanner.nextLine();
        System.out.println("Agencia: ");
        String agencia = scanner.nextLine();
        System.out.print("Numero da conta: ");
        int numero= scanner.nextInt();


        Funcionario funcionario1 = new Funcionario(nome, endereco, email, telefone, cpf, cnh, rg, cargo, id);
        funcionario1.setEmpresaFuncionario(new PessoaJuridica(nomeEmpresa));
        funcionario1.setTipoConta(new ContaBancaria (nome, banco, agencia ,numero, 0.00));
        funcionario1.mostrar();

        Funcionario funcionario2 = new Funcionario();


        //menu
        System.out.println("_____________MENU____________");

        boolean menu = true;
        while(menu == true){
            System.out.println("\nDigite: \n1. para cadastro de empresas; \n2. Para cadastro de funcionários. \n3. para pagamentos. \n4.Ver Empresas cadastradas.");
            int acao = scanner.nextInt();
            switch (acao){
                case 1: //cadastro de uma nova empresa
                        // nome, endereço,email,telefone,conta, cpf, cnh, rg, cargo, empresa, idFuncionario
                        System.out.println("\nCadastro de empresa\n");
                        //nome, endereco, telefone, tipo, cnpj, nomefantasia
                        System.out.print("\n\n" + "Cadastrar empresa" + "\n");
                        System.out.print("Nome da empresa: ");
                        String nomeEmpresa2 = scanner.nextLine();
                        System.out.print("Digite o endereco da empresa: ");
                        String enderecoempresa2= scanner.nextLine();
                        System.out.print("Digite o email da empresa: ");
                        String emailempresa2 = scanner.nextLine();
                        System.out.print("Digite o telefone da empresa: ");
                        String telefoneempresa2 = scanner.nextLine();
                        System.out.print("Digite o tipo da empresa: ");
                        String tipoempresa2= scanner.nextLine();
                        System.out.print("Digite o cnpj da empresa: ");
                        String cnpj2 = scanner.nextLine();
                        System.out.print("Digite o Nome Fantasia da empresa: ");
                        String fantasia2= scanner.nextLine();
                        System.out.print("Banco da empresa: ");
                        String banco2= scanner.nextLine();
                        System.out.println("Agencia: ");
                        String agencia2 = scanner.nextLine();
                        System.out.print("Numero da conta: ");
                        int numero2 = scanner.nextInt();

                        empresa2.setNome(nomeEmpresa2); empresa2.setEndereco(enderecoempresa2); empresa2.setEmail(emailempresa2);
                        empresa2.setTelefone(telefoneempresa2); empresa2.setTipoEmpresa(tipoempresa2); empresa2.setCNPJ(cnpj2);
                        empresa2.setNomeFantasia(fantasia2);
                        empresa2.setTipoConta(new ContaBancaria (nomeEmpresa2, banco2, agencia2 ,numero2, 0.00));
                        empresa2.mostrare();
                break;

                case 2: //Cadastro de um novo funcionário

                    // nome, endereço,email,telefone,conta, cpf, cnh, rg, cargo, empresa, idFuncionario
                    System.out.print("\n\n" +"Cadastrar Funcionario 2\n");
                    System.out.print("Digite o nome do Funcionario 2: ");
                    String nome2 = scanner.nextLine();
                    System.out.print("Digite o endereco do Funcionario 2: ");
                    String endereco2= scanner.nextLine();
                    System.out.print("Digite o email do Funcionario 2: ");
                    String email2 = scanner.nextLine();
                    System.out.print("Digite o telefone do Funcionario 2: ");
                    String telefone2 = scanner.nextLine();
                    System.out.print("Digite o cpf do Funcionario 2: ");
                    String cpf2= scanner.nextLine();
                    System.out.print("Digite o cnh do Funcionario 2: ");
                    String cnh2 = scanner.nextLine();
                    System.out.print("Digite o rg do Funcionario 2: ");
                    String rg2= scanner.nextLine();
                    System.out.print("Digite o cargo do Funcionario 2: ");
                    String cargo2 = scanner.nextLine();
                    System.out.print("Digite o id do Funcionario 2: ");
                    String id2= scanner.nextLine();
                    System.out.print("Digite o nome da empresa do Funcionario 2: ");
                    String nomeEmpresaf2 = scanner.nextLine();
                    System.out.print("Banco da funcionario: ");
                    String bancof2= scanner.nextLine();
                    System.out.println("Agencia: ");
                    String agenciaf2 = scanner.nextLine();
                    System.out.print("Numero da conta: ");
                    int numerof2 = scanner.nextInt();

                    funcionario2.setNome(nome2); funcionario2.setEndereco(endereco2); funcionario2.setEmail(email2);
                    funcionario2.setTelefone(telefone2); funcionario2.setCpf(cpf2); funcionario2.setCnh(cnh2); funcionario2.setRg(rg2);
                    funcionario2.setTipoFuncionario(cargo2); funcionario2.setCodigoFuncionario(id2);
                    funcionario2.setEmpresaFuncionario(new PessoaJuridica(nomeEmpresaf2));
                    funcionario2.setTipoConta(new ContaBancaria (nome2, bancof2, agenciaf2, numerof2, 0.00 ));
                    funcionario2.mostrar();
                    break;

                case 3: //pagamentos
                    System.out.print("Para quem seráo pagamento: \n1. Funcionario 1; \n2.Outro.");
                    int pagamento = scanner.nextInt();
                    switch (pagamento){
                        case 1:
                            System.out.print("\nVamos depositar o Salário: ");
                            System.out.print("\nA " + empresa1.getNome() + " vai depositar para o " + funcionario1.getNome() +  "o valor de (R$): ");
                            double salario1 = scanner.nextDouble();
                            empresa1.getTipoConta().sacar(salario1);
                            funcionario1.getTipoConta().depositar(salario1);
                        break;
                        case 2:
                            System.out.print("\nVamos depositar o Salário: ");
                            System.out.print("\nA " + empresa1.getNome() + " vai depositar para o " + funcionario2.getNome() +  "o valor de (R$): ");
                            double salario2 = scanner.nextDouble();
                            empresa1.getTipoConta().sacar(salario2);
                            funcionario2.getTipoConta().depositar(salario2);
                        break;
                    }

                    break;

                case 4: //mostrar empresas
                    empresa1.mostrare();
                    empresa2.mostrare();
                    break;
                case 5: //mostrar funcionarios
                    funcionario1.mostrar();
                    funcionario2.mostrar();
                    break;

                default:
                    menu = false;
            }
        }

    scanner.close();


    }
}
