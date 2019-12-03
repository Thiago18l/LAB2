
public class Carros extends VeiculosLocacao implements Locação {
    private Hatch hatch;
    private Sedan sedan;
    private Minivan minivan;
    private Suv suv;
    public Carros() {

    }

    public void tamFrota(){
        int total = (hatch.getQuantidade()+sedan.getQuantidade()+suv.getQuantidade()+minivan.getQuantidade());
        System.out.println("O tamanho da frota é:"+total+" de Veículos");
    }
    @Override
    public String toString() {
        return "Carro\nPlaca:"+this.getPlaca()+"\nMotivo:"+this.getMotivo()+"\nData:"+this.getData()+"\nDias locados:"+this.getDias();
    }
}