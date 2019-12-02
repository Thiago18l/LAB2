
public class Minivan extends Carros implements Locação{

    public Minivan(String placa, int dias){
        super(placa, dias);
    }
    @Override
    public double ValorAluguel() {
        double value = (this.valor*0.25);
        double res = (value*getDias());
        return res;
    }
    @Override
    public String toString() {
        return "Minivan\nPlaca:"+this.getPlaca()+"\nQuantidade de Dias:"+this.getDias();
    }
}