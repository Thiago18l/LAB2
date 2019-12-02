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
                    Thread.sleep(3);
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
                System.out.printf("1- Novo Funcionario");
                System.out.printf("\t\t2- Remover Funcionario\n");
                System.out.printf("3- Atualizar dados");
                System.out.printf("\t\t4- Mostrar todos os Funcionarios\n");
                System.out.println("5-Voltar ao menu anterior");
                System.out.println("Opção:");
                int n = entrada.nextInt();
                if (n == 1) {
                    try {
                        novoCadastro.addFuncionario();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                }
                else if (n == 2) {
                    try{
                        novoCadastro.removeFun();
                    }
                    catch(InputMismatchException e){
                        System.out.println(e.getMessage());
                    }
                 }else if (n == 3){
                     try{
                        novoCadastro.atualizaFun();
                     }
                     catch(InputMismatchException e){
                         System.out.println(e.getMessage());
                     }
                     
                 }else if (n == 4){
                     try{
                         novoCadastro.mostrarFun();
                     }
                     catch(InputMismatchException e){
                         System.out.println(e.getMessage());
                     }
                 }
                
                break;
            case 2:
                System.out.println("--------------Cadastro de Clientes-------------------\n");
                System.out.println("Bem vindo.");
                System.out.printf("\n1- Cadastro Pessoa Física");
                System.out.println("\t 2- Cadastro Pessoa Juridica");
                System.out.printf("3- Remover um Cliente");
                System.out.println("\t\t4- Atualizar dados do Cliente");
                System.out.println("5- Retornar ao menu anterior");
                System.out.printf("\nOpção:");
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
                } else if (num == 3) {
                    System.out.println("------------------------REMOVER CLIENTES-----------------------------");
                    System.out.println(
                            "OBS: Para a remoção de clientes você tem que colocar o código do cliente seja ele\n Pessoa física ou Jurídica.");
                    novoCadastro.remover();
                }else if (num == 4){
                    System.out.println("-------------------------ATUALIZAÇÃO DE DADOS----------------------------");
                    System.out.printf("1- Pessoa Física");
                    System.out.println("\t\t2- Pessoa Juridica");
                    System.out.println("Opção:");
                    opcao = entrada.nextInt();
                    switch(opcao){
                        case 1:
                        novoCadastro.atualizaPf();
                        break;
                        case 2:
                        novoCadastro.atualizaPj();
                        break;
                    }
                    
                }
            }
            break;

        } while (opcao != 5);

        entrada.close();

    }

}