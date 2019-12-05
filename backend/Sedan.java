
public class Sedan extends Carros implements Locação{

    private int quantidade=0;

    public int getQuantidade(){
        return this.quantidade;
    }
    public Sedan(){
        this.quantidade++;
    }
    public Sedan (String placa, int dias){
        super(placa, dias);
    }
 

    @Override
    public double ValorAluguel() {
            double value = (this.getValor()*1.10);
            double res = (value*this.getDias());
        return res;
    }
    @Override
    public String toString() {
        return "Carro Sedan\nQuantidade de dias:" + this.getDias() + "\nPlaca:" + this.getPlaca() + "\nMotivo:"
        + this.getMotivo() + "\nData:" + this.getData();
    }
}