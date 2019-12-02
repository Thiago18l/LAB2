

public class VeiculosLocacao {

    protected String data;
    protected int dias;
    protected double valor = 75.00;
    protected String placa;

    public VeiculosLocacao(){

    }
    public VeiculosLocacao(String placa, String data){
        setData(data);
        setPlaca(placa);

    }
    public void setDias(int dias){
        this.dias = dias;
    }
    public int getDias(){
        return this.dias;
    }
    public void setData(String data){
        this.data = data;
    }
    public String getData(){
        return this.data;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getPlaca(){
        return this.placa;
    }
    @Override
    public String toString() {
        return ("Placa do Veículo:"+this.placa+"\n Data da locacao:"+this.data);
    }




}