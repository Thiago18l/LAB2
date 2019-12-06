
public class Suv extends Carros implements Locação {

    private int quantidade = 0;

    public int getQuantidade() {
        return this.quantidade;
    }

    public Suv() {
        this.quantidade++;
    }

    public Suv(String placa, int dias) {
        super();
    }

    @Override
    public double ValorAluguel() {
        double value = (this.getValor()* 1.15);
        double res = (value * getDias());
        return res;
    }

    @Override
    public String toString() {
        return "Carro Suv\nQuantidade de dias:" + this.getDias() + "\nPlaca:" + this.getPlaca() + "\nMotivo:"
        + this.getMotivo() + "\nData:" + this.getData();
    }
}