
public class Minivan extends Carros implements Locação {

    private int quantidade = 0;

    public int getQuantidade() {
        return this.quantidade;
    }

    public Minivan() {
        this.quantidade++;
    }

    public Minivan(String placa, int dias) {
        super(placa, dias);
    }

    @Override
    public double ValorAluguel() {
        double value = (this.getValor()* 1.25);
        double res = (value * getDias());
        return res;
    }

    @Override
    public String toString() {
        return "Minivan\nQuantidade de dias:" + this.getDias() + "\nPlaca:" + this.getPlaca() + "\nMotivo:"
                + this.getMotivo() + "\nData:" + this.getData();
    }
}