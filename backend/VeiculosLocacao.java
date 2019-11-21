import java.util.ArrayList;

public class VeiculosLocacao {

    protected String data;
    protected double valor;
    protected Cliente clientes;
    protected String placa;

    public VeiculosLocacao(String placa, String data){
        setData(data);
        setPlaca(placa);
        ArrayList <Cliente> clientes = new ArrayList<>();

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
    public void Addcliente(){
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return ("Placa do Veículo:"+this.placa+"\n Data da locacao:"+this.data);
    }




}