
public class Hatch extends Carros implements Locação {

    protected int quantidade = 0;

    public int getQuantidade() {
        return this.quantidade;
    }

    public Hatch() {
        this.quantidade++;
    }

    public Hatch(String placa, int dias, String motivo) {
        super(placa, dias, motivo);
    }

    @Override
    public void opcionais() {
        if (this.getBBconforto() != 0) {
            System.out.println("Bebe conforto R$:" + this.getBBconforto());
        }
        if (this.getCadeirinha() != 0) {
            System.out.println("Cadeirinha R$:" + this.getCadeirinha());
        }
        if (this.getAssento() != 0) {
            System.out.println("Assendo de Elevação R$:" + this.getAssento());
        }
        if (this.getGps() != 0) {
            System.out.println("GPS R$:" + this.getGps());
        }
    }

    @Override
    public double ValorAluguel() {
        double price = (this.valor * this.dias);
        return price;
    }
    

    @Override
    public String toString() {
        return "Carro Hatch\nQuantidade de dias:" + this.getDias() + "\nPlaca:" + this.getPlaca() + "\nMotivo:"
                + this.getMotivo() + "\nData:" + this.getData();
                
    }

}