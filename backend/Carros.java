
public class Carros extends VeiculosLocacao implements Locação {
    protected int frota;

    public Carros() {

    }
    public Carros(int frota){
        setFrota(frota);
    }

    public void setFrota(int frota) {
        this.frota = frota;
    }

    public int getFrota() {
        return this.frota;
    }

}