
public class Suv extends Carros implements Locação{

    private int quantidade = 0;

    public int getQuantidade(){
        return this.quantidade;
    }
    public Suv(){
        this.quantidade++;
    }

    public Suv(String placa, int dias){
        super(placa, dias);
    }
    @Override
    public double ValorAluguel() {
        double value = (this.valor*0.15);
        double res = (value*getDias());
        return res;
    }
    @Override
    public String toString() {
        return "Suv\nPlaca:"+this.getPlaca()+"\nQuantidade de dias:"+this.getDias();
    }
}