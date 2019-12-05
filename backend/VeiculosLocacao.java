
public class VeiculosLocacao {

    protected String data;
    protected int dias;
    protected double valor = 75.00;
    protected String placa;
    protected String motivo;
    protected String diaVistoria;


    public VeiculosLocacao() {

    }

    public VeiculosLocacao(String placa, String data, String motivo) {
        setData(data);
        setPlaca(placa);
        setMotivo(motivo);

    }
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    public void setDiaVistoria(String diaVistoria) {
        this.diaVistoria = diaVistoria;
    }
    public String getDiaVistoria() {
        return diaVistoria;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getMotivo() {
        return this.motivo;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return this.dias;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }

    @Override
    public String toString() {
        return ("Placa do Veículo:" + this.getPlaca() + "\n Data da locacao:" + this.getData() + "\n");
    }

}