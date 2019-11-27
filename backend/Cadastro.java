import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    protected Funcionario[] funcionario;

    Scanner entrada = new Scanner(System.in);

    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Cadastro() {

    }

    public void addClienteF() {
        String nome, cpf, end, cod;
        int i = 0;
        Fisica[] fisicas = new Fisica[i + 1];
        fisicas[i] = new Fisica();
        if (fisicas[i] instanceof Fisica) {
            System.out.println(
                    "-------------------------- ADICIONAR CLIENTE PESSOA FISICA---------------------------------");
            System.out.println("Nome:");
            nome = entrada.nextLine();
            ((Fisica) fisicas[i]).setNome(nome);
            System.out.println("Endereco:");
            end = entrada.nextLine();
            ((Fisica) fisicas[i]).setEnd(end);
            System.out.println("CPF:");
            cpf = entrada.nextLine();
            ((Fisica) fisicas[i]).setCpf(cpf);
            System.out.println("Código do cliente:");
            cod = entrada.nextLine();
            ((Fisica) fisicas[i]).setCodCliente(cod);
            clientes.add(fisicas[i]);

            for (Cliente j : clientes) {
                System.out.println(j);
            }
        }
    }// Fim do metodo add Pessoa fisica;

    public void addClienteJ() {
        String nome, cnpj, cod;
        int j = 0;
        Juridica[] juridicas = new Juridica[j + 1];
        juridicas[j] = new Juridica();
        if (juridicas[j] instanceof Juridica) {
            System.out.println("------------------------- ADICIONAR CLIENTE PESSOA JURIDICA-------------------------");
            System.out.println("Nome:");
            nome = entrada.nextLine();
            ((Juridica) juridicas[j]).setNome(nome);
            System.out.println("Digite o CNPJ:");
            cnpj = entrada.nextLine();
            ((Juridica) juridicas[j]).setCnpj(cnpj);
            System.out.println("Código do Cliente:");
            cod = entrada.nextLine();
            ((Juridica) juridicas[j]).setCodCliente(cod);
            clientes.add(juridicas[j]);
            for (Cliente i : clientes) {
                System.out.println(i);
            }
        }
    }// Fim do metodo add pessoa juridica;

    public void atualizaPf() {
        String nome, end, cpf;
        System.out.println("---------------------ATUALIZAR INFORMAÇÕES-----------------");
        System.out.println("Digite o Código do Cliente para Atualizar seus dados:");
        String cod = entrada.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente f = clientes.get(i);
            if (f.getCodCliente().equals(cod)) {
                System.out.println("Informações:\n");
                System.out.println("Nome:" + ((Fisica) f).getNome());
                System.out.println("Endereço:" + ((Fisica) f).getEnd());
                System.out.println("Código:" + ((Fisica) f).getCodCliente());
                System.out.println("CPF:" + ((Fisica) f).getCpf());
                System.out.println("----------------------------------------------");
                System.out.println("Novo nome:");
                nome = entrada.nextLine();
                ((Fisica)f).setNome(nome);
                System.out.println("Endereço:");
                end = entrada.nextLine();               
                ((Fisica)f).setEnd(end);
                System.out.println("CPF:");
                cpf = entrada.nextLine();
                ((Fisica)f).setCpf(cpf);
                System.out.println("---------------------------------------------------");
                clientes.set(i,f); // Alterar
                break;
            }
        }
    }

    public void addFuncionario() {
        String nome, end, data, codFun;
        int salario;
        int i = 0;

        Funcionario[] fun = new Funcionario[i + 1];
        fun[i] = new Funcionario();

        System.out.println("Nome:");
        nome = entrada.nextLine();
        ((Funcionario) fun[i]).setNome(nome);
        System.out.println("Endereço:");
        end = entrada.nextLine();
        ((Funcionario) fun[i]).setEnd(end);
        System.out.println("Data de entrada:");
        data = entrada.nextLine();
        ((Funcionario) fun[i]).setData(data);
        System.out.println("Código do Funcionario");
        codFun = entrada.nextLine();
        ((Funcionario) fun[i]).setCodFun(codFun);
        System.out.println("Remuneração:");
        salario = Integer.parseInt(entrada.nextLine());
        ((Funcionario) fun[i]).setSalario(salario);

        funcionarios.add(fun[i]);
        for (Funcionario j : funcionarios) {
            System.out.println(j);
        }
    }// Fim do metodo add funcionario.

    public void remover() {
        String cod;
        System.out.println("------------------");
        System.out.println("Digite o Código do Cliente:");
        cod = entrada.nextLine();
        for (int i = 0; i < clientes.size(); i++) {
            Cliente j = clientes.get(i);
            if (j.getCodCliente().equals(cod)) {
                clientes.remove(j);
                System.out.println("Cadastro removido com sucesso.");
                break;
            } else if (cod != j.getCodCliente()) {
                System.out.println("Codigo não encontrado");
            }
        }
    }// Metodo de remoção de clientes.

    public void removeFun() {
        String cod;
        System.out.println("------------------REMOÇÃO DE FUNCIONARIOS----------------\n\n");
        System.out.println("Digite o código do funcionario a ser removido: ");
        cod = entrada.nextLine();
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario f = funcionarios.get(i);
            if (f.getCodFun().equals(cod)) {
                funcionarios.remove(f);
                System.out.println("Funcionario Removido com sucesso");
            } else if (cod != f.getCodFun()) {
                System.out.println("Código não encontrado");
            }
        }
    }// Fim do metodo de remoção de Funcionarios;
}// Fim da classe