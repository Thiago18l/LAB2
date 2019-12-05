import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroVeiculos implements Locação {
    private double faturamento=0;
    ArrayList<Carros> locacao = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    /**
     * @param faturamento the faturamento to set
     */
    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
    /**
     * @return the faturamento
     */
    public double getFaturamento() {
        return faturamento;
    }
    public CadastroVeiculos() {

    }

    public CadastroVeiculos(String placa) {

    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public ArrayList getVeiculosLocacao() {
        return this.locacao.size();
    }

    public void cadHatch() {
        int i = 0;
        String placa, data, motivo;
        double km;
        int dias;
        Hatch[] hatch = new Hatch[i + 1];
        hatch[i] = new Hatch();
        System.out.println("----------------------Veículo Hatch-----------------------");
        System.out.println("Placa do veículo:");
        placa = entrada.next();
        ((Hatch) hatch[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.next();
        ((Hatch) hatch[i]).setData(data);
        try {
            System.out.println("Km atual do Veículo:");
            km = entrada.nextDouble();
            ((Hatch) hatch[i]).setKm(km);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Quantidade de dias:");
            dias = entrada.nextInt();
            ((Hatch) hatch[i]).setDias(dias);
        } catch (NumberFormatException e) {
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.next();
        ((Hatch) hatch[i]).setMotivo(motivo);
        System.out.println("Deseja adicionar algum Opcional?");
        System.out.println("1- Sim\t\t2- Não\n");
        int op = entrada.nextInt();
        if (op == 1) {
            System.out.println("------------------------Cadastro de Opcionais-----------------------------------");
            System.out.println("Digite os opcionais que deseja:");
            System.out.println("1- Bebe Conforto\t\t\t 2- Cadeirinha \n\n3- Assento de elevação\t\t 4- GPS");
            int num = entrada.nextInt();
            if (num == 1) {
                System.out.println("Bebe conforto adicionado com sucesso.");
                ((Hatch) hatch[i]).setbbConforto(50.00);
            } else if (num == 2) {
                System.out.println("Cadeirinha adicionado com sucesso");
                ((Hatch) hatch[i]).setCadeirinha(45.00);
            } else if (num == 3) {
                System.out.println("Assento adicionado com sucesso");
                ((Hatch) hatch[i]).setAssento(25.00);
            } else if (num == 4) {
                System.out.println("GPS adicionado com sucesso");
                ((Hatch) hatch[i]).setGps(90.00);
            } else if (num != 1 || num != 2 || num != 3 || num != 4) {
                return;
            }
        }
        locacao.add(hatch[i]);
        for (Carros j : locacao) {
            System.out.println(j);
        }
    }

    public void cadSedan() {
        int i = 0;
        String placa, data, motivo;
        int dias;
        double km;
        Sedan[] sedan = new Sedan[i + 1];
        sedan[i] = new Sedan();
        System.out.println("------------------------Cadastro de Sedan-----------------------");
        System.out.println("Placa do veículo:");
        placa = entrada.next();
        ((Sedan) sedan[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.next();
        ((Sedan) sedan[i]).setData(data);
        try {
            System.out.println("Kilometragem do Carro:");
            km = entrada.nextDouble();
            ((Sedan) sedan[i]).setKm(km);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Quantidade de dias:");
            dias = entrada.nextInt();
            ((Sedan) sedan[i]).setDias(dias);
        } catch (NumberFormatException e) {
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.next();
        ((Sedan) sedan[i]).setMotivo(motivo);
        System.out.println("Deseja adicionar algum Opcional?");
        System.out.println("1- Sim\t\t2- Não\n");
        int op = entrada.nextInt();
        if (op == 1) {
            System.out.println("------------------------Cadastro de Opcionais-----------------------------------");
            System.out.println("Digite os opcionais que deseja:");
            System.out.println("1- Bebe Conforto\t\t\t 2- Cadeirinha \n\n3- Assento de elevação\t\t 4- GPS");
            int num = entrada.nextInt();
            if (num == 1) {
                System.out.println("Bebe conforto adicionado com sucesso.");
                ((Sedan) sedan[i]).setbbConforto(50.00);
            } else if (num == 2) {
                System.out.println("Cadeirinha adicionado com sucesso");
                ((Sedan) sedan[i]).setCadeirinha(45.00);
            } else if (num == 3) {
                System.out.println("Assento adicionado com sucesso");
                ((Sedan) sedan[i]).setAssento(25.00);
            } else if (num == 4) {
                System.out.println("GPS adicionado com sucesso");
                ((Sedan) sedan[i]).setGps(90.00);
            } else if (num != 1 || num != 2 || num != 3 || num != 4) {
                return;
            }
        }
        locacao.add(sedan[i]);
        for (Carros j : locacao) {
            System.out.println(j);
        }
    }

    public void cadSuv() {
        int i = 0;
        String placa, data, motivo;
        int dias;
        double km;
        Suv[] suvs = new Suv[i + 1];
        suvs[i] = new Suv();
        System.out.println("Placa do veículo:");
        placa = entrada.next();
        ((Suv) suvs[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.next();
        ((Suv) suvs[i]).setData(data);
        try {
            System.out.println("Digite a Kilometragem do Veículo");
            km = entrada.nextDouble();
            ((Suv) suvs[i]).setKm(km);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        try {
            System.out.println("Quantidade de dias:");
            dias = entrada.nextInt();
            ((Suv) suvs[i]).setDias(dias);
        } catch (NumberFormatException e) {
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.next();
        ((Suv) suvs[i]).setMotivo(motivo);
        System.out.println("Deseja adicionar algum Opcional?");
        System.out.println("1- Sim\t\t2- Não\n");
        int op = entrada.nextInt();
        if (op == 1) {
            System.out.println("------------------------Cadastro de Opcionais-----------------------------------");
            System.out.println("Digite os opcionais que deseja:");
            System.out.println("1- Bebe Conforto\t\t\t 2- Cadeirinha \n\n3- Assento de elevação\t\t 4- GPS");
            int num = entrada.nextInt();
            if (num == 1) {
                System.out.println("Bebe conforto adicionado com sucesso.");
                ((Suv) suvs[i]).setbbConforto(50.00);
            } else if (num == 2) {
                System.out.println("Cadeirinha adicionado com sucesso");
                ((Suv) suvs[i]).setCadeirinha(45.00);
            } else if (num == 3) {
                System.out.println("Assento adicionado com sucesso");
                ((Suv) suvs[i]).setAssento(25.00);
            } else if (num == 4) {
                System.out.println("GPS adicionado com sucesso");
                ((Suv) suvs[i]).setGps(90.00);
            } else if (num != 1 || num != 2 || num != 3 || num != 4) {
                return;
            }
        }
        locacao.add(suvs[i]);
        for (Carros j : locacao) {
            System.out.println(j);
        }
    }

    public void cadMinivan() {
        int i = 0;
        String placa, data, motivo;
        int dias;
        double km;
        Minivan[] minivans = new Minivan[i + 1];
        minivans[i] = new Minivan();
        System.out.println("Placa do veículo:");
        placa = entrada.next();
        ((Minivan) minivans[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.next();
        ((Minivan) minivans[i]).setData(data);
        try {
            System.out.println("KM Atual do Veículo:");
            km = entrada.nextDouble();
            ((Minivan) minivans[i]).setKm(km);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Quantidade de dias:");
            dias = entrada.nextInt();
            ((Minivan) minivans[i]).setDias(dias);
        } catch (NumberFormatException e) {
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.next();
        ((Minivan) minivans[i]).setMotivo(motivo);
        System.out.println("Deseja adicionar algum Opcional?");
        System.out.println("1- Sim\t\t2- Não\n");
        int op = entrada.nextInt();
        if (op == 1) {
            System.out.println("------------------------Cadastro de Opcionais-----------------------------------");
            System.out.println("Digite os opcionais que deseja:");
            System.out.println("1- Bebe Conforto\t\t\t 2- Cadeirinha \n\n3- Assento de elevação\t\t 4- GPS");
            int num = entrada.nextInt();
            if (num == 1) {
                System.out.println("Bebe conforto adicionado com sucesso.");
                ((Minivan) minivans[i]).setbbConforto(50.00);
            } else if (num == 2) {
                System.out.println("Cadeirinha adicionado com sucesso");
                ((Minivan) minivans[i]).setCadeirinha(45.00);
            } else if (num == 3) {
                System.out.println("Assento adicionado com sucesso");
                ((Minivan) minivans[i]).setAssento(25.00);
            } else if (num == 4) {
                System.out.println("GPS adicionado com sucesso");
                ((Minivan) minivans[i]).setGps(90.00);
            } else if (num != 1 || num != 2 || num != 3 || num != 4) {
                return;
            }
        }
        locacao.add(minivans[i]);

        for (Carros j : locacao) {
            System.out.println(j);
        }
    }

    /**
     * Função de remover Veículos
     */
    public void removerVeiculo() {
        String placa;
        try {
            System.out.println("Digite a placa do Veiculo:");
            placa = entrada.next();
            for (int i = 0; i < locacao.size(); i++) {
                Carros j = locacao.get(i);
                if (j.getPlaca().equals(placa)) {
                    locacao.remove(j);
                    System.out.println("Veiculo removido com Sucesso");
                } else {
                    System.out.println("Veículo Não encontrado");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }// Fim do metodo remover Veiculos

    /**
     * Função Mostrar Frota imprime todos os veículos da frota
     */
    public void mostrarFrota() {
        for (int i = 0; i < locacao.size(); i++)
            ;
        for (Carros j : locacao) {
            System.out.println(j);
        }
    }

    public void pagamento() {
        String placa;
        int num;
        System.out.println("--------------------------------------FATURA-----------------------------");
        System.out.println("");
        System.out.println("Digite a placa do veículo");
        placa = entrada.next();
        for (int i = 0; i < locacao.size(); i++) {
            Carros j = locacao.get(i);
            if (j.getPlaca().equals(placa)) {
                if (j.getDev() == true) {
                    System.out.println(j);
                    System.out.println("--------------------------------------------------\n\n");
                    System.out.println("Valor do aluguel R$: " + j.ValorAluguel());
                    System.out.println("Informações sobre a vistoria do Veículo:");
                    if (j.getStatus() == 3) {
                        System.out.println("Condição do Veículo: Danificado");
                    } else if (j.getStatus() == 5) {
                        System.out.println("Condição do Veículo: Problemas Mecânicos");
                    } else if (j.getStatus() == 8) {
                        System.out.println("Condição do Veículo: em Bom estado");
                    } else if (j.getStatus() == 10) {
                        System.out.println("Condição do Veículo: Em perfeito estado.");
                    }
                    System.out.println("Opcionais:");
                    System.out.println("Bebe conforto R$: " + j.getBBconforto());
                    System.out.println("Cadeirinha R$:" + j.getCadeirinha());
                    System.out.println("Assento de elevação R$: " + j.getAssento());
                    System.out.println("GPS R$: " + j.getGps());
                    System.out.println("--------------------------------------------------------\n\n");
                    double total = (j.ValorAluguel() + j.getBBconforto() + j.getCadeirinha() + j.getAssento()
                            + j.getGps());
                    System.out.println("Valor total R$: " + total);
                    System.out.println("Deseja realizar o Pagamento?\n 1- Sim\t\t 2- Não");
                    num = entrada.nextInt();
                    if (num == 1) {
                        System.out.println("Pagamento:");
                        double valor = entrada.nextDouble();
                        if (valor < total) {
                            System.out.println("Por favor valor insuficiente");
                        } else if (valor == total) {
                            System.out.println("Pagamento efetuado com sucesso!");
                            setFaturamento(total);
                        } else if (valor > total) {
                            double ntotal = (valor - total);
                            System.out.println("Troco R$:" + ntotal);
                        }

                    }
                } else if (j.getDev() == false) {
                    System.out.println("Devolva o Veículo antes de vir checar a fatura");
                    break;
                }
            } else if (placa != j.getPlaca()) {
                System.out.println("Veículo não encontrado!");
                return;
            }
        }

    }

    public void condicoes() {
        System.out.println("-----------------------CONDIÇÃO DO VEÍCULO-----------------------");
        String placa, data;
        int op = 0;
        int value;
        System.out.println(
                "--------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Digite a placa do Veículo a ser Inspecionado:");
        placa = entrada.next();
        for (int i = 0; i < locacao.size(); i++) {
            Carros j = locacao.get(i);
            if (j.getPlaca().equals(placa)) {
                System.out.println("OBS: Todo Veículo sai da loCAR em perfeitas condições!");
                System.out.println("Digite a condição do veículo:");
                System.out.println(
                        "1- Danificado \t\t 2 - Problemas mecanicos\n\n 3 - Estado bom\t\t 4 - retornar ao menu anterior.");
                System.out.println("Opção:");
                op = entrada.nextInt();
                if (op == 1) {
                    System.out.println("Informe a data da vistoria:");
                    data = entrada.next();
                    j.setDiaVistoria(data);
                    System.out.println(j);
                    value = (j.getStatus() - 7);
                    j.setStatus(value);
                    locacao.set(i, j);
                    System.out.println("Vistoria efetuada com sucesso!\n\nEstado do veículo é: Danificado");
                } else if (op == 2) {
                    System.out.println("Informe a data da vistoria:");
                    data = entrada.next();
                    j.setDiaVistoria(data);
                    System.out.println(j);
                    value = (j.getStatus() - 5);
                    j.setStatus(value);
                    locacao.set(i, j);
                    System.out
                            .println("Vistoria efetuada com sucesso!\n\nEstado do veículo é: Com problemas mecanicos.");
                } else if (op == 3) {
                    System.out.println("Informe a data da vistoria:");
                    data = entrada.next();
                    j.setDiaVistoria(data);
                    System.out.println(j);
                    value = (j.getStatus() - 2);
                    j.setStatus(value);
                    locacao.set(i, j);
                    System.out.println("Vistoria efetuada com sucesso!\n\nEstado do veículo é: Em bom estado");
                } else if (op != 1 && op != 2 && op != 3) {
                    return;
                }

            }
        }
    }
    public double valores(){
        double x = 0.0;
        x += this.getFaturamento();
        return x;
    }

    public void devolucao() {
        int i = 0;
        String placa;
        double km;
        System.out.println("Digite a placa do veículo a ser Devolvido:");
        placa = entrada.next();
        for (i = 0; i < locacao.size(); i++) {
            Carros j = locacao.get(i);
            if (j.getPlaca().equals(placa)) {
                try {
                    System.out.println("Km do Veículo antes de ser locado: " + j.getKm() + " Km");
                    System.out.println("Km atual do veículo:");
                    km = entrada.nextDouble();
                    j.setKm(km);
                    j.setDev(true);
                    System.out.println("Devolução efetuada com sucesso");
                    locacao.set(i, j);
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }

            } else if (j.getPlaca() != placa) {
                System.out.println("Veiculo não encontrado");
            }
        }
    }
}// Fim da Classe Cadastro de Veiculos.
