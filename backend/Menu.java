import java.util.*;

public class Menu {
    public static void main(String[] args) {

        Cadastro novoCadastro = new Cadastro();

        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------SYSTEM loCAR-------------------------------");
        try {
            for (int i = 1; i <= 50; i++) {
                System.out.printf("  %d%%\r", i * 2);
                for (int j = 0; j < i; j++) {
                    if (j == 0)
                        System.out.printf("  ");
                    System.out.printf("%c", 62);
                    Thread.sleep(8);
                }
            }
            System.out.println("\n\n\n ");

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        int opcao = 0;
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
                try {
                    novoCadastro.addFuncionario();
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                System.out.println("--------------Cadastro de Clientes-------------------");
                System.out.println("O Cliente vai ser cadastrado com CPF ou CNPJ?");
                System.out.println("Digite 1 Para CPF ou 2 para CNPJ.");
                int num = entrada.nextInt();
                if (num == 1) {
                    System.out.println("-------------------Cadastro de Pessoa Física----------------");
                    try {
                        novoCadastro.addClienteF();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    } 
                    break;
                } else if (num == 2) {
                    System.out.println("-------------------Cadastro de Pessoa Juridica-------------------------------");
                    novoCadastro.addClienteJ();
                }
                break;
            }

        } while (opcao != 5);

        entrada.close();

    }

}