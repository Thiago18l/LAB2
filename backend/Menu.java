import java.util.*;

public class Menu {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------SYSTEM loCAR-------------------------------");
        try{
            for (int i = 1; i <= 50; i++) {
                System.out.printf("  %d%%\r", i*2);
                for (int j = 0; j < i; j++) {
                    if (j == 0)
                        System.out.printf("  ");
                    System.out.printf ("%c", 62);
                    Thread.sleep(8);
                }
            }
            System.out.println("\n\n\n ");
           
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        
        int opcao=0;
        do {
            System.out.println("-------------------MENU------------------------");
            System.out.print("1 - Cadastro de funcionarios");
            System.out.print("\t2 - Cadastro de Clientes\n");
            System.out.println(" ");
            System.out.print("3 - Vistoria de Veículos");
            System.out.print("\t4 - Check-out\n");
            System.out.println(" ");
            System.out.println("5 - Sair do Sistema");
            System.out.print("Digite a opção que você deseja:");
             opcao = entrada.nextInt();

            switch (opcao) {
            case 1:

                System.out.println("------------Cadastro de Funcionarios-----------------");

                System.out.println("Digite o nome do funcionario:");
                String nome = entrada.next();
                System.out.println("Digite o Código do funcionario:");
                int cod = entrada.nextInt();
                System.out.println("Digite o endereço:");
                String end = entrada.next();
                System.out.println("Data que foi contratado:");
                String data = entrada.next();
                System.out.println("Digite a remuneração do Funcionario:");
                int salario = entrada.nextInt();

                funcionarios.add(new Funcionario(nome, end, salario, data, cod));

                break;
            case 2:
                System.out.println("--------------Cadastro de Clientes-------------------");
                System.out.println("O Cliente vai ser cadastrado com CPF ou CNPJ?");
                System.out.println("Digite 1 Para CPF ou 2 para CNPJ.");
                int num = entrada.nextInt();
                if (num == 1) {
                    System.out.println("-------------------Cadastro de Pessoa Física----------------");
                    System.out.println("Digite o nome do cliente:");
                    nome = entrada.next();
                    System.out.println("Digite o endereço:");
                    end = entrada.next();
                    System.out.println("Digite o CPF:");
                    int cpf = entrada.nextInt();
                    clientes.add(new Cliente(nome, end, cpf));
                    break;
                } else if (num == 2) {
                    System.out.println("-------------------Cadastro de Pessoa Juridica");
                    System.out.println("Digite o nome do cliente:");
                    nome = entrada.next();
                    System.out.println("Digite o CNPJ:");
                    int cnpj = entrada.nextInt();
                    clientes.add(new Cliente(nome, cnpj));
                    break;
                }
                break;
            }

        } while (opcao != 5);

        entrada.close();

    }

}