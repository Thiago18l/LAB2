
public class Minivan extends Carros implements Locação{

    private int quantidade =0;

    public int getQuantidade(){
        return this.quantidade;
    }

    public Minivan(){
        this.quantidade++;
    }

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