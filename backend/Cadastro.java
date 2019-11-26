import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    protected Cliente[] cliente;
    protected Funcionario[] funcionario;

    Scanner entrada = new Scanner(System.in);

    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList<>();

    public Cadastro() {

    }

    public void addClienteF() {
        String nome, cpf, end, cod;
        int i = 0;
        Cliente[] cliente = new Cliente[i + 1];
        cliente[i] = new Cliente();
        if (cliente[i] instanceof Cliente) {
            System.out.println(
                    "-------------------------- ADICIONAR CLIENTE PESSOA FISICA---------------------------------");
            System.out.println("Nome:");
            nome = entrada.nextLine();
            ((Cliente) cliente[i]).setNome(nome);
            System.out.println("Endereco:");
            end = entrada.nextLine();
            ((Cliente) cliente[i]).setEnd(end);
            System.out.println("CPF:");
            cpf = entrada.nextLine();
            ((Cliente) cliente[i]).setCpf(cpf);
            System.out.println("Código do cliente:");
            cod = entrada.nextLine();
            ((Cliente) cliente[i]).setCodCliente(cod);
            clientes.add(cliente[i]);

            for (Cliente j : clientes) {
                System.out.println(j);
            }
        }
    }// Fim do metodo add Pessoa fisica;

    public void addClienteJ() {
        String nome, cnpj, cod;
        int j = 0;
        Cliente[] juridico = new Cliente[j + 1];
        juridico[j] = new Cliente();
        if (juridico[j] instanceof Cliente) {
            System.out.println("------------------------- ADICIONAR CLIENTE PESSOA JURIDICA-------------------------");
            System.out.println("Nome:");
            nome = entrada.nextLine();
            ((Cliente) juridico[j]).setNome(nome);
            System.out.println("Digite o CNPJ:");
            cnpj = entrada.nextLine();
            ((Cliente) juridico[j]).setCnpj(cnpj);
            System.out.println("Código do Cliente:");
            cod = entrada.nextLine();
            ((Cliente) juridico[j]).setCodCliente(cod);
            clientes.add(juridico[j]);
        }
    }// Fim do metodo add pessoa juridica;

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
}// Fim da classe