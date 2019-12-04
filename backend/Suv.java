
public class Suv extends Carros implements Locação {

    private int quantidade = 0;

    public int getQuantidade() {
        return this.quantidade;
    }

    public Suv() {
        this.quantidade++;
    }

    public Suv(String placa, int dias) {
        super(placa, dias);
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
        double value = (this.valor * 0.15);
        double res = (value * getDias());
        return res;
    }

    @Override
    public String toString() {
        return "Carro Suv\nQuantidade de dias:" + this.getDias() + "\nPlaca:" + this.getPlaca() + "\nMotivo:"
        + this.getMotivo() + "\nData:" + this.getData();
    }
}