

public class Hatch extends Carros implements Locação{

    public Hatch(String placa, int dias){
        super(placa, dias);
    }

    @Override
    public double ValorAluguel() {
           double price =  (this.valor*this.dias); 
        return price;
    }
    @Override
    public String toString() {
        return "Carro Hatch\nQuantidade de dias:"+this.dias;
    }

}