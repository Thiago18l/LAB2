public class Suv extends AluguelAut{

    private double vdiaria = 115.00;

    public Suv(){
        super();
    }

    public Suv(String data, String hora, String destino, String finalidade, String placa, int quantidadedeDias, int condicao){
        super(data,hora,destino,finalidade, placa, quantidadedeDias);
    }

    public void setVdiaria(double vdiaria){
        this.vdiaria = vdiaria;
    }
    public double getVdiaria(){
        return this.vdiaria;
    }
        

}