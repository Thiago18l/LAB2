import java.util.ArrayList;
import java.util.Scanner;

public class CadastroVeiculos {

    ArrayList <Carros> locacao = new ArrayList<>();
    Scanner entrada = new Scanner(System.in);

    
    public CadastroVeiculos(){

    }

    public ArrayList getVeiculosLocacao(){
        return this.locacao.size();
    }

    public void cadHatch(){
        int i =0;
        String placa, data, motivo;
        int dias;
        Hatch [] hatch = new Hatch[i+1];
        hatch[i] = new Hatch();
            System.out.println("----------------------Veículo Hatch-----------------------");
                System.out.println("Placa do veículo:");
                placa = entrada.nextLine();
                ((Hatch) hatch[i]).setPlaca(placa);
                System.out.println("Data da locação:");
                data = entrada.nextLine();
                ((Hatch)hatch[i]).setData(data);
                try{
                    System.out.println("Quantidade de dias:");
                dias = Integer.parseInt(entrada.nextLine());
                ((Hatch)hatch[i]).setDias(dias);
                }
                catch(NumberFormatException e){
                    System.out.println("Apenas números");
                }
                System.out.println("Motivo da locação:");
                motivo = entrada.nextLine();
                ((Hatch)hatch[i]).setMotivo(motivo);
                locacao.add(hatch[i]);
                for (Carros j : locacao){
                    System.out.println(j);
                }
    }
    public void cadSedan(){
        int i=0;
        Sedan[] sedan = new Sedan[i+1];
        senda[i] = new Sedan();
        System.out.println("------------------------Cadastro de Sedan-----------------------");
        System.out.println("Placa do veículo:");
        placa = entrada.nextLine();
        ((Sedan) sedan[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.nextLine();
        ((Sedan)sedan[i]).setData(data);
        try{
            System.out.println("Quantidade de dias:");
        dias = Integer.parseInt(entrada.nextLine());
        ((Sedan)sedan[i]).setDias(dias);
        }
        catch(NumberFormatException e){
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.nextLine();
        ((Sedan)sedan[i]).setMotivo(motivo);
        locacao.add(sedan[i]);
        for (Carros j : locacao){
            System.out.println(j);
        }
    }

    public void cadSuv(){
        int i =0;
        Suv[] suvs = new Suv[i+1];
        suvs[i] = new Suv();
        System.out.println("Placa do veículo:");
        placa = entrada.nextLine();
        ((Suv) suvs[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.nextLine();
        ((Suv)suvs[i]).setData(data);
        try{
            System.out.println("Quantidade de dias:");
        dias = Integer.parseInt(entrada.nextLine());
        ((Suv)suvs[i]).setDias(dias);
        }
        catch(NumberFormatException e){
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.nextLine();
        ((Suv)suvs[i]).setMotivo(motivo);
        locacao.add(suvs[i]);
        for (Carros j : locacao){
            System.out.println(j);
        }
    }
    public void cadMinivan(){
        int i = 0;
        Minivan[] minivans = new Minivan[i+1];
        minivans[i] = new Minivan();
        System.out.println("Placa do veículo:");
        placa = entrada.nextLine();
        ((Minivan) minivans[i]).setPlaca(placa);
        System.out.println("Data da locação:");
        data = entrada.nextLine();
        ((Minivan)minivans[i]).setData(data);
        try{
            System.out.println("Quantidade de dias:");
        dias = Integer.parseInt(entrada.nextLine());
        ((Minivan)minivans[i]).setDias(dias);
        }
        catch(NumberFormatException e){
            System.out.println("Apenas números");
        }
        System.out.println("Motivo da locação:");
        motivo = entrada.nextLine();
        ((Minivan)minivans[i]).setMotivo(motivo);
        locacao.add(minivans[i]);
        for (Carros j : locacao){
            System.out.println(j);
        }
    }


}