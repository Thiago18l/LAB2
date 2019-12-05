import java.util.*;

public class Menu {
    public static void main(String[] args) {

        Cadastro novoCadastro = new Cadastro();
        CadastroVeiculos nVeiculos = new CadastroVeiculos();
        

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
            System.out.print("3 - Locação de Veículos");
            System.out.print("\t\t4 - Vistoria\n");
            System.out.println(" ");
            System.out.println("5 - Fatura Cliente \t\t 6 - Relatório loCAR\n\n7- Sair do Sistema");
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
                } else if (n == 2) {
                    try {
                        novoCadastro.removeFun();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                } else if (n == 3) {
                    try {
                        novoCadastro.atualizaFun();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }

                } else if (n == 4) {
                    try {
                        novoCadastro.mostrarFun();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                }

                break;// fim do case 1;

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
                } else if (num == 4) {
                    System.out.println("-------------------------ATUALIZAÇÃO DE DADOS----------------------------");
                    System.out.printf("1- Pessoa Física");
                    System.out.println("\t\t2- Pessoa Juridica");
                    System.out.println("Opção:");
                    opcao = entrada.nextInt();
                    switch (opcao) {
                    case 1:
                        novoCadastro.atualizaPf();
                        break;
                    case 2:
                        novoCadastro.atualizaPj();
                        break;
                    }
                } // fim da condição numero 4;
                break;
            case 3:
                System.out.println("---------------------------LOCAÇÃO DE VEICULOS-------------------------");

                System.out.println("Informe o tipo de veículo a ser locado:");
                System.out.printf("1- Hatch\t");
                System.out.println("2- Sedan\n");
                System.out.printf("3- Suv\t");
                System.out.println("4- Minivan\n\n5- Remoção de Veículos\t\t 6 - Mostrar Frota\n\nOpção:");
                int op = entrada.nextInt();

                if (op == 1) {
                    try {
                        nVeiculos.cadHatch();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                } else if (op == 2) {
                    try {
                        nVeiculos.cadSedan();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                } else if (op == 3) {
                    try {
                        nVeiculos.cadSuv();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                } else if (op == 4) {
                    try {
                        nVeiculos.cadMinivan();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                } else if (op == 5) {
                    try {
                        nVeiculos.removerVeiculo();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }

                }else if (op == 6){
                    try{
                        nVeiculos.mostrarFrota();
                    }
                    catch(InputMismatchException e){
                        System.out.println(e.getMessage());
                    }
                    catch(NullPointerException e){
                        System.out.println(e.getMessage());
                    }
                }

                break;
            case 4:
                System.out.println("--------------------------- Vistoria --------------------------");
                System.out.println("1 - Verificar condições do Veículo\t\t 2 -  Devolver Veículo");
                System.out.println("Opção:");
                int numero = entrada.nextInt();
                switch (numero) {
                case 1:
                    try {
                        nVeiculos.condicoes();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        nVeiculos.devolucao();
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                break;
                case 5:
                    String cod;
                    int number;
                    try{
                        System.out.println("----------------------------------- CHECK OUT CLIENTE-----------------------------------------");
                        System.out.println("");
                        try{
                            System.out.println("Digite o Código do cliente");
                            cod = entrada.next();
                            novoCadastro.buscaCliente(cod);
                            System.out.println("Deseja ir para o Pagamento?\n 1- Sim\t\t 2- Não");
                            number = entrada.nextInt();
                            if ( number == 1){
                                nVeiculos.pagamento();
                                break;
                            }else if (number == 2){
                                return;
                            }else if (number != 1 && number != 2){
                                return;
                            }
                        }   
                        catch(InputMismatchException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    catch(NullPointerException e){
                        System.out.println(e.getMessage());
                    }
                break;
                case 6:
                    System.out.println("-------------------------RELATÓRIO-------------------------------------");
                    int o;
                    try{
                        System.out.println("Deseja imprimir o Faturamento?\n 1- Sim\t\t 2- Não");
                        o = entrada.nextInt();
                        if (o == 1){
                            System.out.println("Salario total dos Funcionarios:\nTOTAL R$:"+novoCadastro.salarioFun());
                        System.out.println("Valor resultante de Locações:\nTOTAL R$:"+nVeiculos.valores());
                        }else{
                            return;
                        }

                        
                    }
                    catch(InputMismatchException e){
                        System.out.println(e.getMessage());
                    }
                    catch(NullPointerException e){
                        System.out.println(e.getMessage());
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }
                break;
            }// fim do switch principal;

        } while (opcao != 7);

        entrada.close();

    }

}