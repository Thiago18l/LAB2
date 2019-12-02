
public class Sedan extends Carros implements Locação{

    public Sedan(){

    }
    public Sedan (String placa, int dias){
        super(placa, dias);
    }
    @Override
    public double ValorAluguel() {
            double value = (this.valor*0.10);
            double res = (value*this.getDias());
        return res;
    }
    @Override
    public String toString() {
        return "Sedan\nPlaca:"+this.getPlaca();
    }
}