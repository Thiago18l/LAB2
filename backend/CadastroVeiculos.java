import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVeiculos implements Locação {

    ArrayList<Carros> locacao = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    public CadastroVeiculos() {

    }
    public CadastroVeiculos(String placa){

    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    @Override
    public double klometragem(String placa) {
        for (int i = 0; i < locacao.size(); i++) {
            Object j = locacao.get(i);
            if (j instanceof Hatch) {
                if (j.getPlaca().equals(placa)) {
                    return j.getKm();
                }
            } else if (j instanceof Sedan) {
                if (j.getPlaca().equals(placa)) {
                    return j.getKm();
                }
            } else if (j instanceof Suv) {
                if (j.getPlaca().equals(placa)) {
                    return j.getKm();
                }
            } else if (j instanceof Minivan) {
                if (j.getPlaca().equals(placa)) {
                    return j.getKm();
                }
            }
        }
        return 0;
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
        placa = entrada.nextLine();
        ((Hatch) hatch[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.nextLine();
        ((Hatch) hatch[i]).setData(data);
        System.out.println("Km atual do Veículo:");
        km = Double.parseDouble(entrada.nextLine());
        ((Hatch) hatch[i]).setKm(km);
        try {
            System.out.println("Quantidade de dias:");
            dias = Integer.parseInt(entrada.nextLine());
            ((Hatch) hatch[i]).setDias(dias);
        } catch (NumberFormatException e) {
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.nextLine();
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
        placa = entrada.nextLine();
        ((Sedan) sedan[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.nextLine();
        ((Sedan) sedan[i]).setData(data);
        System.out.println("Kilometragem do Carro:");
        km = Double.parseDouble(entrada.nextLine());
        ((Sedan) sedan[i]).setKm(km);
        try {
            System.out.println("Quantidade de dias:");
            dias = Integer.parseInt(entrada.nextLine());
            ((Sedan) sedan[i]).setDias(dias);
        } catch (NumberFormatException e) {
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.nextLine();
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
        placa = entrada.nextLine();
        ((Suv) suvs[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.nextLine();
        ((Suv) suvs[i]).setData(data);
        System.out.println("Digite a Kilometragem do Veículo");
        km = Double.parseDouble(entrada.nextLine());
        ((Suv) suvs[i]).setKm(km);
        try {
            System.out.println("Quantidade de dias:");
            dias = Integer.parseInt(entrada.nextLine());
            ((Suv) suvs[i]).setDias(dias);
        } catch (NumberFormatException e) {
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.nextLine();
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
        placa = entrada.nextLine();
        ((Minivan) minivans[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.nextLine();
        ((Minivan) minivans[i]).setData(data);
        System.out.println("KM Atual do Veículo:");
        km = Double.parseDouble(entrada.nextLine());
        ((Minivan) minivans[i]).setKm(km);
        try {
            System.out.println("Quantidade de dias:");
            dias = Integer.parseInt(entrada.nextLine());
            ((Minivan) minivans[i]).setDias(dias);
        } catch (NumberFormatException e) {
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.nextLine();
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

    public void removerVeiculo() {
        String placa;
        System.out.println(
                "1-Remoção de Veiculo Hatch\t\t 2 - Remoção de Veículo Sedan\n\n3- Remoção de Veículo SUV\t\t 4 - Remoção de Veículo Minivan");
        int num = entrada.nextInt();
        switch (num) {
        case 1:
            System.out.println("Digite a placa do Veiculo:");
            placa = entrada.nextLine();
            for (int i = 0; i < locacao.size(); i++) {
                Hatch j = locacao.get(i);
                if (j.getPlaca().equals(placa)) {
                    locacao.remove(j);
                    System.out.println("Veiculo removido com Sucesso");
                } else {
                    System.out.println("Veículo Não encontrado");
                }
            }
            break;
        case 2:
            System.out.println("Digite a placa do Veiculo:");
            placa = entrada.nextLine();
            for (int i = 0; i < locacao.size(); i++) {
                Sedan j = locacao.get(i);
                if (j.getPlaca().equals(placa)) {
                    locacao.remove(j);
                    System.out.println("Veiculo removido com Sucesso");
                } else {
                    System.out.println("Veículo Não encontrado");
                }
            }
            break;
        case 3:
            System.out.println("Digite a placa do Veiculo:");
            placa = entrada.nextLine();
            for (int i = 0; i < locacao.size(); i++) {
                Suv j = locacao.get(i);
                if (j.getPlaca().equals(placa)) {
                    locacao.remove(j);
                    System.out.println("Veiculo removido com Sucesso");
                } else {
                    System.out.println("Veículo Não encontrado");
                }
            }
            break;
        case 4:
            System.out.println("Digite a placa do Veiculo:");
            placa = entrada.nextLine();
            for (int i = 0; i < locacao.size(); i++) {
                Minivan j = locacao.get(i);
                if (j.getPlaca().equals(placa)) {
                    locacao.remove(j);
                    System.out.println("Veiculo removido com Sucesso");
                } else {
                    System.out.println("Veículo Não encontrado");
                }
            }
            break;
        }
    }// Fim do metodo remover Veiculos

    public void devolucao(String placa) {
        System.out.println("1- Hatch\t\t 2- Sedan\n\n3- SUV\t\t 4- Minivan");
        int op = entrada.nextInt();
        switch (op) {
        case 1:
            for (int i = 0; i < locacao.size(); i++) {
                Hatch hatch = (Hatch) locacao.get(i);
                if (hatch instanceof Hatch){
                    if (hacth.getPlaca().equals(placa)){
                        System.out.println("Deseja efetuar a Devolução do Veículo?");
                        System.out.println("1- Sim\t\t 2- Não");
                        int num = entrada.nextInt();
                        if (num == 1) {
                            hatch.setDev(true);
                            locacao.set(i, hatch);
                        } else if (num != 1) {
                            return;
                        }
                    }
                }
            }
            break;
        case 2:
            for (int i = 0; i < locacao.size(); i++) {
                Sedan sedan =(Sedan) locacao.get(i);
                if (sedan instanceof Sedan) {
                    if (sedan.getPlaca().equals(placa)) {
                        System.out.println("Deseja efetuar a Devolução do Veículo?");
                        System.out.println("1- Sim\t\t 2- Não");
                        int num = entrada.nextInt();
                        if (num == 1) {
                            sedan.setDev(true);
                            locacao.set(i, sedan);
                        } else if (num != 1) {
                            return;
                        }
                    }
                }
            }
            break;
        case 3:
            for (int i = 0; i < locacao.size(); i++) {
                Suv suv = (Suv) locacao.get(i);
                if (suv instanceof Suv) {
                    if (suv.getPlaca().equals(placa)) {
                        System.out.println("Deseja efetuar a Devolução do Veículo?");
                        System.out.println("1- Sim\t\t 2- Não");
                        int num = entrada.nextInt();
                        if (num == 1) {
                            suv.setDev(true);
                            locacao.set(i, suv);
                        } else if (num != 1) {
                            return;
                        }
                    }
                }
            }
            break;
        case 4:
            for (int i = 0; i < locacao.size(); i++) {
                Minivan minivan = (Minivan) locacao.get(i);
                if (minivan instanceof Minivan) {
                    if (minivan.getPlaca().equals(placa)) {
                        System.out.println("Deseja efetuar a Devolução do Veículo?");
                        System.out.println("1- Sim\t\t 2- Não");
                        int num = entrada.nextInt();
                        if (num == 1) {
                            minivan.setDev(true);
                            locacao.set(i, minivan);
                        } else if (num != 1) {
                            return;
                        }
                    }
                }
            }
            break;
        }// Fim do switch;

    }
}// Fim da Classe Cadastro de Veiculos.